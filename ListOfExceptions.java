package listOfExceptions;
import java.util.ArrayList;



public class ListOfExceptions {
	public static void main(String[] args) {
		// TODO create ArrayList /  cast each element to Integer / use try/catch blocks to handle the exceptions
		ArrayList<Object> myList = new ArrayList<Object>();
		myList.add("13");
		myList.add("hello world");
		myList.add(48);
		myList.add("Goodbye World");
		
		for (int i = 0; i < myList.size(); i ++) {
			try {
				Integer castValue = (Integer)myList.get(i);
				System.out.println(castValue);
			}catch(ClassCastException e) {
				System.out.println("An error occured at ArrayList index [" + i + "] by object with value of: " + myList.get(i) );
			}
		}
		
		System.out.println("\n\n" + myList);
	}

}
