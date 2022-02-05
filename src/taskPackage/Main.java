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
		setPrinter(petSet);
		
		Set<Pet> petSet2 = new TreeSet<>(new Comparator<Pet>() {

			@Override
			public int compare(Pet o1, Pet o2) {
				Integer nameLength1 = o1.getName().length();
				Integer nameLength2 = o2.getName().length();
				return nameLength1.compareTo(nameLength2);
			}
			
		});
		petSet2.addAll(petSet);
		setPrinter(petSet2);
	
	}
	
	private static void setPrinter(Set<Pet> set) {
		for (Pet pet : set) {
			System.out.println(pet);
		}
		
	}


}
