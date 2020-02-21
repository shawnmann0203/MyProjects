import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class employees {

	public static void main(String[] args) {
		
		//Declare different types of collections.
		
		List<String> employeeNames = new ArrayList<String>();
		Set<Integer> ids = new HashSet<Integer>();
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
		employeeNames.add("Shawn");
		employeeNames.add("Michaela");
		employeeNames.add("Carol");
		employeeNames.add("Josh");
		employeeNames.add("Athena");
		
		
		/*Counter for employee names, no matter how big or small the list size is,
		it will still count the correct amount of ids in said list.*/
		int counter = 0;
		for(String name : employeeNames) {
			ids.add(counter);
			counter++;
		}
		
		//A enhanced for loop that Creates a map based off id's as keys, and employee names as values.
		for (int id : ids) {
			employeeMap.put(id, employeeNames.get(id));
		}
		
		//******************OUTPUT**************************
		
		for (int id : ids) {
			System.out.println(id + " : " + employeeMap.get(id));
		}
		
		StringBuilder idsBuilder = new StringBuilder();
		for (int id : ids) {
			idsBuilder.append(id + "-");
		}
		System.out.println(idsBuilder);
		
		StringBuilder namesBuilder = new StringBuilder();
		for (String name : employeeNames) {
			namesBuilder.append(name + " ");
		}
		System.out.println(namesBuilder.toString());
		
		
		

	}
	

}
