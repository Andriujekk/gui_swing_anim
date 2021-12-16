package figury;

import java.awt.*;
import java.awt.geom.*;


public class Kwadrat extends Figura {

    public Kwadrat(Graphics2D buf, int del, int w, int h) {
        super(buf, del, w, h);
        shape = new Rectangle2D.Double(0, 0, 10, 10);
        aft = new AffineTransform();
        area = new Area(shape);
    }
}