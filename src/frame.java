import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frame extends JFrame implements ActionListener {
    panel panel;
    ground ground;

    frame() {
        panel = new panel();
        panel.button1.addActionListener(this);
        panel.button2.addActionListener(this);
        ground = new ground();
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout(1, 1));
        this.add(panel, BorderLayout.NORTH);
        this.add(ground, BorderLayout.SOUTH);
        this.pack();
        this.setResizable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == panel.button1) {
            ground.start();
        }
        if (e.getSource() == panel.button2) {
            ground.stop();
        }
    }
}
