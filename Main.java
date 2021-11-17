package semana6;

import java.util.Scanner;

public class Main {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float moedaD;
        float moedaR;
        float tempC;
        float tempF;

        System.out.println("Digite o valor do dolar no atual momento: ");
        float dolar = scan.nextFloat();
        System.out.flush();

        int i = 0;
        while (i != 5) {
            System.out.println("Digite 1- para converter Real em Dolar" + "\n"
                    + "Digite 2- para converter Dolar em Real" + "\n"
                    + "Digite 3- para converter Celsius em Fahrenheit" + "\n"
                    + "Digite 4- para converter Fahrenheit em Celsius" + "\n"
                    + "Digite 5- para sair" );
            i = scan.nextInt();

            switch (i) {

                case 1:
                    System.out.println("Digite o valor em Real que gostaria de converter: ");
                    moedaR = scan.nextFloat();
                    moedaD = moedaR / dolar;
                    System.out.println(moedaD + " dolares");
                    break;

                case 2:
                    System.out.println("Digite o valor em Dolar que gostaria de converter: ");
                    moedaD = scan.nextFloat();
                    moedaR = moedaD * dolar;
                    System.out.println(moedaR + " reais");
                    break;

                case 3:
                    System.out.println("Digite o valor em Celsius: ");
                    tempC = scan.nextFloat();
                    tempF = (tempC * 1.8f) + 32;
                    System.out.println(tempF + " °F");
                    break;

                case 4:
                    System.out.println("Digite o valor em Fahrenheit: ");
                    tempF = scan.nextFloat();
                    tempC = (tempF - 32) / 1.8f;
                    System.out.println(tempC + " °C");
                    break;
                    }
            
                    if (i < 5){
                    System.out.println("Digite 5 para finalizar ou 1 para nova conversão");
                    i = scan.nextInt();
                    }

            }
        }
    }

