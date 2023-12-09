package sprites;

import javax.swing.ImageIcon;

public class Enemy extends sprites {

    public Enemy(int x , int speed ){
        this.x = x ;
        this.speed = speed;
        y=90;
        w=150;
        h=200;
        Image = new ImageIcon("D:/Web_development/GameDev/Game-Dev/src/Images/spider.gif");
    }

    public void move(){
        if (y>900){
            y=0;
        }
        y += speed;
    }

}
