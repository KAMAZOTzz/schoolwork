package studying.programming;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {

		// Ülesanne 1?
		Map<String, String> hashMap = new HashMap<>();

		hashMap.put("a", "value1");
		hashMap.put("b", "value2");

		Object[] objectArray = hashMap.entrySet().toArray();

		System.out.println(Arrays.toString(objectArray));
	}

	// Ülesanne 3
	public Map<String, String> mapRemove(Map<String, String> map) {
		if (map.containsKey("a") && map.containsKey("b")) {
			map.remove("a");
			map.remove("b");
		}
		return map;
	}

}