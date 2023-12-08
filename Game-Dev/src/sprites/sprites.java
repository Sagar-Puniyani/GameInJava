package sprites;

import javax.swing.ImageIcon;
import java.awt.Graphics;

public abstract class sprites {
    int speed;
    int x;
    int y;
    int h;
    int w;
    
    ImageIcon Image;

    public void draw (Graphics pen ){
        pen.drawImage(Image.getImage(), x, y, w, h, null);
    }

}
