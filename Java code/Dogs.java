import java.awt.List;
import java.util.*;

class Dog {
	String name;

Dog (String n) {
	this.name = n;
}

public String toString(){
return name;
}
}
public class Main {
public static void main(String[] args) {
	Collection <Dog>pack = new ArrayList <Dog>();
	Dog d1 = new Dog ("Fido");
	Dog d2 = new Dog ("Spot");
	Dog d3 = new Dog ("Lucy");

	pack.add(d1);
	pack.add(d2);
	pack.add(d3);
	
	System.out.print(pack);

	for (Dog d: pack){
		if (d.name == "Spot"){
		System.out.println(d);
	}
}

// Iterator
Iterator <Dog> iterator = pack.iterator();
	while (iterator.hasNext()){
		if (iterator.next().name == "Spot"){
			pack.add(new Dog("Sally"));
			}
		}
	}
}
