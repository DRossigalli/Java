package ex2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {

		int cx;
		int cy;
		
		//cx = Integer.parseInt(JOptionPane.showInputDialog("Coordenada X do ponto A"));
		//cy = Integer.parseInt(JOptionPane.showInputDialog("Coordenada Y do ponto A"));
		//Ponto A = new Ponto(cx, cy);
		Ponto A = new Ponto(21, 55);
		
		//cx = Integer.parseInt(JOptionPane.showInputDialog("Coordenada X do ponto B"));
		//cy = Integer.parseInt(JOptionPane.showInputDialog("Coordenada Y do ponto B"));
		//Ponto B = new Ponto(cx, cy);
		Ponto B = new Ponto(44, 70);
		
		JOptionPane.showMessageDialog(null, "Ponto A: " + A.coord() + "\t // Ponto B " + B.coord() + "\nDistância: " + A.dist(B));
		
		System.out.println(A.coord());
		System.out.println(B.coord());
		
		System.out.println(A.dist(B));
	}

}
