package abbigliamento;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Abbigliamento {
	
	private Map<String, Modello> modelli = new HashMap<>();
	private Map<String, Colore> colori = new HashMap<>();
	private Map<String, Materiale> materiali = new HashMap<>();
	private Map<String, Capo> capi = new HashMap<>();
	private Map<String, Collezione> collezioni = new HashMap<>();

	
	public void leggiFile(String fileName){
		try (BufferedReader b = new BufferedReader(new FileReader(fileName))) {
			
			String buffer = new String();
			
			while((buffer = b.readLine()) != null){
				StringTokenizer stringTokenizer = new StringTokenizer(buffer, ";");
				try{
					String modalita = stringTokenizer.nextToken();
					if(modalita == "MOD"){
						String nome = stringTokenizer.nextToken(),
								costo = stringTokenizer.nextToken(),
								quantita = stringTokenizer.nextToken();
						modelli.put(nome, new Modello(nome, new Double(costo), new Double(quantita)));
					}
					if(modalita == "COL"){
						String nome = stringTokenizer.nextToken();
						colori.put(nome, new Colore(nome));
					}
					if (modalita == "MAT") {
						String nome = stringTokenizer.nextToken(),
								costo = stringTokenizer.nextToken();
						materiali.put(nome, new Materiale(nome, new Double(costo)));
					}
					if (modalita == "CAP"){
						String nome = stringTokenizer.nextToken(),
								nomeModello = stringTokenizer.nextToken(),
								nomeMateriale = stringTokenizer.nextToken(),
								nomeColore = stringTokenizer.nextToken();
						capi.put(nome, new Capo(modelli.get(nomeModello), materiali.get(nomeMateriale), colori.get(nomeColore)));
					}
				}catch(NullPointerException e){
					
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public Modello getModello(String name){
		return modelli.get(name);
	}

	public Colore getColore(String name){
		return colori.get(name);
	}

	public Materiale getMateriale(String name){
		return materiali.get(name);
	}

	public Capo getCapo(String name){
		return capi.get(name);
	}

	public Collezione getCollezione(String name){
		return collezioni.get(name);
	}

}
