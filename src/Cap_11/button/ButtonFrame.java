package Cap_11.button;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * A frame with a button.
 */
public class ButtonFrame extends JFrame {
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public ButtonFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

        // create buttons.
        JButton yelloButton = new JButton("Yellow");
        JButton blueButton = new JButton("Blue");
        JButton redButtono = new JButton("Red");

        buttonPanel = new JPanel();

        // add buttons to panel.
        buttonPanel.add(yelloButton);
        buttonPanel.add(blueButton);
        buttonPanel.add(redButtono);

        // add panel to frame.
        add(buttonPanel);

        // create button actions.
        ColorAction yellowAction = new ColorAction(Color.YELLOW);
        ColorAction blueAction = new ColorAction(Color.BLUE);
        ColorAction redwAcion = new ColorAction(Color.RED);

        // associate action with buttons.
        yelloButton.addActionListener(yellowAction);
        blueButton.addActionListener(blueAction);
        redButtono.addActionListener(redwAcion);
    }
    private class ColorAction implements ActionListener{
        private Color background;

        public ColorAction(Color c)    {
            background = c;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            buttonPanel.setBackground(background);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            JFrame frame = new ButtonFrame();
            frame.setTitle("ButtonTest");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}

/**
 * An action listener that set s the panel's background color.
 */
