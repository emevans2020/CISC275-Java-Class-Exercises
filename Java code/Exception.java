
/* Emily Evans CISC275 Exceptions September 17-19 */
/* Java’s Error is a subclass of Throwable that indicates serious problems that a reasonable application 
should not try to catch (an exceptional situation has occurred)
Java Exception indicates conditions that a reasonable application might want to catch. Checked exceptions 
need to be declared in a method or constructor's throws clause if they can be thrown by the execution of the
method or constructor and propagate outside the method or constructor boundary.
Java Throwable is the Java superclass of all errors and exceptions in the Java language 
Java RuntimeException extends Exception - it is the superclass of those exceptions that can be thrown during 
the normal operation of the Java Virtual Machine, runtime and its subclasses are unchecked exceptions */

// 2. write XisFiveException
public class XisFiveException extends Exception{
	// doesn't need any attributes, methods, or constructors
	// when prototyping write the simplest code
}

try {
	f1(x)
}
catch (XisFiveException){
	e.printStackTrace();
}

try {
	f1(x)
}
catch (XisFiveException){
	x=6;
}

// void f1(x){
// 	throws XisFiveException
// 	catch {
// 		f2();
// 	}
// }

f2 (){
	try {
		f1(5);
	}
	catch {
		f1(x+1);
	}
}