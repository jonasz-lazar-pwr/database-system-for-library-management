import java.awt.*;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class MyButton extends JButton {
    public MyButton(String text) {
        this.setText(text);
        this.setPreferredSize(new Dimension(200, 55));
        this.setFocusPainted(false);
        this.setContentAreaFilled(true);
        this.setHorizontalTextPosition(0);
        this.setVerticalTextPosition(0);
        this.setFont(new Font("Roboto", Font.BOLD, 16));
        this.setForeground(Color.LIGHT_GRAY);
        this.setBackground(new Color(55, 88, 159));
        this.setOpaque(true);
        this.setBorder(new LineBorder(Color.GRAY));
    }
}