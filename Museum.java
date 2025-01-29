import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Museum {
	private JFrame startFrame;
	private JLabel welcomeText;

	public Museum() {
		startFrame = new JFrame("Image Example");
		startFrame.setSize(800, 600);
		welcomeText = new JLabel("Welcome to myMuseum!", JLabel.CENTER);
		welcomeText.setBounds(300, 100, 200, 40);

		startFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }        
        });

		JButton dbButton = new JButton("Mt. Rainier");
		dbButton.setActionCommand("Mt. Rainier");
		dbButton.addActionListener(new ButtonClickListener());
		dbButton.setBounds(150,200,100,50);
		startFrame.add(dbButton);

		JButton ruButton = new JButton("Summer");
		ruButton.setActionCommand("Summer");
		ruButton.addActionListener(new ButtonClickListener());
		ruButton.setBounds(250,200,100,50);
		startFrame.add(ruButton);

		JButton daButton = new JButton("AWS");
		daButton.setActionCommand("AWS");
		daButton.addActionListener(new ButtonClickListener());
		daButton.setBounds(350,200,100,50);
		startFrame.add(daButton);

		JButton youButton = new JButton("Sea");
		youButton.setActionCommand("Sea");
		youButton.addActionListener(new ButtonClickListener());
		youButton.setBounds(450,200,100,50);
		startFrame.add(youButton);

		JButton mButton = new JButton("Leavenworth");
		mButton.setActionCommand("Leavenworth");
		mButton.addActionListener(new ButtonClickListener());
		mButton.setBounds(550,200,100,50);
		startFrame.add(mButton);

        startFrame.add(welcomeText);
        startFrame.setLayout(null);
        startFrame.setVisible(true);
	}

	public static void main(String[] args) {
		Museum mWin = new Museum();
	}

	private class ButtonClickListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String command = e.getActionCommand();  
         
            if(command.equals("Mt. Rainier"))  {
		        JFrame f = new JFrame();
				JPanel p = new JPanel();
				ImageIcon icon = new ImageIcon("Rainier.png");
				JLabel lab = new JLabel(icon);
				f.add(p);
				p.add(lab);
				f.pack();
				f.setVisible(true);
   			}
            if(command.equals("Summer"))  {
		        JFrame f = new JFrame();
				JPanel p = new JPanel();
				ImageIcon icon = new ImageIcon("Summer.png");
				JLabel lab = new JLabel(icon);
				f.add(p);
				p.add(lab);
				f.pack();
				f.setVisible(true);
   			}
            if(command.equals("AWS"))  {
		        JFrame f = new JFrame();
				JPanel p = new JPanel();
				ImageIcon icon = new ImageIcon("AWS.png");
				JLabel lab = new JLabel(icon);
				f.add(p);
				p.add(lab);
				f.pack();
				f.setVisible(true);
   			}
            if(command.equals("Sea"))  {
		        JFrame f = new JFrame();
				JPanel p = new JPanel();
				ImageIcon icon = new ImageIcon("Sea.png");
				JLabel lab = new JLabel(icon);
				f.add(p);
				p.add(lab);
				f.pack();
				f.setVisible(true);
   			}
            if(command.equals("Leavenworth"))  {
		        JFrame f = new JFrame();
				JPanel p = new JPanel();
				ImageIcon icon = new ImageIcon("Leavenworth.png");
				JLabel lab = new JLabel(icon);
				f.add(p);
				p.add(lab);
				f.pack();
				f.setVisible(true);
   			}
		}
	}
}
