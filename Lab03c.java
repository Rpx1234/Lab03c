//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03c
{
 public static void main( String[] args )
   {
     Scanner keyboard = new Scanner(in);

     out.print("enter a :: ");
     int quadA= keyboard.nextInt();

     out.print("enter b ::");
     int quadB = keyboard.nextInt();

     out.print("enter c :: ");
     int quadC = keyboard.nextInt();
    //add test cases
    
    
     Quadratic test = new Quadratic(quadA, quadB, quadC);
     test.calcRoots();
     test.print();
 }
}