import java.util.Scanner;
import edhesive.testing.Math;

public class chapt4problem1{
  public static void main(String[] args){

    /* Write your code here */
  Scanner scan = new Scanner(System.in);
  
  System.out.println("Enter a positive integer.");
  int n = scan.nextInt();

  double ran = Math.random();
  int range = n;
  int min = 1;
  int answer = (int) (ran * range) + min;
  
  System.out.println("Printing 10 random integers from 1 to n...");
  System.out.println(answer);
  System.out.println(answer);
  System.out.println(answer);
  System.out.println(answer);
  System.out.println(answer);
  System.out.println(answer);
  System.out.println(answer);
  System.out.println(answer);
  System.out.println(answer);
  System.out.println(answer);
  }
}