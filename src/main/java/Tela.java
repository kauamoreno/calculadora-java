import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Tela extends JFrame {
	
	//Construtor da classe
	public Tela(){
		
		setTitle("Calculadora");
		setSize(400, 705);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		/*************************JButton's*************************/
		
		//Numeros************************
		JButton n0 = new JButton("0");	
		n0.setBounds(0, 570, 200, 100);
		add(n0);
		
		JButton n1 = new JButton("1");	
		n1.setBounds(0, 470, 100, 100);
		add(n1);
		
		JButton n2 = new JButton("2");	
		n2.setBounds(100, 470, 100, 100);
		add(n2);
		
		JButton n3 = new JButton("3");	
		n3.setBounds(200, 470, 100, 100);
		add(n3);
		
		JButton n4 = new JButton("4");	
		n4.setBounds(0, 370, 100, 100);
		add(n4);
		
		JButton n5 = new JButton("5");	
		n5.setBounds(100, 370, 100, 100);
		add(n5);
		
		JButton n6 = new JButton("6");	
		n6.setBounds(200, 370, 100, 100);
		add(n6);
		
		JButton n7 = new JButton("7");	
		n7.setBounds(0, 270, 100, 100);
		add(n7);
		
		JButton n8 = new JButton("8");	
		n8.setBounds(100, 270, 100, 100);
		add(n8);
		
		JButton n9 = new JButton("9");	
		n9.setBounds(200, 270, 100, 100);
		add(n9);
		
		
		//Caracteres*********************
		JButton igual = new JButton("=");	
		igual.setBounds(300, 570, 85, 100);
		add(igual);
		igual.setBackground(new Color(214,129,2));
		
		JButton dot = new JButton(".");	
		dot.setBounds(200, 570, 100, 100);
		add(dot);
		
		JButton mais = new JButton("+");	
		mais.setBounds(300, 470, 85, 100);
		add(mais);
		mais.setBackground(new Color(214,129,2));
		
		JButton menos = new JButton("-");	
		menos.setBounds(300, 370, 85, 100);
		add(menos);
		menos.setBackground(new Color(214,129,2));
		
		JButton mult = new JButton("X");	
		mult.setBounds(300, 270, 85, 100);
		add(mult);
		mult.setBackground(new Color(214,129,2));
		
		JButton clean = new JButton("C");	
		clean.setBounds(0, 170, 100, 100);
		add(clean);
		clean.setBackground(new Color(214,129,2));
		
		JButton quad = new JButton(" X²");	
		quad.setBounds(100, 170, 100, 100);
		add(quad);
		quad.setBackground(new Color(214,129,2));
		
		JButton raiz = new JButton("√x");	
		raiz.setBounds(200, 170, 100, 100);
		add(raiz);
		raiz.setBackground(new Color(214,129,2));
		
		JButton divis = new JButton("÷");	
		divis.setBounds(300, 170, 85, 100);
		add(divis);
		divis.setBackground(new Color(214,129,2));
		

		//Mudando cor da borda***********
		Border lineBorder = BorderFactory.createLineBorder(Color.black);
		TitledBorder blackColor = BorderFactory.createTitledBorder(lineBorder, "");
		
		n0.setBorder(blackColor);
		n1.setBorder(blackColor);
		n2.setBorder(blackColor);
		n3.setBorder(blackColor);
		n4.setBorder(blackColor);
		n5.setBorder(blackColor);
		n6.setBorder(blackColor);
		n7.setBorder(blackColor);
		n8.setBorder(blackColor);
		n9.setBorder(blackColor);
		igual.setBorder(blackColor);
		dot.setBorder(blackColor);
		mais.setBorder(blackColor);
		menos.setBorder(blackColor);
		mult.setBorder(blackColor);
		clean.setBorder(blackColor);
		quad.setBorder(blackColor);
		raiz.setBorder(blackColor);
		divis.setBorder(blackColor);
		
		//Retirando borda do texto*******
		n0.setFocusPainted(false);
		n1.setFocusPainted(false);
		n2.setFocusPainted(false);
		n3.setFocusPainted(false);
		n4.setFocusPainted(false);
		n5.setFocusPainted(false);
		n6.setFocusPainted(false);
		n7.setFocusPainted(false);
		n8.setFocusPainted(false);
		n9.setFocusPainted(false);
		igual.setFocusPainted(false);
		dot.setFocusPainted(false);
		mais.setFocusPainted(false);
		menos.setFocusPainted(false);
		mult.setFocusPainted(false);
		clean.setFocusPainted(false);
		quad.setFocusPainted(false);
		raiz.setFocusPainted(false);
		divis.setFocusPainted(false);
		/***********************************************************/
		
		setVisible(true);
		
	}
}
