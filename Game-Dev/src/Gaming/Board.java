package Gaming;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import sprites.Player;
import sprites.Enemy;
import javax.swing.Timer;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

public class Board extends JPanel {
    BufferedImage backGroundImage;
    Player player;
    Timer timer;
    Enemy enemies[] = new Enemy[4];
    public Board(){
        this.setSize(1500 , 800);
        LoadImageBackground();
        player = new Player();
        LoadEnemies();
        GameLoop();
        setFocusable(true);
        bindEvents();
    }



    private void LoadEnemies(){
        int x = 250;
        int gap = 350;
        int speed = 4;
        int speedeven = 5;
        int speedodd = 2;
        for (int i=0 ; i<enemies.length ; i++ ){
            enemies[i] = new Enemy(x , speed );
            x  += gap;
            if ( i % 2 == 0 ){
                speed += speedeven;
            }
            else {
                speed += speedodd;
            }
        }
    }

    private void bindEvents() {
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                // Handle key typed event
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_RIGHT){
                    player.setSpeed(10);
                }
                else if (e.getKeyCode() == KeyEvent.VK_LEFT){
                    player.setSpeed(-10);
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                player.setSpeed(0);
            }
        });
    }

    private void GameLoop(){
        timer = new Timer(50 , (e)-> repaint());
        timer.start();
    }



    private void LoadImageBackground(){
        try {
            backGroundImage = ImageIO.read(new File("Game-Dev/src/Images//Game_Background_188.png"));
        } catch (IOException e) {
            System.out.println("BackGround Image Not Found .....");
            System.exit(1);
            e.printStackTrace();
        }
    }

    private void printEnemies(Graphics pen ){
        for (Enemy enemy : enemies){
            enemy.draw(pen);
            enemy.move();
        }
    }

    @Override
    public void paintComponent(Graphics pen){
        super.paintComponent(pen);
        // All the Printing logic is here 
        pen.drawImage(backGroundImage ,0,0,1500,950,null);
        player.draw(pen);
        player.move();
        printEnemies(pen);
        
    }
}
