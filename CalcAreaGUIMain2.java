package com.sd.gui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class CalcAreaGUIMain2 extends JFrame implements ActionListener{
	JTextField radiusTf1;
	JTextField areaTf2;
	JButton b1;
	JButton b2;
	public CalcAreaGUIMain2(){
		// JFrame f=new JFrame();
		JPanel panel=new JPanel(new GridLayout(3,2));
		getContentPane().add(panel);
		JLabel label1=new JLabel("radius");
		JLabel label2=new JLabel("size");
		// JTextField radiusTf1=new JTextField(10);
		// JTextField areaTf2=new JTextField(10); 
		radiusTf1=new JTextField(10);
		areaTf2=new JTextField(10);   
		JButton b1=new JButton("calculation");
		JButton b2=new JButton("cancel");
		b1.setPreferredSize(new Dimension(40,40));
		// b1.addActionListener(new MyListener());
		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(label1);
		panel.add(radiusTf1);
		panel.add(label2);
		panel.add(areaTf2);
		panel.add(b1);
		panel.add(b2);
		// f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent e){
		JButton b= (JButton)e.getSource(); 
		// button
		if (b==b1){
			b1.setText("calculation is done.");
			b2.setText("...");
			Double r=Double.parseDouble(radiusTf1.getText());
			areaTf2.setText(Double.toString(Math.PI*Math.pow(r,2)));
			

		}else{
			b2.setText("Cancel");
			b1.setText("...");
			radiusTf1.setText("?");
			areaTf2.setText("?");
		}



	}
	public static void main(String[] args){
		CalcAreaGUIMain2 c=new CalcAreaGUIMain2();
		c.setDefaultCloseOperation(EXIT_ON_CLOSE);
		c.pack();
		c.setVisible(true);
	}
}