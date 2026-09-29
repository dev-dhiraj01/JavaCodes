import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class p10 extends JFrame implements MouseListener, MouseMotionListener {

    // Label to display event names
    private JLabel eventLabel;

    public p10() {
        // Set up the frame
        setTitle("Mouse Event Handler");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // Create the label and add it to the center of the window
        eventLabel = new JLabel("", SwingConstants.CENTER);
        eventLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        add(eventLabel, BorderLayout.CENTER);

        // Add mouse listeners to the frame
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    // MouseListener methods
    @Override
    public void mouseClicked(MouseEvent e) {
        eventLabel.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        eventLabel.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        eventLabel.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        eventLabel.setText("Mouse Entered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        eventLabel.setText("Mouse Exited");
    }

    // MouseMotionListener methods
    @Override
    public void mouseDragged(MouseEvent e) {
        eventLabel.setText("Mouse Dragged");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        eventLabel.setText("Mouse Moved");
    }

    public static void main(String[] args) {
        // Run the GUI in the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            p10 frame = new p10();
            frame.setVisible(true);
        });
    }
}
