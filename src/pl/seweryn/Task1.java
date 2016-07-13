/* Task 1.
 * Write a Java program that will find first non repeating character in String. 
 * Your solution should be as close to optimal as possible.
 * 
 * ex.: for String "Streets" answer is 'r'
 */

package pl.seweryn;

import java.util.*;

public class Task1 {

	public static String FindNonRepChar(String text) {
		if (text == null || text.length() == 0) {
			return "Incorrect string";
		}

		text = text.toLowerCase();
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		Character c;
		for (int i = 0; i < text.length(); i++) {
			c = text.charAt(i);
			if (c == ' ') {
				continue;
			}
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1); // if there is same char it will get
											// value+1
			} else {
				map.put(c, 1); // creating new key with default value 1
			}
		}

		for (int i = 0; i < text.length(); i++) {
			c = text.charAt(i);
			if (c == ' ') {
				continue;
			}
			if (map.get(c) == 1) {
				return c.toString(); // finding non-repeat charater that must
										// contain value 1
			}
		}
		return "There isn't non-repeat character in your string";
	}

}
