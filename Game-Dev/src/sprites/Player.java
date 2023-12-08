package sprites;

import javax.swing.ImageIcon;

public class Player {
    int x;
    int y;
    int h;
    int w;

    ImageIcon playerImage;
    public Player(){
        w=100;
        h=100;
        x=100;
        y=700;
        playerImage = new ImageIcon("D:/Web_development/GameDev/Game-Dev/src/Images/player.gif");
    }
}
