/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edad;

import java.util.Calendar;
import java.util.Scanner;


public class Edad {

  
    public static void main(String[] args) {
      
      Calendar cal= Calendar.getInstance();
      int year= cal.get(Calendar.YEAR);
      int FechaNac;

         Scanner reader = new Scanner(System.in);

        System.out.print( "Ingrese el año de nacimiento " );
        FechaNac = reader.nextInt();

        System.out.println( "Usted tiene " + (year-FechaNac) + " años. " );
    }
   
     
    
}
