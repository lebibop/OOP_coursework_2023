package Hotel.hibernate;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondFrame {
    private JFrame f = new JFrame("Second");
    private JButton test = new JButton("OK");

    public SecondFrame() {


        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(500,500);
        f.setVisible(true);
        f.getContentPane().add(test);
        test.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog (test, "Проверка нажатия на кнопку");

            }
        });
    }
}
