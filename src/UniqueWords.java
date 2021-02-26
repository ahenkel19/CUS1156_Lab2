import java.util.ArrayList;
import java.util.List;

public class UniqueWords {
	/**
	 * counts the number of unique strings in a list
	 * 
	 * @param list ArrayList of strings to be examined
	 * @return number of unique strings in the list
	 */
	public static int countUnique(ArrayList<String> list) {
		List<String> alreadyFound = new ArrayList<>();
		List<String> unique = new ArrayList<>();

		for (int i = 0; i < list.size(); i++) {
			String current = list.get(i);
			// If current string has already been found before, it is removed from the
			// unique list. Else, it is added to the unique list and recorded as having been
			// found.
			if (alreadyFound.contains(current)) {
				unique.remove(current);
			} else {
				unique.add(current);
				alreadyFound.add(current);
			}
		}
		return unique.size();
	}

	public static void main(String[] args) {
		ArrayList<String> words = new ArrayList<>();
		words.add("apple");
		words.add("orange");
		words.add("blackboard");
		words.add("apple");
		words.add("orange");
		words.add("sun");
		words.add("moon");

		int unique = countUnique(words);
		System.out.println(words + " has " + unique + " unique words");
	}
}
