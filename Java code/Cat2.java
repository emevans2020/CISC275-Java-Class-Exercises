
import java.util.*;

public class Cat2 {
	String name;
	public Cat2 (String n){
		name = n;
	}

	public String toString(){
		return name;
	}

	@Override
	public boolean equals(Object other){
		return this.name.equals(((Cat2)other).name);
	}
	// there are no parameters because giving back hashcode of objects have now
	// hashCode is cheap
	// easiest way to remove duplications is to create a hashCode
	@Override
	public int hashCode(){
		return name.hashCode();
		// every object has a hashCode - we are not computing hashCodes
	}

	public static void main(String [] args){
		HashSet <Cat2> hs2 = new HashSet<>();

		// Why isn't it calling the equals method
		// Need to compare the hashcodes of each
		// 
		hs2.add(new Cat2("Fido"));
		hs2.add(new Cat2("Fido"));
		hs2.add(new Cat2("Emily"));
		hs2.add(new Cat2("Alyssa"));
		System.out.println(hs2);

		/* Part 2 in class */
		HashSet <Cat2> hs3 = new HashSet<>();
		hs3.add(new Cat2("Emily"));
		hs3.add(new Cat2("Peach"));
		hs3.add(new Cat2("Lucy"));
		hs3.add(new Cat2("Ethel"));
		hs3.add(new Cat2("Fido"));
		System.out.println(hs3);

		HashSet<Cat2> union = new HashSet<>();
		union.addAll(hs2);
		union.addAll(hs3);
		System.out.println(union);

		HashSet<Cat2> intersection = new HashSet<>();
		intersection.addAll(hs2);
		intersection.retainAll(hs3);
		System.out.println(intersection);
	}
}

/* Takes it and translates it to some integer where you do integer % HashSetSize
collision means when you get into underlying array, then two numbers map into 
same location going to use .equals 
when you have objects that don't equal then you can do chaining*/

