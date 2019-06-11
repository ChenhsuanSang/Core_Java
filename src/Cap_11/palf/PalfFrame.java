package Cap_11.palf;

import javax.swing.*;
import java.awt.*;

/**
 * A frame with a button panel for changing look-and-feel.
 */
public class PalfFrame extends JFrame{
    private JPanel buttonPanel;

    public PalfFrame() {
        buttonPanel = new JPanel();

        UIManager.LookAndFeelInfo[] infos = UIManager.getInstalledLookAndFeels();
        for(UIManager.LookAndFeelInfo info : infos) {
            makeButon(info.getName(), info.getClassName());
        }

        add(buttonPanel);
        pack();
    }

    /**
     * Makes a button to change the pluggable look-and-feel.
     * @param name the button name.
     * @param className the name of the look-and-feel class.
     */
    private void makeButon(String name, String className)   {
        // add button to panel
        JButton button = new JButton(name);
        buttonPanel.add(button);

        // set button action
        button.addActionListener(event ->
        {
            // button action: switch to the new LaF;
            try {
                UIManager.setLookAndFeel(className);
                SwingUtilities.updateComponentTreeUI(this);
                pack();

            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(500, 400);
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            JFrame frame = new PalfFrame();
            frame.setTitle("PalfTest");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
