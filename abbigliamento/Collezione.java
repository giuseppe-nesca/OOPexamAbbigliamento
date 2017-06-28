package abbigliamento;

import java.util.Collection;
import java.util.HashSet;

public class Collezione {
	
	private Collection<Capo> capiCollezione = new HashSet<>();

	public void add(Capo capo) {
		capiCollezione.add(capo);
	}

	public Collection trova(Colore colore) {
		Collection<Capo>resultCollection = new HashSet<>();
		for (Capo capo : capiCollezione) {
			if (capo.colore.equals(colore)){
				resultCollection.add(capo);
			}			
		}
		return resultCollection;
	}

	public Collection trova(Materiale materiale) {
		Collection<Capo> resultCollection = new HashSet<Capo>();
		for (Capo capo : capiCollezione) {
			if(capo.materiale.equals(materiale)){
				resultCollection.add(capo);
			}
		}
		return resultCollection;
	}

	public Collection trova(Modello modello) {
		Collection<Capo> resultCollection = new HashSet<Capo>();
		for (Capo capo : capiCollezione) {
			if (capo.modello.equals(modello)) {
				resultCollection.add(capo)
			}
		}
		return resultCollection;
	}

}
