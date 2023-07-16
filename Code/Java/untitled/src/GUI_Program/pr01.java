package GUI_Program;

import javax.swing.*;
import java.awt.*;

public class pr01 {
    public static void main(String[] args) {
        ImageIcon image= new ImageIcon("logo.jpeg");

        JLabel label=new JLabel();
        label.setText("Bro, do you even code ?");
        label.setIcon(image);

        JFrame frame =new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.add(label);
    }
}
