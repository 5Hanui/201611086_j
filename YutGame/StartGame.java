package com.sd.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class StartGame extends JFrame implements ActionListener{
	public String player1;
	public String player2;
	JTextField p1;
	JTextField p2;
	JButton b1=new JButton("Dice game");
	JButton b2=new JButton("Yut game");
	MoveTurtle mt1=new MoveTurtle();
	MoveTurtle mt2=new MoveTurtle();
	ReportFile f= new ReportFile();
	public StartGame(){
		JPanel panel=new JPanel(new GridLayout(3,2));
		getContentPane().add(panel);
		JLabel label1=new JLabel("player1 ID");
		JLabel label2=new JLabel("player2 ID");
		p1=new JTextField(20);
		p2=new JTextField(20);
		b1.addActionListener(this);
		b2.addActionListener(this);
		panel.add(label1);
		panel.add(p1);
		panel.add(label2);
		panel.add(p2);
		panel.add(b1);
		panel.add(b2);
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	public void actionPerformed(ActionEvent e){
		JButton b=(JButton)e.getSource();
		player1=p1.getText();
		player2=p2.getText();
		if(b.equals(b1)){
			Dice d1=new Dice();
			Dice d2=new Dice();

			// f.write("Dice game play!");
			d1.play();
			d2.play();
			if(d1.getNumb()>d2.getNumb()){
				f.rewrite("winner is "+player1+"!! \n");
				System.out.printf("Winner is %s!! -> score : %d\n",player1,d1.getNumb());

			}else if(d1.getNumb()<d2.getNumb()){
				// f.write("winner is "+player2+"!! "+"Score : ");
				f.rewrite("winner is "+player2+"!! \n");
				System.out.printf("Winner is %s!! -> score : %d\n",player2,d2.getNumb());
			}
			
			
		}
		else if(b.equals(b2)) {
			Yutgame yg1=new Yutgame();
			Yutgame yg2=new Yutgame();
			mt2.color();

			// player1=p1.getText();
			// player2=p1.getText();
			for(int i=0;i<5;i++){
				yg1.play();
				yg2.play();
				System.out.printf("%s : %d(%s)\n ",player1,yg1.newNum,yg1.p);
				System.out.printf("%s : %d(%s)\n ",player2,yg2.newNum,yg2.p);
				if(yg1.newNum>yg2.newNum){
					mt1.stTurtle();
					mt2.bTurtle();
				}else if(yg1.newNum<yg2.newNum){
					mt2.stTurtle();
					mt1.bTurtle();
				}


			}
			if(mt1.getPos()>mt2.getPos()){
				System.out.printf("%s is winner!!\n",player1);
				f.rewrite("Winner : "+player1);
			}else if(mt1.getPos()<mt2.getPos()){
				System.out.printf("%s is winner!!\n",player2);
				f.rewrite("Winner : "+player2);
			}


		}
	}
	public static void main(String[] args){
		StartGame s=new StartGame();
	}
}