import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.collectme.Instrument;


public class CollectMeApp {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		List<Instrument> linkedList = new LinkedList<Instrument>();
		
//		
//		list.add("C");
//		list.add("e");
//		list.add("2");
//		list.add("T");
//		list.add("M");
//		list.add("E");
//		
//		Iterator<String> listIt = list.iterator();
//		while (listIt.hasNext()) {
//			String element = listIt.next();
//			if (element == "4") {
//				//list.remove("4");
//				listIt.remove();
//				System.out.println(element + "removed");
//			} else {
//				System.out.println(element);
//			}
//		}
//		
//		Collections.sort(list);
//		
		Instrument violin = new Instrument("violin");
		Instrument bass = new Instrument("bass");
		Instrument guitar = new Instrument("guitar");
		Instrument piano = new Instrument("piano");
		/*linkedList.add();
		linkedList.add(bass);
		linkedList.add(violin);
		linkedList.add(new Instrument("piano"));
		Collections.sort(linkedList);
		linkedList.remove(violin);
		linkedList.remove(bass);*/
		
		//Set<Instrument> instruments = new TreeSet<Instrument>();
		Set<Instrument> instruments = new LinkedHashSet<Instrument>();
		instruments.add(violin);
		instruments.add(bass); 
		instruments.add(piano);
		instruments.add(guitar);
		System.out.println("Final list");
		for (Instrument e : instruments){
			System.out.println(e.getName());
		}
		
		Class c = violin.getClass();
		Class d = Instrument.class;
		 
		System.out.println("getClass() :" + c);
		System.out.println("class :" + d);
		
		Set<Instrument> mySet = new HashSet<Instrument>();
		violin.id = 1;
		mySet.add(violin);
		bass.id = 2;
		mySet.add(bass);
		mySet.contains(violin);
		
		
		Set treeSetImpl = new TreeSet<String>();
		"sarsa".substring(beginIndex, endIndex)

	}

}
