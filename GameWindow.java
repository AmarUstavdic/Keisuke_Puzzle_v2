import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameWindow extends JPanel {

    private final GameWindow gameWindow;
    private final JButton testBtn;

    private final Menu menu;
    public GameWindow(Menu menu) {
        this.setLayout(new GridBagLayout());
        this.setVisible(false);
        this.setBackground(new Color(38, 38, 38));
        this.gameWindow = this;
        this.menu = menu;


        EventHandler eh = new EventHandler();

        testBtn = new JButton();
        testBtn.addActionListener(eh);


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;

        // adding other components to this window
        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridwidth = 20;
        gbc.gridheight = 1;
        gbc.insets = new Insets(40, 30, 30, 30);
        this.add(testBtn, gbc);

    }


    class EventHandler implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(testBtn)) {
                System.out.println("Classic btn has been clicked!");
                gameWindow.setVisible(false);
                menu.setVisible(true);
            }
        }
    }


}
