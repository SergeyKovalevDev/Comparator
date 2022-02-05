package taskPackage;

import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Pet> petSet = new TreeSet<>(new weightComparator());
		petSet.add(new Pet("Cat", "Bob", 10));
		petSet.add(new Pet("Peeg", "John", 100));
		petSet.add(new Pet("Dog", "Master", 20));
		for (Pet pet : petSet) {
			System.out.println(pet);
		}
	}


}
