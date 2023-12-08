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
    }

    private void LoadEnemies(){
        int x = 500;
        int gap = 250;
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
        printEnemies(pen);
        
    }
}
