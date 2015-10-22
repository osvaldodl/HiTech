
package hitech;

import javax.swing.*;



import java.io.*;

public class Inventario {

	public static void main(String[] args) throws IOException {
		String linha = null;
		FileWriter Arq = new FileWriter("Estoque.txt");
		Arq.write("====== Itens Estoque ======\n");
		Arq.append("\r\n");
		Arq.write("Item      Nome     Unidade Qte");
		Arq.append("\r\n");
		JOptionPane.showMessageDialog(null,"ENTRADA DE DADOS DE ESTOQUE DE PRODUTOS - Cancelar PARA SAIR");

		while (true) {
			String Item = JOptionPane.showInputDialog("ESTOQUE DE PRODUTOS","Codigo");
			if (Item == null) {
				break;
			}
			String Nome = JOptionPane.showInputDialog("ESTOQUE DE PRODUTOS","Nome");
			if (Nome == null) {
				break;
			}

			String Unidade = JOptionPane.showInputDialog("ESTOQUE DE PRODUTOS",	"Unidade");
			if (Unidade == null) {
				break;
			}
			double Qte = Double.parseDouble(JOptionPane.showInputDialog("ESTOQUE DE PRODUTOS", "Qte"));
			if (Qte == 0) {
				break;
			}
			Arq.write(Item + "       ");
			Arq.write(Nome + "       ");
			Arq.write(Unidade + "       ");
			Arq.write(Qte + "\r\n ");
		}
		try {
			Arq.close();
		}
		catch (IOException e) {
			System.out.println("Erro de arquivo!!");
			System.out.println(e);
		}

		BufferedReader bufferedReader =	new BufferedReader(new FileReader("C:/Eclipse/RSR/Estoque/Estoque.txt"));
		while ((linha = bufferedReader.readLine()) != null) {
			System.out.println(linha);
		}
		bufferedReader.close();
	}
}