import java.util.*;

public class Cat1 {
	String name;
	public Cat1 (String n){
		name = n;
	}

	public String toString(){
		return name;
	}

	public static void main(String [] args){
		HashSet <Cat1> hs = new HashSet<>();

		hs.add(new Cat1("Fido"));
		System.out.println(hs);

		hs.add(new Cat1("Phideaux"));
		System.out.println(hs);

		hs.add(new Cat1("Fido"));
		System.out.println(hs);
	}
}
