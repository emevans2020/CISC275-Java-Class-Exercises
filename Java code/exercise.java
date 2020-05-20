import java.util.HashSet;
import java.util.Collection;

// we have a version of it locally 

// Code from class September 26
/** inheritance **/
class Node extends HashSet {
    Node left, right;  //making tree which each node is a hashset of strings via inheritance
    int stringCount = 0;
    public boolean add(Object o){ 
    	// because of polymorphism uses this add
	if (o instanceof String) 
	    stringCount++; 
	return super.add(o); 
    }
    public boolean addAll( Collection n ){
	stringCount += n.size();

	// when it calls super.addAll() need to find out how your code works
	// when using library like collections always know where it is
	// super.addAll goes to abstract class
	return super.addAll(n); 
	// Each element in the collection passed in will be added to the set
	// via the equivalent of calling the add() method on each element. 
	// If the underlying set changes, true is returned
    }

    public static void main(String[] args){
	String s1 = "a";
	String s2 = "b";
	String s3 = "c";
	Node n1 = new Node();
	n1.add(s1);
	n1.add(s2);
	n1.add(s3);
	System.out.println(n1);
	System.out.println(n1.stringCount);
	Node n2 = new Node();
	n2.addAll(n1);
	n2.add('d'); // d is a character so it doesn't count it needs to be a string --> " "
	System.out.println(n2);
	System.out.println(n2.stringCount);
    }
}


///The idea for this came from Josh Bloch, "Effective Java" 
// What the terminal says when try to javac
// Note: exercise.java uses unchecked or unsafe operations.
// Note: Recompile with -Xlint:unchecked for details.
// exercise.java:5: warning: [rawtypes] found raw type: HashSet
// class Node extends HashSet {
//                    ^
//   missing type arguments for generic class HashSet<E>
//   where E is a type-variable:
//     E extends Object declared in class HashSet
// exercise.java:11: warning: [unchecked] unchecked call to add(E) as a member of the raw type HashSet
// 	return super.add(o); 
// 	                ^
//   where E is a type-variable:
//     E extends Object declared in class HashSet
// exercise.java:13: warning: [rawtypes] found raw type: Collection
//     public boolean addAll( Collection n ){
//                            ^
//   missing type arguments for generic class Collection<E>
//   where E is a type-variable:
//     E extends Object declared in interface Collection
// exercise.java:15: warning: [unchecked] unchecked call to addAll(Collection<? extends E>) as a member of the raw type AbstractCollection
// 	return super.addAll(n); 
// 	                   ^
//   where E is a type-variable:
//     E extends Object declared in class AbstractCollection
// exercise.java:5: warning: [serial] serializable class Node has no definition of serialVersionUID
// class Node extends HashSet {
// ^
// 5 warnings
