package Atividade2;

import java.util.Scanner;

public class Escolinha {
   
    public void exemplo2(){
        
        Scanner sc = new Scanner(System.in);      
        
        System.out.println("Digite o número de matrícula do aluno:");
        int matricula = sc.nextInt();
        
        int time = matricula % 4; // Calcula o time do aluno
        
        switch (time) {
            case 0:
                System.out.println("O aluno de matrícula " + matricula + " foi distribuído para o Time do Chris.");
                break;
                
            case 1:
                System.out.println("O aluno de matrícula " + matricula + " foi distribuído para o Time do Greg.");
                break;
                
            case 2:
                System.out.println("O aluno de matrícula " + matricula + " foi distribuído para o Time do Caruso.");
                break;
                
            case 3:
                System.out.println("O aluno de matrícula " + matricula + " foi distribuído para o Time do Jerome.");
                break;
                
            default:
                System.out.println("Erro: Matrícula inválida!");
                break;
        }
        
        sc.close();
    }
}


