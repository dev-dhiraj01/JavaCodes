import javax.swing.*;
import java.awt.event.*;


public class DoorBell {

    public static void main(String[] args) {
       final JFrame f = new JFrame("DoorBell");

        f.setSize(400,300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);

        JButton b = new JButton("Click");
        b.setBounds(150,100,100,30);

        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(f, "Open The Door...!");
            }
        });

        f.setVisible(true);
    }
}