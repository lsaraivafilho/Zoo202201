import model.Cat;
import model.Cow;
import model.Dog;
import model.Frog;
import model.Giraffe;
import model.Moose;
import model.Owl;
import model.Raven;
import model.Otter;
import model.Snake;
import model.Zebra;
import model.Bird;
import model.Goose;
import model.Lion;
import model.Fish;
import model.Fox;
import model.Duck;
import model.Elephant;
import model.Sheep;
import model.Bear;

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
		
		Giraffe craig = new Giraffe();
		System.out.println(craig.speak());

		Moose bullwinkle = new Moose();
		System.out.println(bullwinkle.speak());
		
		Bird flappy = new Bird();
		System.out.println(flappy.speak());
		
		Frog hoppy = new Frog();
		System.out.println(hoppy.makeNoise());

		Zebra marty = new Zebra();
		System.out.println(marty.speak());

		Goose Terrance = new Goose("Terrance", "Grey Goose", 12);
		System.out.println(Terrance.speak());
		
		Fish nemo = new Fish();
		System.out.println(nemo.makeNoise());

		Duck Bob = new Duck();
		System.out.println(Bob.speak());
		
		Sheep wooly = new Sheep();
		System.out.println(wooly.speak());
		
		Fox foxy = new Fox();
		System.out.println(foxy.speak());
		
		Owl tootsie = new Owl();
		System.out.println(tootsie.speak());
		
		Raven poe = new Raven();
		System.out.println(poe.speak());

		Otter kicks = new Otter();
		System.out.println(kicks.speak());

		Lion simba = new Lion();
		System.out.println(simba.speak());

		Bear yogi = new Bear();
		System.out.println(yogi.speak());
		
		Cow Betty = new Cow("Betty",8,"Brahman");
		System.out.println(Betty.speak());
		
		Elephant Dumbo = new Elephant();
		System.out.println(Dumbo.speak());


	}

}
