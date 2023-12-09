package sprites;

import javax.swing.ImageIcon;

public class Player extends sprites {

    public Player(){
        w=200;
        h=200;
        x=100;
        y=500;
        Image = new ImageIcon("D:/Web_development/GameDev/Game-Dev/src/Images/player.gif");
    }
    public boolean OutofScreen = false;
    public void setSpeed(int speed ){
        this.speed = speed;
    }

    public void move(){
        if (x > 1400){
            OutofScreen = true;
            x = 0;
        }
        else if (x <= 0 ){
            x = 1380;
        }
        x += speed;
    }

}
