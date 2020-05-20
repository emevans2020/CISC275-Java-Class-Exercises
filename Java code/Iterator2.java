import java.util.Iterator;

public class Triple2 implements Iterable{
	int [] data = {3,6,9};

@Override
	public Iterator iterator () {return new SequenceGen();}

	private class SequenceGen implements Iterator {
		private int curr;

		SequenceGen() {curr = 0;}

		public boolean hasNext() {return true;}

		public Object next () {
			Object o = data [curr];
			curr = (curr + 1) % 3;
			return o;
		}

		public void remove (){
			throw new RuntimeException("don't do this");
		}
	}

	public static void main(String[] args) {
		Triple t = new Triple();
		Iterator ti = t.iterator();
		for(int i = 0; i < 10; i++)
			if (ti.hasNext())System.out.print(ti.next() + "");
		System.out.println();
	}
}