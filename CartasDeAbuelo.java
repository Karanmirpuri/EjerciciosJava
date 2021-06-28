/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartasdeabuelo;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class CartasDeAbuelo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String palabra;
        
        palabra = sc.nextLine();

        int pruebas;
        int contador;
        int i, j;
        
        pruebas = sc.nextInt();
        while (pruebas != 0) {
            char[] caracteres = palabra.toCharArray();
            char[] caracteres1 = palabra.toCharArray();
            for (int m = 0; m < pruebas; m++) {
                
                i = sc.nextInt();
                
                j = sc.nextInt();
                contador = 0;
                if (i < j) {
                    contador = i;
                    for (int k = i; i < j; k++) {
                         
                            if (caracteres[i] == caracteres1[i + 1]) {
                             
                                contador++;

                           
                            }
                            else{
                                contador--;
                               
                            }
                        
                        i++;
                    }
                } else if (i > j) {
                    contador = j;
                    for (int k = j; j < i; k++) {
                        if (caracteres[j] == caracteres1[j + 1]) {
                                
                                contador++;

                           
                            }
                            else{
                                contador--;
                                
                            }
                        j++;
                    }
                }
                if (contador == j || contador == i) {
                    System.out.println("SI");
                } else {
                    System.out.println("NO");
                }
            }
            System.out.println("");
            sc.nextLine();
            palabra = sc.nextLine();

            pruebas = sc.nextInt();

        }
    }

}
