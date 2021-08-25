import model.Cat;
import model.Dog;
import model.Snake;
public class AnimalNoises {

	// add your animal class to the model package
	// only push this file and the animal class you created

	public static void main(String[] args) {
		Cat fluffy = new Cat();
		System.out.println(fluffy.speak());

		Snake slither = new Snake();
		System.out.println(slither.speak());
		
		Dog spot = new Dog();
		System.out.println(spot.speak());
	}

}
