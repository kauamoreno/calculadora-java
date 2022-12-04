import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela extends JFrame {
	
	//Construtor da classe
	public Tela(){
		
		setTitle("Calculadora");
		setSize(400, 685);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		
		/*************************JButton's*************************/
		
		//Numeros************************
		JButton n0 = new JButton("0");	
		n0.setBounds(0, 550, 200, 100);
		add(n0);
		
		JButton n1 = new JButton("1");	
		n1.setBounds(0, 450, 100, 100);
		add(n1);
		
		JButton n2 = new JButton("2");	
		n2.setBounds(100, 450, 100, 100);
		add(n2);
		
		JButton n3 = new JButton("3");	
		n3.setBounds(200, 450, 100, 100);
		add(n3);
		
		JButton n4 = new JButton("4");	
		n4.setBounds(0, 350, 100, 100);
		add(n4);
		
		JButton n5 = new JButton("5");	
		n5.setBounds(100, 350, 100, 100);
		add(n5);
		
		JButton n6 = new JButton("6");	
		n6.setBounds(200, 350, 100, 100);
		add(n6);
		
		JButton n7 = new JButton("7");	
		n7.setBounds(0, 250, 100, 100);
		add(n7);
		
		JButton n8 = new JButton("8");	
		n8.setBounds(100, 250, 100, 100);
		add(n8);
		
		JButton n9 = new JButton("9");	
		n9.setBounds(200, 250, 100, 100);
		add(n9);
		
		
		//Caracteres*********************
		JButton igual = new JButton("=");	
		igual.setBounds(300, 550, 85, 100);
		add(igual);
		
		JButton dot = new JButton(".");	
		dot.setBounds(200, 550, 100, 100);
		add(dot);
		
		JButton mais = new JButton("+");	
		mais.setBounds(300, 450, 85, 100);
		add(mais);
		
		JButton menos = new JButton("-");	
		menos.setBounds(300, 350, 85, 100);
		add(menos);
		
		JButton mult = new JButton("X");	
		mult.setBounds(300, 250, 85, 100);
		add(mult);
		
		JButton clean = new JButton("C");	
		clean.setBounds(0, 150, 100, 100);
		add(clean);
		
		JButton quad = new JButton(" X²");	
		quad.setBounds(100, 150, 100, 100);
		add(quad);
		
		JButton raiz = new JButton("√x");	
		raiz.setBounds(200, 150, 100, 100);
		add(raiz);
		
		JButton divis = new JButton("÷");	
		divis.setBounds(300, 150, 85, 100);
		add(divis);
		
		
		
		
		
		
		/***********************************************************/
		
		setVisible(true);
		
	}
}
