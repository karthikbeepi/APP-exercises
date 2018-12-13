package generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListFruits {

	public static <T extends Fruits> void sortAndDisplay(ArrayList<T> ar) {
		Collections.sort(ar);
	}

}
