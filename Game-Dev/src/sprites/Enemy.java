package sprites;

import javax.swing.ImageIcon;
import java.awt.Graphics;

public class Enemy {
    int x;

    int h;
    int w;
    int y;

    ImageIcon EnemyImage;
    public Enemy(){
        x=600;
        y=100;
        w=100;
        h=100;
        EnemyImage = new ImageIcon("D:/Web_development/GameDev/Game-Dev/src/Images/spider.gif");
    }

    public void draw(Graphics pen ){
        pen.drawImage(EnemyImage.getImage(),x,y,w,h,null);
    }

}
