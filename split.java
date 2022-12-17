 class split
{
public static void main(String[] args)
{
	String s1= "Example of String";
	String[] words=s1.split("\\s");
	for(String w:words)
	{
		System.out.println(w);
		
	}
	
}
}

// OUTPUT
// Example
// of
// String