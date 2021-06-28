/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package marypoppins;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class MaryPoppins {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int numero;
        
        String palabra;
        int contador=0;
        char caracteres[];

        numero = sc.nextInt();
        sc.nextLine();
        char array[] = new char[numero];

            for (int i = 0; i < array.length; i++) {
            palabra = sc.nextLine();
            caracteres = palabra.toCharArray();
            

            for (int j = caracteres.length - 1; j >= 0; j--) {
              if(Character.isUpperCase(caracteres[caracteres.length-1-j])){
                   
                System.out.print(Character.toUpperCase(caracteres[j]));
            } else{
                   System.out.print(Character.toLowerCase(caracteres[j])); 
                    }
            }

            System.out.println("");
          

        }
    }
}
