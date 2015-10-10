
public class myfirst {

	myfirst(){             //default constructor 
		
	}
	
	int a, b, c;
	
	public int addvalue(int a, int b){  // method with integer as return value
		
		c=a+b;
		return c;
	}
	
}

class one
{
	public static void main(String[] args) {
		
	
		myfirst val= new myfirst();  // object initialization 
		val.addvalue(44,13);// using method of class myfirst after initialization 
		System.out.println("The result is " + Integer.toString(val.addvalue(44,13)));
	}
	
}

