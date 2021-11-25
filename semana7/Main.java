package semana7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Empregado OE = new Empregado("Maria", "Testoni", 1500);
        Empregado Empregado1 = new Empregado();
//variaveis e declarados
        Scanner scan = new Scanner(System.in);
        char desejaRepetir = 's';

        //codigo
        while (desejaRepetir == 's' || desejaRepetir == 'S') {
            System.out.println("Digite o nome: ");
            OE.setNome(scan.next());
            System.out.println("Digite o sobrenome: ");
            OE.setSobrenome(scan.next());
            System.out.println("Digite o salario: ");
            OE.setSalario(scan.nextFloat());

            System.out.println("Valor total do salario com o aumento:  R$" + OE.calcularAumento() + " do funcionario " + OE.getNome() + " " + OE.getSobrenome());
            System.out.println("Gostaria de ver sobre outro funcionario? s-Sim e n-Nao");
            desejaRepetir = scan.next().charAt(0);
        }
}
}