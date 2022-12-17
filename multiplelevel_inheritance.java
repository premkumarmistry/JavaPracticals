class Animal
{
	void eat()
	{
		System.out.println("Eating..");
	}
}

class Dog extends Animal{
	void bark()
	{
		System.out.println("Barking...");
	}
	
	
}

class Car extends Dog{
    void colour(){
        System.out.println("Colour is black");
    }
}



class multipleinheritance
{
	public static void main(String[] args)  
	{
		Car d =new Car();
		d.eat();
		d.bark();
        d.colour();	
	}
}

// OUTPUT-->>>
// Eating..
// Barking...
// Colour is black

