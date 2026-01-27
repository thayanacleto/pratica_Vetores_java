package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class abaixo_da_media {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        int n;
        double soma;
        double media;


        System.out.print("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        double [] reais = new double[n];

        soma = 0; 
        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            reais[i] = sc.nextDouble();
            soma = reais[i] + soma;
        } 

        media = soma /n; 
        System.out.printf("MEDIA DO VETOR %.3f%n ", media);

        System.out.println("ELEMENTOS ABAIXO DA MÉDIA: ");

        for(int i = 0; i < n ; i++){
            if(reais[i] < media){
               	System.out.printf("%.1f\n", reais[i]);          }

        }

        



        sc.close();
    }
    
}
