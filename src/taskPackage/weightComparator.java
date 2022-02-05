package taskPackage;

import java.util.Comparator;

public class weightComparator implements Comparator<Pet>{

	@Override
	public int compare(Pet o1, Pet o2) {
		return ((Integer) o1.getWeight()).compareTo((Integer) o2.getWeight());
	}

}
