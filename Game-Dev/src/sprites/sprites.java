package sprites;

import javax.swing.ImageIcon;
import java.awt.Graphics;

public abstract class sprites {
    int speed;
    public int x;
    public int y;
    public int h;
    public int w;
    
    ImageIcon Image;

    public void draw (Graphics pen ){
        pen.drawImage(Image.getImage(), x, y, w, h, null);
    }

}
