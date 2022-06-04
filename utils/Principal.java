package utils;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         double dinicial,dfinal;
 System.out.println("entre com a distancia inicial");
         dinicial=sc.nextDouble();
 System.out.println("entre com a distancia final");
         dfinal=sc.nextDouble();
         kmPercorrido km1 = new kmPercorrido();
         System.out.println(km1.mostrardistancia(dinicial, dfinal));  
         sc.close(); 
        }
    
}
