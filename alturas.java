package application;

import java.util.Locale;
import java.util.Scanner;

public class alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        
        int n;  
        double alturaTotal, alturaMedia; 
    

        System.out.println("Quantas pessoas serão digitadas? ");
        n = sc.nextInt(); 
        
        String[] nomes = new String[n]; 
        int [] idades = new int[n]; 
        double [] alturas = new double[n];

         // LEITURA DOS DADOS
        for(int i=0; i<n; i++){ 
            System.out.printf("Dados da %da pessoa:\n", i + 1  );
            System.out.println("Nome: ");
            nomes[i] = sc.next(); 
            System.out.println("Idade: ");
            idades[i] = sc.nextInt(); 
            System.out.println("Altura: ");
            alturas[i] = sc.nextDouble();

        } 

        // CÁLCULO DA ALTURA MÉDIA
        alturaTotal = 0; 
        for(int i=0; i<n; i++){
            alturaTotal =+ alturas[i];
        } 
        alturaMedia = alturaTotal / n; 

        // CONTAR PESSOAS COM MENOS DE 16
        int contador = 0;
        for (int i = 0; i < n; i++){ 
            if(idades[i] < 16){
                contador++;
            }       
        } 
      
         // CÁLCULO DA PORCENTAGEM
         double menos16 = (double) contador / n * 100; 


       
        
        // SAÍDA
        System.out.printf("Altura média: %.2f%n   ", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", menos16);

        for(int i = 0; i < n; i++){
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }
                
        sc.close();

       }
    
}
