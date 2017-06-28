package abbigliamento;

public class Modello {
	
	private String nome;
	private double costoFisso,quantitaTessuto;

	public Modello(String nome, double costoFisso, double quantitaTessuto) {
		this.nome = nome;
		this.costoFisso = costoFisso;
		this.quantitaTessuto = quantitaTessuto;
	}

	public String getNome(){
		return nome;
	}
	public double getCosto(){
		return costoFisso;
	}
	
	public double getQuantita() {
		return quantitaTessuto;
	}
	
	@Override
	public int hashCode(){
		return toString().hashCode();
	}
	
	public String toString(){ return nome; }
	

}
