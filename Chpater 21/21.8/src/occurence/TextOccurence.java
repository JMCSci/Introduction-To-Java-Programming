/* Chapter 21.8 */

package occurence;

import java.io.File;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.Scanner;
import java.util.Set;

public class TextOccurence {
	public static void main(String[] args) throws Exception {
		File file = new File(args[0]);
		Scanner sc = new Scanner(file);
		TreeMap<String, Integer> map = new TreeMap<>();
		int value = 0;
		
		while(sc.hasNext()) {
			String line = sc.next();
			String delimeter = " /r/n/t';:,.\"?";
			String [] tokens = line.split(delimeter);
			tokens[0] = tokens[0].replaceAll("[().]", "").toUpperCase();
			// add words to map
			if(map.isEmpty()) {
				value = 1;
				map.put(tokens[0], value);
			} else {
				int keyValue = 0;
				if(map.containsKey(tokens[0])) {
					keyValue = map.get(tokens[0]);
					keyValue++;
					map.replace(tokens[0], keyValue);
				} else {
					map.put(tokens[0], 1);
				}
			}
		}
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		
		for(Entry<String, Integer > words: entrySet) {
			System.out.println(words);
		}
		
		sc.close();
		
	}

}
