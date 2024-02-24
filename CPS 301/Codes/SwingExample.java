import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

// import javax.swing*; 

public class SwingExample {

    public static void main(String[] args) {
        // Create a JFrame (the main window)
        JFrame frame = new JFrame("Swing Example");

        // Create a JPanel to hold components
        JPanel panel = new JPanel();

        // Create a JButton
        JButton button = new JButton("Click Me!");

        // Add the button to the panel
        panel.add(button);

        // Set the content pane of the frame to the panel
        frame.setContentPane(panel);

        // Set the size and make the frame visible
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
