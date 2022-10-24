import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    private final JPanel testPanel;
    private final JButton classicBtn, endlessBtn, loadGameBtn, customeGameBtn;

    public MainWindow() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setMinimumSize(new Dimension(720,480));
        this.setVisible(true);
        this.setTitle("Keisuke Puzzle");
        this.setLayout(new GridBagLayout());
        this.setBackground(Color.BLUE);
        this.getContentPane().setBackground(new Color(33, 33, 33));

        // centering JFrame on the screen
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dimension.width/2-this.getSize().width/2, dimension.height/2-this.getSize().height/2);


        // creating instances of components
        JLabel title = new JLabel("Keisuke Puzzle");
        title.setFont(title.getFont().deriveFont(Font.BOLD,40));
        title.setHorizontalAlignment(SwingConstants.CENTER);
        title.setVerticalAlignment(SwingConstants.CENTER);
        title.setForeground(new Color(255, 255, 255));

        EventHandler eh = new EventHandler();
        classicBtn = new JButton("CLASSIC");
        classicBtn.setFont(new Font("Arial", Font.BOLD, 30));
        classicBtn.setBackground(new Color(63, 159, 255));
        classicBtn.setForeground(new Color(0,0,0));
        classicBtn.addActionListener(eh);

        endlessBtn = new JButton("ENDLESS");
        endlessBtn.setFont(new Font("Arial", Font.BOLD, 30));
        endlessBtn.setBackground(new Color(255, 92, 92));
        endlessBtn.setForeground(new Color(0,0,0));
        endlessBtn.addActionListener(eh);

        customeGameBtn = new JButton("CUSTOM GAME");
        customeGameBtn.setFont(new Font("Arial", Font.BOLD, 30));
        customeGameBtn.setBackground(new Color(129, 127, 127));
        customeGameBtn.setForeground(new Color(0,0,0));
        customeGameBtn.addActionListener(eh);

        loadGameBtn = new JButton("LOAD GAME");
        loadGameBtn.setFont(new Font("Arial", Font.BOLD, 30));
        loadGameBtn.setBackground(new Color(129, 127, 127));
        loadGameBtn.setForeground(new Color(0,0,0));
        loadGameBtn.addActionListener(eh);



        // testing some thins wit JPanel
        testPanel = new JPanel();
        testPanel.setBackground(new Color(0,0,0));
        testPanel.setVisible(false);
        testPanel.add(classicBtn);




        GridBagConstraints gbc = new GridBagConstraints();
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.fill = GridBagConstraints.BOTH;


        // adding other components to this window
        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridwidth = 20;
        gbc.gridheight = 1;
        gbc.insets = new Insets(40,30,30,30);
        this.add(title,gbc);

        gbc.gridy = 2;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.insets = new Insets(30,100,5,100);
        this.add(classicBtn,gbc);

        gbc.gridy = 4;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.insets = new Insets(0,100,5,100);
        this.add(endlessBtn,gbc);

        gbc.gridy = 6;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.insets = new Insets(0,100,5,100);
        this.add(customeGameBtn,gbc);

        gbc.gridy = 8;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.insets = new Insets(0,100,20,100);
        this.add(loadGameBtn,gbc);


        //test panel
        gbc.gridy = 0;
        gbc.gridx = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 2;
        gbc.insets = new Insets(0,100,20,100);
        this.add(testPanel,gbc);

    }


    class EventHandler implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource().equals(classicBtn)) {
                System.out.println("Classic btn has been clicked!");
                testPanel.setVisible(true);
            } else if (e.getSource().equals(customeGameBtn)) {
                testPanel.setVisible(false);
            }
        }
    }
}
