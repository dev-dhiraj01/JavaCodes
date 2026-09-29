import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class p9 extends JFrame implements ActionListener {

    JLabel signalLabel;
    JButton redButton, yellowButton, greenButton;

    public p9() {
        setTitle("Traffic Signal Simulator");
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Label to show signal message
        signalLabel = new JLabel("Press a Button to Show Signal");
        signalLabel.setFont(new Font("Arial", Font.BOLD, 16));

        // Buttons for signals
        redButton = new JButton("RED");
        yellowButton = new JButton("YELLOW");
        greenButton = new JButton("GREEN");

        // Add action listeners
        redButton.addActionListener(this);
        yellowButton.addActionListener(this);
        greenButton.addActionListener(this);

        // Add components to Frame
        add(signalLabel);
        add(redButton);
        add(yellowButton);
        add(greenButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            signalLabel.setText("STOP - RED Light");
            signalLabel.setForeground(Color.RED);
        } else if (e.getSource() == yellowButton) {
            signalLabel.setText("READY - YELLOW Light");
            signalLabel.setForeground(Color.ORANGE);
        } else if (e.getSource() == greenButton) {
            signalLabel.setText("GO - GREEN Light");
            signalLabel.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new p9();
    }
}
