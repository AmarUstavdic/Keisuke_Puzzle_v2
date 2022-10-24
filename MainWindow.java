import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private Menu menu = null;
    private final GameWindow gameWindow;
    public MainWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(720, 480));
        this.setVisible(true);
        this.setTitle("Keisuke Puzzle");
        this.setLayout(new GridBagLayout());

        // centering JFrame on the screen
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dimension.width / 2 - this.getSize().width / 2, dimension.height / 2 - this.getSize().height / 2);


        gameWindow = new GameWindow(menu);
        menu = new Menu(gameWindow);


        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;


        // adding other components to this window
        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.insets = new Insets(0, 0, 0, 0);
        this.add(menu, gbc);

        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        gbc.insets = new Insets(0, 0, 0, 0);
        this.add(gameWindow, gbc);
    }
}
