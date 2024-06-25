import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ground extends JPanel implements ActionListener {
    Border border;
    Timer timer1;
    int width = 500;
    int height = 400;
    int x, y;
    Random random = new Random();
    int xvelocity = random.nextInt(10) + 1;
    int yvelocity = random.nextInt(10) + 1;

    ground() {
        border = BorderFactory.createLineBorder(Color.black, 1);
        timer1 = new Timer(1, this);
        this.setPreferredSize(new Dimension(width, height));
        this.setBorder(border);
    }

    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(Color.pink);
        g2D.fillOval(x, y, 100, 100);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (x >= width - 100 || x < 0) {
            xvelocity = xvelocity * -1;
        }
        if (y >= height - 100 || y < 0) {
            yvelocity = yvelocity * -1;
        }
        if (timer1.isRunning()) {
            x = x + xvelocity;
            y = y + yvelocity;
            repaint();
        }
    }

    public void start() {
        timer1.start();
    }

    public void stop() {
        timer1.stop();
    }
}
