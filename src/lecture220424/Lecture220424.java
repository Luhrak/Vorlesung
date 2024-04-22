package lecture220424;

public class Lecture220424 {

	public static void main(String[] args) {

		Deer r = new Deer();
		Object o = r; // Works cuz Deer is an object
		Animal t = r; // Works cuz Deer is an Animal

		// but then they all just reference r if its gone they dont have a copy

		// That way you can eg make an Animal array
		// and assign subclasses to it

		Animal[] zoo = new Animal[3];
		zoo[1] = new Deer();

		// if one method is abstract in a class java expects the whole class to be
		// cuz it implies there has to be a subclass
	}
}
