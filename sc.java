import java.util.Scanner;
class sc
{

	
 public static void main(String args[]){
 
 String a ,b;
 
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the first string");
 a = sc.nextLine();
 System.out.println("Enter the value of seco of string");
 b= sc.nextLine();
 
 if(a.equals(b) == true)
 System.out.println("Both are equal");
 else
 System.out.println("Both are Bot equal");
 }
}

// OUTPUT -> 
// Enter the first string
// Prem
// Enter the value of seco of string
// Mistry
// Both are Bot equal