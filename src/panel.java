import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class panel extends JPanel {
    Border border;
    button button1, button2;

    panel() {
        button1 = new button("START");
        button2 = new button("STOP");
        border = BorderFactory.createLineBorder(Color.black, 1);
        this.setPreferredSize(new Dimension(500, 100));
        this.setBorder(border);
        this.add(button1);
        this.add(button2);
    }
}
