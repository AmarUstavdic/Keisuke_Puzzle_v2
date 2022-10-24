import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel {

    private final JButton classicBtn, endlessBtn, customGameBtn, loadGameBtn;
    private final Menu menu;

    private final GameWindow gameWindow;
    public Menu(GameWindow gameWindow) {
        this.setLayout(new GridBagLayout());
        this.setVisible(true);
        this.setBackground(new Color(38, 38, 38));
        this.menu = this;
        this.gameWindow = gameWindow;



        JLabel title = new JLabel("Keisuke Puzzle");
        title.setFont(title.getFont().deriveFont(Font.BOLD, 40));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.CENTER);
        title.setForeground(new Color(255, 255, 255));

        EventHandler eh = new EventHandler();

        classicBtn = new JButton("CLASSIC");
        classicBtn.setFont(new Font("Arial", Font.BOLD, 30));
        classicBtn.setBackground(new Color(63, 159, 255));
        classicBtn.setForeground(new Color(0, 0, 0));
        classicBtn.addActionListener(eh);

        endlessBtn = new JButton("ENDLESS");
        endlessBtn.setFont(new Font("Arial", Font.BOLD, 30));
        endlessBtn.setBackground(new Color(255, 92, 92));
        endlessBtn.setForeground(new Color(0, 0, 0));
        endlessBtn.addActionListener(eh);

        customGameBtn = new JButton("CUSTOM GAME");
        customGameBtn.setFont(new Font("Arial", Font.BOLD, 30));
        customGameBtn.setBackground(new Color(129, 127, 127));
        customGameBtn.setForeground(new Color(0, 0, 0));
        customGameBtn.addActionListener(eh);

        loadGameBtn = new JButton("LOAD GAME");
        loadGameBtn.setFont(new Font("Arial", Font.BOLD, 30));
        loadGameBtn.setBackground(new Color(129, 127, 127));
        loadGameBtn.setForeground(new Color(0, 0, 0));
        loadGameBtn.addActionListener(eh);


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
        this.add(title, gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.insets = new Insets(30, 100, 5, 100);
        this.add(classicBtn, gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.insets = new Insets(0, 100, 5, 100);
        this.add(endlessBtn, gbc);

        gbc.gridy = 6;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.insets = new Insets(0, 100, 5, 100);
        this.add(customGameBtn, gbc);

        gbc.gridy = 8;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.insets = new Insets(0, 100, 20, 100);
        this.add(loadGameBtn, gbc);


    }


    class EventHandler implements ActionListener {


        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(classicBtn)) {
                System.out.println("Classic btn has been clicked!");
                menu.setVisible(false);
                gameWindow.setVisible(true);

            }
        }
    }

}