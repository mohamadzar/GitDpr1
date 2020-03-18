

package prog3prob;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.*;



public class SwingProb implements ActionListener{
	private Random random ;
	private JButton but1,but2,but3;
	private JFrame frame;
	private JLabel l1;
	private JPanel panel;
	
	public SwingProb() {
		frame = new JFrame("Willkom");
		but1 = new JButton("klick hier");
		but2 = new JButton("Aendern die Sprache");
		l1= new JLabel("محمد");
		random = new Random();
		
		panel = new JPanel();
		frame.setSize(600,400);
		//frame.setTitle("thanks ");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		//frame.setResizable(false);
		panel.setLayout(null);
		but1.setBounds(500,10,100,50);
		l1.setBounds(440, 10, 100, 400);
		but2.add(l1);
		frame.add(panel);
		panel.add(l1);
		panel.add(but1);
		panel.add(but2);
		but1.addActionListener(this);
		but2.addActionListener(this);
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		/*float red = random.nextFloat();
		float b = random.nextFloat();
		float c = random.nextFloat();
		float c1 = random.nextFloat();
		panel.setBackground(new Color(red, c, c1));*/
		int i = random.nextInt(80);
		l1.setFont(new Font("محمد",Font.BOLD,i));;
	}
	public static void main(String[] args) {
		new SwingProb();

	}


}
