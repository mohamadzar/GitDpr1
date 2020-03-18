package prog3prob;

import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.*;
import java.awt.Font;

import javax.swing.*;

public class ProbLayout {
private JFrame frame;
private JButton button1;
private JButton button2;
private Font font1;
private JPanel myPanel;
private GridBagLayout gridBagLayout1 ;
private GridBagConstraints gridBagConstraints;
private List list;
private Label label;
public ProbLayout() {
//	frame = new JFrame("BorderLayout - East");
//	button1 = new JButton("click mich !");
//	button2 = new JButton("Click mich wieder an");
//	myPanel = new JPanel();
//	myPanel.add(button1);
//	myPanel.add(button2);
//	myPanel.setBackground(Color.green);
//	myPanel.setLayout(new BoxLayout(myPanel,BoxLayout.X_AXIS));
//	//myPanel.setLayout(new BoxLayout(myPanel,BoxLayout.Y_AXIS));
//	font1 = new Font("serf",Font.BOLD,25);
//	button1.setFont(font1);
//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	//frame.getContentPane().add(BorderLayout.NORTH,button1);
//	frame.getContentPane().add(BorderLayout.EAST,myPanel);
//	frame.setVisible(true);
//	frame.setSize(600,700);
//	//frame.pack();
	gridBagLayout1 = new GridBagLayout();
	gridBagConstraints= new GridBagConstraints();
	label= new Label("Nur eine Demo");
	
	list = new List(3);
	gridBagLayout1.setConstraints(list,gridBagConstraints);
	gridBagLayout1.setConstraints(label,gridBagConstraints);
	frame = new JFrame();
	myPanel= new JPanel();
	gridBagConstraints.gridx =1;
	gridBagConstraints.gridy =0;
	gridBagConstraints.gridheight =2;
	frame.setLayout(gridBagLayout1);
	frame.add(list);
	frame.add(label);
	//myPanel.add(list);
	//myPanel.setLayout(gridBagLayout1);
	//myPanel.setLayout(new FlowLayout());
	//myPanel.setLayout(new GridLayout(2,3));
	//myPanel.setBackground(Color.blue);
	//frame.getContentPane().add(BorderLayout.EAST,myPanel);
	button1= new JButton("Druck mich!!!!");
	//myPanel.add(button1);
	font1= new Font("serfif",Font.BOLD,28);
	button1.setFont(font1);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.setVisible(true);
	frame.setSize(500,500);
	
}
public static void layoutMethode() {
	
}
	public static void main(String[] args) {
		 new ProbLayout();

	}

}
