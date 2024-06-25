import javax.swing.*;
import java.awt.*;

public class button extends JButton {
    button(String text) {
        this.setText(text);
        this.setFocusable(false);
        this.setBackground(Color.white);
        this.setFont(new Font("Simplified Arabic Fixed", Font.BOLD, 20));
        this.setPreferredSize(new Dimension(150, 50));
    }
}
