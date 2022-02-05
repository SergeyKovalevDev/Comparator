package taskPackage;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Set<Pet> petSet = new TreeSet<>(new Comparator<Pet>() {
			@Override
			public int compare(Pet o1, Pet o2) {
				return o1.getWeight().compareTo(o2.getWeight());
			}
		});
		petSet.add(new Pet("Cat", "Bob", 10));
		petSet.add(new Pet("Peeg", "John", 100));
		petSet.add(new Pet("Dog", "Master", 20));
		for (Pet pet : petSet) {
			System.out.println(pet);
		}
	}


}
