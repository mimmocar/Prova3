import java.util.*;

class Sum {

  public static void main(String args[]) {
  
    int number1, number2, sum;
    
    Scanner sc = new Scanner(System.in);
   
    System.out.println("Insert one number");
    number1 = sc.nextInt();
    
    System.out.println("Insert another number");
    number2 = sc.nextInt();
    
    sum = number1 + number2;
    
    System.out.println("The sum of " + number1 + "and " + number2 "is " + sum);
    
  }

}
