package Vetores;

import java.util.Scanner;

public class mais_velho {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        int maiorIdade;
        int posicao;
        

        System.out.println("Quantas pessoas você vai digitar? ");
        n = sc.nextInt(); 

        int [] idade = new int[n];
        String [] nome = new String[n];

        for(int i = 0; i < n; i ++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            System.out.println("Nome: ");
            nome[i] = sc.next();
            System.out.println("Idade: ");
            idade[i] = sc.nextInt();

        }

        maiorIdade = idade[0];
        posicao = 0; 

        for(int i = 1; i < n; i++ ){
            if(idade[i] > maiorIdade){
             maiorIdade = idade[i];
             posicao = i;

             


            }
        }
       

        System.out.println("NOME DO MAIS VELHO" + nome[posicao]);




        sc.close();

        

    }
    
}
