/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vocalconsonante;

/**
 *
 * @author josue
 */

import java.util.Scanner;
public class VocalConsonante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Ingrese una letra : ");
       char letra = input.next() .charAt(0);
       
       if(letra == 'a'|| letra == 'e'||letra == 'i' || letra == 'o'||letra == 'u' ){
           System.out.println(letra + " Es una Vocal");
       } else {
           System.out.println(letra + " Es una consonante ");
       }
       
       
        System.out.println("==============================");
        System.out.println("TabladeMultiplicar ");
        System.out.println("==============================");
        
        System.out.println("Ingrese un numero ");
        int num = input.nextInt();
        
        int i = 1;
        while(i <= 10){
            System.out.println(num + " x " + i + " = " + (num*i));
             i++; 
        }
        
        System.out.println("==============================");
        System.out.println("SumaDePares ");
        System.out.println("==============================");
         
        System.out.print("Ingrese un número: "); 
        int numero = input.nextInt(); 
         
        int a = 1; 
        int suma = 0; 
        while(a <= numero) { 
            if(a % 2 == 0) { 
                suma += a; 
            } a++; 
        } 
         
        System.out.println("La suma de los números pares del 1 al " + numero 
        + " es " + suma); 
        
        
        
        System.out.println("==============================");
        System.out.println("NumerosPrimos ");
        System.out.println("==============================");
         System.out.print("Ingrese un número: "); 
        int Num = input.nextInt(); 
         
        int s = 2; 
        boolean esPrimo = true; 
         
        while(s <= Num/2) { 
            if(Num % s == 0) { 
                esPrimo = false; 
                break; 
            } 
            s++; 
        } 
         
        if(esPrimo) { 
            System.out.println(Num + " es primo."); 
        } else { 
            System.out.println(Num + " no es primo."); 
        } 
        
        
    } 

        
    }
    

    
    
    

