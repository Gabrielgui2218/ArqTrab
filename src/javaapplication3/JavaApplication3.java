/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

import java.util.Scanner;

public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      int escolha, A, B;
      int escolha2;
      int ula;
      Scanner sc = new Scanner(System.in);
      ula = 0;
      A = 0;
      B = 0;

      do{
        System.out.println("Menu principal da ULA");
        
        System.out.println("Escolha uma opção: \n1- definir registrado A \n2- definir registrador B \n3-Ler registrador A \n4- ler registrador B \n5 - ler registrador de flag \n6 - Definir operação \n7 - Executar Ula \n8 - Sair");
        escolha = sc.nextInt();
        switch(escolha){
           case 1:
                System.out.println("Defina o registrador A: ");
                A = sc.nextInt();
                break;
           case 2:
            System.out.println("Defina o registrador B: ");
            B = sc.nextInt();
                break;
           case 3:
            System.out.println("O registrador A é: " + A);
                break;
            case 4:
            System.out.println("O registrador B é: " + B);
                break;
            case 5:
            System.out.println("O Flag é: ");
            if(A + B > 0){
                System.out.println("O Flag é OVERFLOW");
            }else if(A - B == 0){
                System.out.println("O Flag é ZERO BIT = TRUE");
            } else if (A < B){
                System.out.println("O Flag é NEGATIVE");
            } else{
                System.out.println("Erro na flag");
            }       
                break;
            case 6:
            System.out.println("Defina a operação: 1- Soma, 2- Subtração, 3- multiplicação, 4- divisão");
            escolha2 = sc.nextInt();
            if (escolha2 == 1){
                ula = A + B;
            }
            else if(escolha2 == 2){
                ula = A - B;
            }
            else if(escolha2 == 3){
                ula = A * B;
            }
            else if(escolha2 == 4){
                ula = A / B;
            }
            else{
                System.out.println("Valor incorreto");
            }    
            case 7:
            System.out.println("ULA =" + ula);
                break;           
        }
        }while (escolha != 8);

        }
}


