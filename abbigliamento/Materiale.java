package abbigliamento;

public class Materiale {

	String nome;
	double costo; //costo al metro

	public Materiale(String nome, double costo) {		
		this.nome = nome;
		this.costo = costo;
	}

	public String getNome(){
		return nome;
	}

	public double getCosto(){
		return costo;
	}
	
	public String toString(){ return nome; }

	@Override
	public int hashCode(){
		return toString().hashCode();
	}
}
