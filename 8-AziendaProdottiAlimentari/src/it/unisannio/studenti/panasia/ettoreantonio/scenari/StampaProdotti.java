package it.unisannio.studenti.panasia.ettoreantonio.scenari;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Pane;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Pasta;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Dolce;
import it.unisannio.studenti.panasia.ettoreantonio.classi.ProdottoAlimentare;

public class StampaProdotti {

	public static void main(String[] args) {
		ProdottoAlimentare pane=new Pane("Rosetta", 2.50, "Integrale");
		ProdottoAlimentare pasta=new Pasta("Spaghetti", 1.50, "Lunghi");
		ProdottoAlimentare dolce=new Dolce("Tiramisu'", 3.50, "Caffe'");
		
		pane.descrizioneProdotto();
		pasta.descrizioneProdotto();
		dolce.descrizioneProdotto();
	}

}
