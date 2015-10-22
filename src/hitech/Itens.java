package hitech;
public class Itens {

	public String Item;
	public String Nome;
	public String Unidade;
	public double Qte;

	public Itens(String Item, String Nome, String Unidade, double Qte) {
		this.Item = Item;
		this.Nome = Nome;
		this.Unidade = Unidade;
		this.Qte = Qte;
	}

	@Override
	public String toString() {
		return Item + "\t" + Nome + "\t" + Unidade + "\t" + Qte;
	}

}