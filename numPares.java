package Vetores;

import java.util.Scanner;

public class numPares {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);  

        int n; 

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();

        int [] numeros = new int[n];

        for(int i = 0; i<n; i++){
            System.out.println("Digite um numero: ");
            numeros[i] = sc.nextInt();

        } 

        System.out.println("NUMEROS PARES: ");

       int contador = 0;

        for(int i = 0; i<n; i++){
            if(numeros[i] % 2 == 0 ) {
                System.out.printf( "%d ", numeros[i]);

                contador++;


            }
        } 

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", contador);




        sc.close();

    }
    
}
