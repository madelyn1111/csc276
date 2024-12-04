import java.awt.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

    JFrame welcomeFrame = new JFrame("Welcome Frame");
    JOptionPane.showMessageDialog(welcomeFrame, "Welcome!");
    welcomeFrame.setSize(500, 400);
    welcomeFrame.setVisible(true);
    welcomeFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel eastPanel = new JPanel();
    JPanel westPanel = new JPanel();
    JPanel southPanel = new JPanel();

    westPanel.setLayout(new GridLayout(2, 1));
    eastPanel.setLayout(new GridLayout(2, 1));
    southPanel.setLayout(new GridLayout(2, 1));

    JButton west1Button = new JButton("West 1");
    JButton west2Button = new JButton("West 2");
    JButton east1Button = new JButton("East 1 ");
    JButton east2Button = new JButton("East 2");
    JButton south1Button = new JButton("South 1");
    JButton south2Button = new JButton("South 2");

    welcomeFrame.add(westPanel, BorderLayout.WEST);
    welcomeFrame.add(eastPanel, BorderLayout.EAST);
    welcomeFrame.add(southPanel, BorderLayout.SOUTH);

    eastPanel.add(east1Button, BorderLayout.EAST);
    eastPanel.add(east2Button, BorderLayout.EAST);
    westPanel.add(west1Button, BorderLayout.WEST);
    westPanel.add(west2Button, BorderLayout.WEST);
    southPanel.add(south1Button, BorderLayout.SOUTH);
    southPanel.add(south2Button, BorderLayout.SOUTH);

    ImageIcon um = new ImageIcon("UM.jpg");
    ImageIcon osu = new ImageIcon("Osu.jpg");
    ImageIcon msu = new ImageIcon("Msu.jpg");
    west1Button.setIcon(um);
    west2Button.setIcon(osu);
    west1Button.setRolloverIcon(msu);


    }
}