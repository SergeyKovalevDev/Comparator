package taskPackage;

import java.util.Comparator;

public class weightComparator implements Comparator<Pet>{

	@Override
	public int compare(Pet o1, Pet o2) {
		return o1.getWeight().compareTo(o2.getWeight());
	}

}
