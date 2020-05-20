import java.util.ArrayList;
import java.util.*;

//Write your code, following the instructions in the right side panel
public class Cow {
	String name;
	int numLegs;

	public Cow(String n, int l){
		name = n;
		numLegs = l;
	}

	public String toString(){
		return name+ ", " + numLegs;
	}

public static void main (String[] args){
		ArrayList <Cow> herd = new ArrayList<Cow>();
			herd.add(new Cow ("Bossie", 3)); 
			herd.add(new Cow ("Elsie", 4));
	
	for (Cow c:herd){
		System.out.println(c);
		}
	}
}