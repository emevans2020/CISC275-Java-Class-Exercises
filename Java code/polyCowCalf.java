// From class October 1
class Cow {
    String noise = "moo";
    
    String speak(){
		return noise;
    }
    void converse(Cow c1){
    	// this. is Cow 						speak is polymorphic
		System.out.println( this.speak() + " to you; " + c1.speak() );
    }
}
class Calf extends Cow {
    String sound = "meh";
    String speak(){
		return sound;
    }
    void converse(Calf c1){
		System.out.println( this.speak() + "(Calf) to you; " + c1.speak() );
    }
}

class Main {
    public static void main(String[] a){
	Cow c1 = new Cow();
	Calf c3 = new Calf();
	Cow c2 = c3;
	
	System.out.println( c1.speak() );  // moo  1 (not polymorphism - Cow type reference pointing to Cow)
	System.out.println( c2.speak() );  // meh  2 (Cow reference, Calf reference - polymorphism!)
	
	// superclass reference, but not override IT IS an Overload
	// C1 is a cow reference, calf is bigger in memory, but has Cow inside
	c1.converse(c3);                   // moo to you; meh   3
	
	c3.converse(c1);                   // meh to you; moo   4
	c1.converse(c2);                   // moo to you; meh 5
	c2.converse(c3);                   // meh to you; meh  6
	c3.converse(c3);                   // meh(Calf) to you; meh   7
    }
}

// cow doesn't have access to calf, cow has no choice on converse method but calf does

/*
 polymorphism - when we call a method from a superclass reference we get 
 polymorphic behavior as long as it's the same method; in java we always get 
 polymorphic behavior
 polymorphism happens at RUNTIME, we don't know before runtime (only know we have superclass reference)

 Cow is a "superclass"

 overloading vs. overriding
 Overloading the parameters are different -> in Cow parameter is type Cow, but in 
 calf the parameter is type Calf in the converse function (different methods, not polymorphic - decided
 at )

 Note: Overloaded methods are determined at compile time, not runtime
(that would be overriden methods, which are polymorphic). So above has c2, 
a cow ref, so method chosen will be from cow class.
*/

