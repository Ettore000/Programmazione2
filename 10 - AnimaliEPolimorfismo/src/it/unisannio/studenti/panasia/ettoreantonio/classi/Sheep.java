package it.unisannio.studenti.panasia.ettoreantonio.classi;

public class Sheep extends Animal {
	//In JDK 19 si omette il tag @Override
	/**
	 * @Override si può a limite scriverlo all'interno di un commento di documentazione,
	 * ma non è necessario
	 */
	public String makeSound() {
		return "Baa";
	}
}
