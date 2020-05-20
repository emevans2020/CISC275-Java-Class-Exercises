import java.util.HashSet;
// Class Tueusday October 8 CISC275
// there is an is-a relationship between cow and animal

class Node extends HashSet{
	Node left, right;
	int stringCount = 0;

	// why did someone make it a HashSet - because we want to put data into it (Strings)
	public boolean add (Object o){
		if (o instanceof String)
			stringCount ++;
			return super.add(o);
	}

	public boolean addAll (Node n){
		stringCount += n.stringCount;
		return super.addAll(n);
	}

	public static void main (String[] args){
		String s1 = "a";
		String s2 = "b";
		String s3 = "c";
		Node n1 = new Node();
		n1.add(s1);
		n1.add(s2);
		n1.add(s3);
		System.out.println("This prints out n1" + "This prints out n1 string count: " + n1);
		System.out.println("This prints out n1 string count: " + n1.stringCount);
		Node n2 = new Node();
		n2.addAll(n1);
		System.out.println("n2: " + n2);
		System.out.println("n2 string count: "+  n2.stringCount);
	}
}
/* 
What if gave another attribute: HashSet data; (DO this)
	Would have to say n1.data.add("a"); instead of just n1.add("a");
before our node was the data structure (inheritance is-a), now we 
are choosing a data structure (composition has-a)

*/