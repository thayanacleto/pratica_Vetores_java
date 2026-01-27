package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class maior_posicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, posmaior;
        double maior;
        
       
        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt(); 


        double [] numeros = new double[n];

        for(int i = 0; i<n; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextDouble();

        }

        maior = numeros[0];
        posmaior = 0;
        
        for (int i = 1; i<n; i++){
            if (numeros[i] > maior) {
                maior = numeros[i];
                posmaior = i;
            }
        }
        System.out.printf("MAIOR VALOR = %.1f\n", maior);
        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);





    }
    
}
