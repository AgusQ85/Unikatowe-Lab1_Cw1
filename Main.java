package jeden;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

 

    public static void main(String[] args) {

    	 Scanner scanner = new Scanner(System.in);
    	 
    	 System.out.println("Program zliczajacy ilosc liczb wprowadzonych przez Ciebie unikalnych liczb calkowitych!");
    	
    	 System.out.println("Podaj pierwsza liczbę:");
         int n1 = scanner.nextInt();
         System.out.println("Podaj drugą liczbę, liczby moga sie powtarzac :)");
         int n2 = scanner.nextInt();
         System.out.println("Podaj trzecia liczbę:");
         int n3 = scanner.nextInt();
         System.out.println("A teraz grzecznie podaj czwarta liczbę:");
         int n4 = scanner.nextInt();
         System.out.println("I piata, ostatnia :) :");
         int n5 = scanner.nextInt();
    	
         int ilosc = 0;

         int[] tablica = {n1, n2, n3, n4, n5};


        System.out.println("Podales liczby: " + Arrays.toString(tablica));  //Wypisanie zawartosci tablicy:
               
        System.out.println("Wartość/i, które występują tylko raz:\n"); //Wartosci, ktore sie nie powtarzaja:
       
               for (int i = 0; i < tablica.length; i++) {  // Przeglądanie po lolei wszystkich elementów w tablicy

         

            boolean unikalna = true; 

            // porownanie elementu z pozostalymi (bez porownania z samym soba)

            for (int j = 0; j < tablica.length; j++) {

                if (i != j) {                    

                    if (tablica[i] == tablica[j]) {
                        unikalna = false; // jesli wartosc sie powtarza, to nie jest unikalna, wiec "false"...

                    }
                }
            }

            // Jeśli znacznik jest bez zmian, to znaczy ze liczba jest unikalna

            if (unikalna) {

                System.out.println(tablica[i]);
                ilosc ++;                        
                              
            }

        } if (ilosc==0)
        {
       	 System.out.println("\nniestety wszystkie elementy sie powtorzyly!");
       }
        System.out.println( "\nUnikalnych liczb podales/as: " + ilosc +" szt.!");
        }
    }

 

        