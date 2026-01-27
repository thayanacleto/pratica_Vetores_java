package Vetores;

import java.util.Scanner;

public class media_pares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int n; 
        double media; 
        int soma; 
        int quantidade;

        System.out.println("Quantos elementos vai ter o vetor? ");
        n = sc.nextInt();

        int [] vetor = new int[n];

        soma = 0; 
        quantidade = 0;
        
        for(int i = 0; i < n; i++){
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();

            if(vetor[i] % 2 ==0) {
                soma = soma + vetor[i];
                quantidade++;
            }
            
        } 

        if(quantidade == 0) {
            System.out.println("NENHUM NUMERO PAR DIGITADO");
            
        } 
        else{
            media = (double) soma / quantidade;
            System.out.printf("MEDIA DOS PARES =  %.1f%n", media);

        } 
        
        

        sc.close();


        
    }
    
}
