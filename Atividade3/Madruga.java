package Atividade3;

import java.util.Scanner;

public class Madruga {
   
    public void exemplo3() {
        
        Scanner sc = new Scanner(System.in);
         
         System.out.println("Digite a quantidade (em Kg) de morangos comprados:");
         double qtdMorangos = sc.nextDouble();
         
         System.out.println("Digite a quantidade (em Kg) de maçãs compradas:");
         double qtdMacas = sc.nextDouble();
         
         System.out.println("Digite a quantidade (em Kg) de bananas compradas:");
         double qtdBananas = sc.nextDouble();
         
         double valorTotal = qtdMorangos * 3.5 + qtdMacas * 2.3 + qtdBananas * 1.8; // Calcula o valor total da compra
         
         if (qtdMorangos + qtdMacas + qtdBananas > 15 || valorTotal > 30) {
             valorTotal *= 0.9; // Aplica o desconto de 10% se a compra ultrapassar R$ 30,00 ou a quantidade for maior que 15 kg
         }
         
         System.out.println("O valor total da compra é R$ " + valorTotal);
         
         sc.close();
     }
 }
 
 

