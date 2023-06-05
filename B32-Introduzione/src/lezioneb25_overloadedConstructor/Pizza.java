package lezioneb25_overloadedConstructor;

public class Pizza {
	String impasto, salsa, formaggio, extra, extra2;
	
	//preparato per una focaccia
	public Pizza(String impasto) {
		this.impasto = impasto;
		System.out.println("ingredienti: "+impasto);
	}
	
	//preparato per una marinara
	public Pizza(String impasto, String salsa) {
		this.impasto = impasto;
		this.salsa = salsa;
		System.out.println("ingredienti: "+impasto+", "+salsa);
	}
	
	//preparato per una margherita
	public Pizza(String impasto, String salsa, String formaggio) {
		this.impasto = impasto;
		this.salsa = salsa;
		this.formaggio = formaggio;
		System.out.println("ingredienti: "+impasto+", "+salsa+", "+formaggio);
	}
	
	//preparato per pizze classiche
	public Pizza(String impasto, String salsa, String formaggio, String extra) {
		this.impasto = impasto;
		this.salsa = salsa;
		this.formaggio = formaggio;
		this.extra = extra;
		System.out.println("ingredienti: "+impasto+", "+salsa+", "+formaggio+", "+extra);
	}
	
	//preparato per pizze speciali
	public Pizza(String impasto, String salsa, String formaggio, String extra, String extra2) {
		this.impasto = impasto;
		this.salsa = salsa;
		this.formaggio = formaggio;
		this.extra = extra;
		this.extra2 = extra2;
		System.out.println("ingredienti: "+impasto+", "+salsa+", "+formaggio+", "+extra+", "+extra2);
	}
}
