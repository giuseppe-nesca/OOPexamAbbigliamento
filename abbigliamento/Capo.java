package abbigliamento;

public class Capo {
	
	private Modello modello;
	private Materiale materiale;
	private Colore colore;

	public Capo(Modello modello, Materiale materiale, Colore colore) {
		this.modello = modello;
		this.materiale = materiale;
		this.colore = colore;
	}

	public double prezzo() {
		return modello.costoFisso + modello.quantitaTessuto * materiale.costo;
	}

	public String toString(){
		return modello + " " + colore + " " + materiale;
	}
	
	@Override
	public int hashCode(){
		return toString().hashCode();
	}
}
