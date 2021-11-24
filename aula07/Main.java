package aula07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        //classe, continua não funcionando
        Aluno OA = new Aluno("colega", 1234, 8, 10);
        System.out.println("media do aluno: " + OA.CalcularMedia());
        Aluno Aluno1 = new Aluno();
        
        //menu  
        int i = 0;
        while (i != 5) {
            System.out.println("Digite o nome do aluno: ");
            Aluno1.setNome(scan.next());
            System.out.println("Digite o numero da matricula: ");
            Aluno1.setMatricula(scan.nextInt());
            System.out.println("Digite nota da prova: ");
            Aluno1.setNotaProva(scan.nextFloat());
            System.out.println("Digite a nota do tralaho: ");
            Aluno1.setNotaTrabalho(scan.nextFloat());
System.out.println("media do aluno: " + Aluno1.CalcularMedia());

        }

    }
}
