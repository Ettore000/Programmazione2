package esempioGiu23;

/**
 * Test driver per un cane
 */
public class CaneTester {

	/**
	 * Esecuzione programma indipendente per testare la funzione di callBack
	 * @param args
	 */
	public static void main(String[] args) {
		Cane cane=new Cane();
		
		cane.abbaia(); //Il cane abbaia, ma non è ancora stato registrato
		
		cane.setCallBack(new CaneCallBack() { //Registramento che il cane ha abbaiato
			@Override
			public void onAbbaia() {
				System.out.println("CallBack eseguita, il cane ha abbaiato");
			}
		});
		cane.abbaia(); //Il cane ha abbaiato, quindi la callBack lo riferisce
	}
}
