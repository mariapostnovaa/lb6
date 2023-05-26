package lb6;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JLabel;

class Circle extends JLabel implements Runnable {
    private Color color;
    private int x, y, radius;

    public Circle(Color color, int x, int y, int radius) {
        this.color = color;
        this.x = x;
        this.y = y;
        this.radius = radius;
        setBounds(x - radius, y - radius, radius * 2, radius * 2);
    }

    public void paintComponent(Graphics g) {
        g.setColor(color);
        g.fillOval(0, 0, radius * 2, radius * 2);
    }

    public void run() {
        try {
            while (true) {
                x += 5;
                y += 5;
                if (x > getParent().getWidth() - radius || x < radius) {
                    x -= 5;
                }
                if (y > getParent().getHeight() - radius || y < radius) {
                    y -= 5;
                }
                setLocation(x - radius, y - radius);
                Thread.sleep(50);
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}