package br.com.dextraining.window;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ExemploJFrame extends JFrame {
	
	public ExemploJFrame() {
		JButton botao = new JButton("Teste");
		botao.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String nome = JOptionPane
						.showInputDialog("Informe seu nome");
				
				JOptionPane
					.showMessageDialog(null, "Seu nome eh " + nome);
			}
		});
		getContentPane().add(botao);

	}

	public static void main(String[] args) {
		ExemploJFrame exemplo = new ExemploJFrame();
		exemplo.setSize(800, 600);
		exemplo.setDefaultCloseOperation(EXIT_ON_CLOSE);
		exemplo.setVisible(true);
	}
}
