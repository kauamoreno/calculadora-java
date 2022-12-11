import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class Tela extends JFrame implements ActionListener{
	
	JButton n0;
	JButton n1;
	JButton n2;
	JButton n3;
	JButton n4;
	JButton n5;
	JButton n6;
	JButton n7;
	JButton n8;
	JButton n9;
	JButton igual;
	JButton dot;
	JButton mais;
	JButton menos;
	JButton mult;
	JButton clean;
	JButton quad;
	JButton raiz;
	JButton divis;
	
	JTextField tela;
	
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
		n0 = new JButton("0");	
		n0.setBounds(0, 570, 200, 100);
		n0.addActionListener(this);
		add(n0);
		
		n1 = new JButton("1");	
		n1.setBounds(0, 470, 100, 100);
		n1.addActionListener(this);
		add(n1);
		
		n2 = new JButton("2");	
		n2.setBounds(100, 470, 100, 100);
		n2.addActionListener(this);
		add(n2);
		
		n3 = new JButton("3");	
		n3.setBounds(200, 470, 100, 100);
		n3.addActionListener(this);
		add(n3);
		
		n4 = new JButton("4");	
		n4.setBounds(0, 370, 100, 100);
		n4.addActionListener(this);
		add(n4);
		
		n5 = new JButton("5");	
		n5.setBounds(100, 370, 100, 100);
		n5.addActionListener(this);
		add(n5);
		
		n6 = new JButton("6");	
		n6.setBounds(200, 370, 100, 100);
		n6.addActionListener(this);
		add(n6);
		
		n7 = new JButton("7");	
		n7.setBounds(0, 270, 100, 100);
		n7.addActionListener(this);
		add(n7);
		
		n8 = new JButton("8");	
		n8.setBounds(100, 270, 100, 100);
		n8.addActionListener(this);
		add(n8);
		
		n9 = new JButton("9");	
		n9.setBounds(200, 270, 100, 100);
		n9.addActionListener(this);
		add(n9);
		
		
		//Caracteres*********************
		igual = new JButton("=");	
		igual.setBounds(300, 570, 85, 100);
		igual.addActionListener(this::operacao);
		add(igual);
		igual.setBackground(new Color(255, 153, 0));
		
		dot = new JButton(".");	
		dot.setBounds(200, 570, 100, 100);
		dot.addActionListener(this);
		add(dot);
		
		mais = new JButton("+");	
		mais.setBounds(300, 470, 85, 100);
		mais.addActionListener(this::operacao);
		add(mais);
		mais.setBackground(new Color(255, 153, 0));
		
		menos = new JButton("-");	
		menos.setBounds(300, 370, 85, 100);
		menos.addActionListener(this::operacao);
		add(menos);
		menos.setBackground(new Color(255, 153, 0));
		
		mult = new JButton("X");	
		mult.setBounds(300, 270, 85, 100);
		mult.addActionListener(this::operacao);
		add(mult);
		mult.setBackground(new Color(255, 153, 0));
		
		clean = new JButton("C");	
		clean.setBounds(0, 170, 100, 100);
		clean.addActionListener(this::limparTela);
		add(clean);
		clean.setBackground(new Color(255, 153, 0));
		
		quad = new JButton(" X²");	
		quad.setBounds(100, 170, 100, 100);
		quad.addActionListener(this::operacao);
		add(quad);
		quad.setBackground(new Color(255, 153, 0));
		
		raiz = new JButton("√x");	
		raiz.setBounds(200, 170, 100, 100);
		raiz.addActionListener(this::operacao);
		add(raiz);
		raiz.setBackground(new Color(255, 153, 0));
		
		divis = new JButton("÷");	
		divis.setBounds(300, 170, 85, 100);
		divis.addActionListener(this::operacao);
		add(divis);
		divis.setBackground(new Color(255, 153, 0));

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
		
		//Aumentando tamanho da fonte
		n0.setFont(new Font("Arial", Font.BOLD, 20));
		n1.setFont(new Font("Arial", Font.BOLD, 20));
		n2.setFont(new Font("Arial", Font.BOLD, 20));
		n3.setFont(new Font("Arial", Font.BOLD, 20));
		n4.setFont(new Font("Arial", Font.BOLD, 20));
		n5.setFont(new Font("Arial", Font.BOLD, 20));
		n6.setFont(new Font("Arial", Font.BOLD, 20));
		n7.setFont(new Font("Arial", Font.BOLD, 20));
		n8.setFont(new Font("Arial", Font.BOLD, 20));
		n9.setFont(new Font("Arial", Font.BOLD, 20));
		igual.setFont(new Font("Arial", Font.BOLD, 20));
		dot.setFont(new Font("Arial", Font.BOLD, 20));
		mais.setFont(new Font("Arial", Font.BOLD, 20));
		menos.setFont(new Font("Arial", Font.BOLD, 20));
		mult.setFont(new Font("Arial", Font.BOLD, 20));
		clean.setFont(new Font("Arial", Font.BOLD, 20));
		quad.setFont(new Font("Arial", Font.BOLD, 20));
		raiz.setFont(new Font("Arial", Font.BOLD, 20));
		divis.setFont(new Font("Arial", Font.BOLD, 20));
		/***********************************************************/
		
		/*************************JTextField************************/
		tela = new JTextField("0");
		tela.setBounds(17, 15, 350, 140);
		tela.setFont(new Font("Arial", Font.BOLD, 40));
		tela.setHorizontalAlignment(JTextField.RIGHT);
		add(tela);
		/***********************************************************/
		
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Object objetoNumero = e.getSource();
		String verifica = tela.getText();
		
		//Para caso ja haja um "." não poder ser acrescentado outro
		if(tela.getText().contains(".")) {
			if(objetoNumero == dot) {tela.setText(tela.getText() + "");}
		}else {
			if(objetoNumero == dot) {tela.setText(tela.getText() + ".");}
		}
		
		switch(verifica) {
		  case "0":
			  if(objetoNumero == n0) {tela.setText("0");}
			  if(objetoNumero == n1) {tela.setText("1");}
			  if(objetoNumero == n2) {tela.setText("2");}
			  if(objetoNumero == n3) {tela.setText("3");}
			  if(objetoNumero == n4) {tela.setText("4");}
			  if(objetoNumero == n5) {tela.setText("5");}
			  if(objetoNumero == n6) {tela.setText("6");}
			  if(objetoNumero == n7) {tela.setText("7");}
			  if(objetoNumero == n8) {tela.setText("8");}
			  if(objetoNumero == n9) {tela.setText("9");}
			  break;
		  default:
			  if(objetoNumero == n0) {tela.setText(tela.getText() + "0");}
			  if(objetoNumero == n1) {tela.setText(tela.getText() + "1");}
			  if(objetoNumero == n2) {tela.setText(tela.getText() + "2");}
			  if(objetoNumero == n3) {tela.setText(tela.getText() + "3");}
			  if(objetoNumero == n4) {tela.setText(tela.getText() + "4");}
			  if(objetoNumero == n5) {tela.setText(tela.getText() + "5");}
			  if(objetoNumero == n6) {tela.setText(tela.getText() + "6");}
			  if(objetoNumero == n7) {tela.setText(tela.getText() + "7");}
			  if(objetoNumero == n8) {tela.setText(tela.getText() + "8");}
			  if(objetoNumero == n9) {tela.setText(tela.getText() + "9");}
		}
	}

		
	private void limparTela(ActionEvent actionevent1) {
		tela.setText("0");
	}
	
	
	String operadorAritmetico;
	double numero1 = 0;
	double numero2;
	
	private void operacao(ActionEvent e) {
	
		Object operacao = e.getSource();
	
		//Potencia ao quadrado e raiz quadrada
		if(operacao == quad) {
			numero1 = Double.parseDouble(tela.getText());
			Double potenciacao = (Double) Math.pow(numero1, 2);
			tela.setText(potenciacao.toString());
		}
		if(operacao == raiz) {
			numero1 = Double.parseDouble(tela.getText());
			Double raizQuad = (Double) Math.sqrt(numero1);
			tela.setText(raizQuad.toString());	
		}

		//Soma, subtracao, multiplicacao e divisao
		if(operacao == mais) {
			numero1 = Double.parseDouble(tela.getText());
			tela.setText("");
			operadorAritmetico = "mais";
		}
		if(operacao == menos) {
			numero1 = Double.parseDouble(tela.getText());
			tela.setText("");
			operadorAritmetico = "menos";
		}
		if(operacao == mult) {
			numero1 = Double.parseDouble(tela.getText());
			tela.setText("");
			operadorAritmetico = "mult";
		}
		if(operacao == divis) {
			numero1 = Double.parseDouble(tela.getText());
			tela.setText("");
			operadorAritmetico = "divis";
		}
		
		
		if(operacao == igual) {
			
			Double resultado;
			
			switch(operadorAritmetico) {
			
			  case "mais":
				  numero2 = Double.parseDouble(tela.getText());
				  resultado = numero1 + numero2;
				  tela.setText("=" + resultado.toString());
				  break;
			    
			  case "menos":
				  numero2 = Double.parseDouble(tela.getText());
				  resultado = numero1 - numero2;
				  tela.setText("=" + resultado.toString());
				  break;
			    
			  case "mult":
				  numero2 = Double.parseDouble(tela.getText());
				  resultado = numero1 * numero2;
				  tela.setText("=" + resultado.toString());
				  break;
				
			  case "divis":
				  numero2 = Double.parseDouble(tela.getText());
				  resultado = numero1 / numero2;
				  tela.setText("=" + resultado.toString());
				  break;
			}
		
		}	
	}
	
	
}
