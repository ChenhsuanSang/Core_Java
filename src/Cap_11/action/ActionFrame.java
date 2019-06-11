package Cap_11.action;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

/**
 * A frame with a panel that demonstrates color change actions.
 */

public class ActionFrame extends JFrame {
    private JPanel buttonPanel;
    private static final int DEFAULT_WIDTH = 300;
    private static final int DEFAULT_HEIGHT = 200;

    public ActionFrame() {
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        buttonPanel = new JPanel();

        // define actions.
        Action yellowAction = new ColorAction("Yellow", new ImageIcon("yellow-ball.png"), Color.YELLOW);
        Action blueAction = new ColorAction("Blue", new ImageIcon("bull-ball.png"), Color.BLUE);
        Action redAction = new ColorAction("Red", new ImageIcon("red-ball.png"), Color.RED);

        // add button for these actions.
        buttonPanel.add(new JButton(yellowAction));
        buttonPanel.add(new JButton(blueAction));
        buttonPanel.add(new JButton(redAction));

        add(buttonPanel);

        // associate the Y, B, R keys with names
        InputMap imap = buttonPanel.getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        imap.put(KeyStroke.getKeyStroke("ctrl Y"), "panel.yellow");
        imap.put(KeyStroke.getKeyStroke("ctrl B"), "panel.blue");
        imap.put(KeyStroke.getKeyStroke("ctrl R"), "panel.red");


        // associate the name with actions.
        ActionMap amap = buttonPanel.getActionMap();
        amap.put("panel.yellow", yellowAction);
        amap.put("panel.blue", blueAction);
        amap.put("panel.red", redAction);
    }

    public class ColorAction extends AbstractAction {
        /**
         * Construct a color action.
         * @param name the name to show on the button.
         * @param icon the icon to display on the button.
         * @param c the background color.
         */
        public ColorAction(String name, Icon icon, Color c) {
            putValue(Action.NAME, name);
            putValue(Action.SMALL_ICON, icon);
            putValue(Action.SHORT_DESCRIPTION, "Set panel color" + name.toLowerCase());
            putValue("color", c);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Color c = (Color) getValue("color");
            buttonPanel.setBackground(c);
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(()->
        {
            JFrame f = new ActionFrame();
            f.setTitle("Action Test");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setVisible(true);
        });
    }
}
