package calculator;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Calculatorclass implements ActionListener{
	
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textarea = new JTextArea(2,10);
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JButton b3 = new JButton();
	JButton b4 = new JButton();
	JButton b5 = new JButton();
	JButton b6 = new JButton();
	JButton b7 = new JButton();
	JButton b8 = new JButton();
	JButton b9 = new JButton();
	JButton b0 = new JButton();
	
	JButton badd = new JButton();
	JButton bsub = new JButton();
	JButton bmul = new JButton();
	JButton bdiv = new JButton();
	JButton bclear = new JButton();
	JButton bdot = new JButton();
	JButton bequal = new JButton();
	
	public Double n1,n2,res;
	public int add_c=0,sub_c=0,mul_c=0,div_c=0;
	
	public Calculatorclass() {
		frame.setSize(340,490);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		frame.setTitle("Calculator");
		frame.setResizable(false);
		frame.add(panel);
		panel.setBackground(Color.LIGHT_GRAY);
		panel.setVisible(true);
		
		Border border = BorderFactory.createLineBorder(Color.BLACK,4);
		panel.add(textarea);
		
		textarea.setBackground(Color.WHITE);
		Border tborder = BorderFactory.createLineBorder(Color.DARK_GRAY,3);
		textarea.setBorder(tborder);
		Font font = new Font("arial",Font.BOLD,33);
		textarea.setFont(font);
		textarea.setForeground(Color.BLACK);
		textarea.setPreferredSize(new Dimension(2,10));
		textarea.setLineWrap(true);
		
		b1.setPreferredSize(new Dimension(90,50));
		b1.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\1.png"));

		b2.setPreferredSize(new Dimension(90,50));
		b2.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\2.png"));
		
		
		b3.setPreferredSize(new Dimension(90,50));
		b3.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\3.png"));
		
		b4.setPreferredSize(new Dimension(90,50));
		b4.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\4.png"));
		
		b5.setPreferredSize(new Dimension(90,50));
		b5.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\5.png"));
		
		b6.setPreferredSize(new Dimension(90,50));
		b6.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\6.png"));
		
		b7.setPreferredSize(new Dimension(90,50));
		b7.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\7.png"));
		
		b8.setPreferredSize(new Dimension(90,50));
		b8.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\8.png"));
		
		b9.setPreferredSize(new Dimension(90,50));
		b9.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\9.png"));
		
		b0.setPreferredSize(new Dimension(90,50));
		b0.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\0.png"));
		
		bdot.setPreferredSize(new Dimension(90,50));
		bdot.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\dot.png"));
		
		badd.setPreferredSize(new Dimension(90,50));
		badd.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\+.png"));
		
		bsub.setPreferredSize(new Dimension(90,50));
		bsub.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\-.png"));
		
		bmul.setPreferredSize(new Dimension(90,50));
		bmul.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\mul..png"));
		
		bdiv.setPreferredSize(new Dimension(90,50));
		bdiv.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\div.png"));
		
		bequal.setPreferredSize(new Dimension(90,50));
		bequal.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\=.png"));
		
		bclear.setPreferredSize(new Dimension(90,50));
		bclear.setIcon(new ImageIcon("C:\\Users\\hp\\Desktop\\calc\\C.png"));
		
		panel.add(b1);
		b1.setVisible(true);
		panel.add(b2);
		panel.add(b3);
		panel.add(b4);
		panel.add(b5);
		panel.add(b6);
		panel.add(b7);
		panel.add(b8);
		panel.add(b9);
		panel.add(bdot);
		panel.add(b0);
		panel.add(bequal);
		panel.add(badd);
		panel.add(bsub);
		panel.add(bmul);
		panel.add(bdiv);
		panel.add(bclear);
		frame.setVisible(true);
		b1.addActionListener((ActionListener) this);
		frame.setVisible(true);
		b2.addActionListener((ActionListener) this);
		b3.addActionListener((ActionListener) this);
		b4.addActionListener((ActionListener) this);
		b5.addActionListener((ActionListener) this);
		b6.addActionListener((ActionListener) this);
		b7.addActionListener((ActionListener) this);
		b8.addActionListener((ActionListener) this);
		b9.addActionListener((ActionListener) this);
		b0.addActionListener((ActionListener) this);
		bdot.addActionListener((ActionListener) this);
		badd.addActionListener((ActionListener) this);
		bsub.addActionListener((ActionListener) this);
		bmul.addActionListener((ActionListener) this);
		bdiv.addActionListener((ActionListener) this);
		bequal.addActionListener((ActionListener) this);
		bclear.addActionListener((ActionListener) this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source =e.getSource();
		if(source==bclear) {
			n1=0.0;
			n2=0.0;
			textarea.setText("");
		}
		else if(source==b1) {
			textarea.append("1");
		}
		else if(source==b2) {
			textarea.append("2");
		}
		else if(source==b3) {
			textarea.append("3");
		}
		else if(source==b4) {
			textarea.append("4");
		}
		else if(source==b5) {
			textarea.append("5");
		}
		else if(source==b6) {
			textarea.append("6");
		}
		else if(source==b7) {
			textarea.append("7");
		}
		else if(source==b8) {
			textarea.append("8");
		}
		else if(source==b9) {
			textarea.append("9");
		}
		else if(source==b0) {
			textarea.append("0");
		}
		else if(source==bdot) {
			textarea.append(".");
		}
		else if(source==badd) {
			n1=number_reader();
			textarea.setText("+");
			add_c=1;
			div_c=0;
			sub_c=0;
			mul_c=0;
		}
		else if(source==bsub) {
			n1=number_reader();
			textarea.setText("");
			add_c=0;
			div_c=0;
			sub_c=1;
			mul_c=0;
		}
		else if(source==bmul) {
			n1=number_reader();
			textarea.setText("");
			add_c=0;
			div_c=0;
			sub_c=0;
			mul_c=1;
		}
		else if(source==bdiv) {
			n1=number_reader();
			textarea.setText("");
			add_c=0;
			div_c=1;
			sub_c=0;
			mul_c=0;
		}
		else if(source==bequal) {
			n2=number_reader();
			if(add_c>0) {
				res=n1+n2;
				textarea.setText(Double.toString(res));	
			}
			else if(sub_c>0) {
				res=n1-n2;
				textarea.setText(Double.toString(res));	
			}
			else if(mul_c>0) {
				res=n1*n2;
				textarea.setText(Double.toString(res));	
			}
			else if(div_c>0) {
				res=n1/n2;
				textarea.setText(Double.toString(res));	
			}
		}
		
	}
	public Double number_reader() {
		Double num1;
		String s;
		s=textarea.getText();
		num1=Double.valueOf(s);
		return num1;
	}
}
