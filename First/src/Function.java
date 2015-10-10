
public class Function {

	public static void main(String[] args) {

int a=10;
int b=20;
System.out.println("Value of a before swap is " + a);
System.out.println("Value of b before swap is " + b);

swapfunction(a, b);
	
System.out.println("Value of a after swap is " + a);
System.out.println("Value of b after swap is " + b);
	}

public static void swapfunction(int a, int b) {
		
		int tmp;
		tmp=a;
		a=b;
		b=tmp;
		
		System.out.println("Value of a inside swap function is " + a);
		System.out.println("Value of b inside swap function is " + b);
		
	}
	
	
	
	
}
