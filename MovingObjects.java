package lb6;
import javax.swing.*;
import java.awt.Color;

public class MovingObjects extends JFrame {
    private JPanel panel;
    private Circle circle1, circle2, circle3;

    public MovingObjects() {
        setTitle("Moving Objects");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);

        circle1 = new Circle(Color.RED, 50, 50, 50);
        circle2 = new Circle(Color.BLUE, 150, 150, 50);
        circle3 = new Circle(Color.GREEN, 250, 250, 50);

        panel.add(circle1);
        panel.add(circle2);
        panel.add(circle3);

        add(panel);
        setVisible(true);
        
        Thread thread1 = new Thread(circle1);
        thread1.start();

        Thread thread2 = new Thread(circle2);
        thread2.start();

        Thread thread3 = new Thread(circle3);
        thread3.start();
    }

  
}