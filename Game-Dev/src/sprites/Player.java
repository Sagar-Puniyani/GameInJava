package sprites;
import javax.swing.ImageIcon;
import java.awt.Graphics;

public class Player {
    int x;
    int h;
    int w;
    int y;

    ImageIcon playerImage;
    public Player(){
        w=200;
        h=00;
        x=100;
        y=500;
        playerImage = new ImageIcon("D:/Web_development/GameDev/Game-Dev/src/Images/player.gif");
    }

    public void draw(Graphics pen ){
        pen.drawImage(playerImage.getImage(),x,y,w,h,null);
    }
}
