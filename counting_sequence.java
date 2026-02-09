import java.util.Scanner;
public class counting_sequence {
  public static void main(String args[]){
    Scanner in = new Scanner(System.in);
    System.out.println("Enter the number of terms in the counting sequence:");
    int n= in.nextInt();
    int count=0;
    while(n>=0){
      int rem= n%10;
      if(rem==5){
        count++;
      }
      n = n/10;
    }
    System.out.println("The number of 5's in the counting sequence is: " + count);
  }  
}
