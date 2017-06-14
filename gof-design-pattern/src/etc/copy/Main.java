package etc.copy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.apache.commons.lang3.SerializationUtils;

public class Main {
	public static void main(String[] args) {
		try {
			List<Item> original = new ArrayList<>();
			original.add(new Item("One", 1));
			original.add(new Item("Two", 2));
			original.add(new Item("Three", 3));
			original.add(new Item("Four", 4));
			original.add(new Item("Five", 5));
			System.out.println("----------------------------------------------------");
			System.out.println("original");
			printItems(original);
			// shallow copy
			List<Item> shallowTarget = original;

			// change a value of an original element.
			original.get(1).setCount(20);
			System.out.println("----------------------------------------------------");
			System.out.println("change a value");

			// print target list
			System.out.println("----------------------------------------------------");
			System.out.println("After shallow copy");
			System.out.println("equal:"+(original == shallowTarget));
			printItems(shallowTarget);

			// deep copy(not sub items)
			List<Item> deepTarget = new ArrayList<>(original);
			
			System.out.println("----------------------------------------------------");
			System.out.println("original before deep copying...");
			printItems(original);
			
			System.out.println("----------------------------------------------------");
			System.out.println("change a value");
			// change a value of an original element. In FP original is should be immutable.
			original.get(2).setCount(30);

			// print target list
			System.out.println("----------------------------------------------------");
			System.out.println("After deep copy not for all");
			System.out.println("equal:"+(original == deepTarget));
			System.out.println("equal sub:"+(original.get(1) == deepTarget.get(1)));
			printItems(deepTarget);
			
			// deep copy using stream if only you're using java8.
			List<Item> perfectDeepCopiedTarget = original.stream().map(i -> (Item)i.clone()).collect(Collectors.toList());
			
			// change a value of an original element.
			System.out.println("----------------------------------------------------");
			System.out.println("change a value");
			original.get(3).setCount(40);
			
			System.out.println("----------------------------------------------------");
			System.out.println("original list before deeper copy");
			printItems(original);
			
			System.out.println("----------------------------------------------------");
			System.out.println("After deeper copy");
			printItems(perfectDeepCopiedTarget);
			
			// clone deeper by using Apache-common-lang
			ItemWrapper itw = new ItemWrapper(original);
			ItemWrapper deepitw = SerializationUtils.clone(itw);
			// change an element
			System.out.println("----------------------------------------------------");
			System.out.println("change a value");
			
			itw.getItems().get(4).setCount(50);
			System.out.println("----------------------------------------------------");
			System.out.println("original list before deeper copy by util");
			printItems(original);
			
			// all object should implement seiralizable to make deeper copy using SerializationUtils
			System.out.println("----------------------------------------------------");
			System.out.println("After deeper copy using utils");
			printItems(deepitw.getItems());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void printItems(List<Item> l){
		System.out.println(l.stream().map(s -> s.toString()).collect(Collectors.joining("|")));
	}
}
