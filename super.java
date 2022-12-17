class employee {
 int wt = 8;
}

class clerk extends employee {
 int wt = 10;  
 void display() {
  System.out.println(super.wt); 
 }

 public static void main(String args[]) {
  clerk c = new clerk();
  c.display();
 }
}

//OUTPUT
//8