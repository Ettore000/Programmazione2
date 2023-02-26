package it.unisannio.studenti.panasia.ettoreantonio.tester;

import it.unisannio.studenti.panasia.ettoreantonio.classi.Animal;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Cat;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Cow;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Dog;
import it.unisannio.studenti.panasia.ettoreantonio.classi.Sheep;

public class AnimalTest {
	public void printAnimalSound(Animal animal) {
		System.out.println(animal.makeSound());
	}

	public static void main(String[] args) {
		AnimalTest test=new AnimalTest();
		
		Animal animal=new Animal();
		Animal dog=new Dog();
		Animal cat=new Cat();
		Animal cow=new Cow();
		Animal sheep=new Sheep();
		
		test.printAnimalSound(animal); //Generic animal sound
		test.printAnimalSound(dog); //Bark
		test.printAnimalSound(cat); //Meow
		test.printAnimalSound(cow); //Moo
		test.printAnimalSound(sheep); //Baa
	}

}
