package Vetores;

import java.util.Locale;
import java.util.Scanner;

public class dados_pessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n; 

        System.out.println("Quantas pessoas serao digitadas? ");
        n = sc.nextInt(); 

        double [] alturas = new double[n];
        char [] sexo = new char[n];

        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.printf("Altura da %da pessoa:\n", i + 1);
            alturas[i] = sc.nextDouble();
            System.out.printf("Genero da %da pessoa:\n", i + 1);
            sc.nextLine();
            sexo[i] = sc.next().charAt(0);

        }

        double maior = alturas[0];
        double menor = alturas[0]; 

        for(int i = 1; i < n; i++){
            if(alturas[i] < menor){
                menor = alturas[i];
                
            }
        } 

        System.out.printf("menor altura %.2f%n", menor); 


        for(int i = 1; i < n; i++){
            if(alturas[i] > maior){
                maior = alturas[i];
            }
        }

        System.out.printf("maior altura %.2f%n", maior); 


        double soma = 0; 
        int contadorF = 0; 
        int contadorM = 0; 
        double media;

        for(int i = 0; i <n; i++){
            if(sexo[i] == 'F'){
                contadorF++;
                soma =  soma + alturas[i];
                
            }
            else {
                contadorM++;
            }
        }

        if(contadorF > 0) {
            media =  (double) soma / contadorF;
            System.out.printf("Media das alturas das mulheres =  %.2f%n", media ); 
        } 
        else{
            System.out.println("Nenhuma mulher encontrada!");
        }



        System.out.print("Numero de homens = "+  contadorM); 



        sc.close();
        
    }
    
}
