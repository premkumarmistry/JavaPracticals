class constructor_overloading{
	
	constructor_overloading(){
		System.out.println("This is default constructor");
	}
	
	constructor_overloading(int a ){
		System.out.println("This is Integer value constructor");
	}
	
	constructor_overloading(double a ){
		System.out.println("This is double value constructor");
	}
	constructor_overloading(String a ){
		System.out.println("This is String value constructor");
	}
	
	public static void main(String args[]){
		 constructor_overloading t =  new constructor_overloading();
		  constructor_overloading t2 =  new constructor_overloading(4);
		   constructor_overloading t3 =  new constructor_overloading(1.2);
		 constructor_overloading t4 =  new constructor_overloading("prem");
		
	}
}

// OUTPUT--->>>>
// This is default constructor
// This is Integer value constructor
// This is double value constructor
// This is String value constructor