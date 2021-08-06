package calculadoraJava;
/*
Autor: Gustavo Da Silva Perinazzo
Data: 06/08/2021

 */

import java.util.Scanner;

public class calculadoraSimples {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Entre com dois números inteiros: ");
            Scanner input = new Scanner(System.in);
            int x = input.nextInt(), y = input.nextInt() ;


            System.out.println("[1] - Para efetuar uma soma");
            System.out.println("[2] - Para efetuar uma subtração");
            System.out.println("[3] - para efetuar uma multiplicação");
            System.out.println("[4] - Para efetuar uma divisão");
            System.out.println("[5] - Sair do menu");

            int numeroEscolhido;
            numeroEscolhido = input.nextInt();
            switch (numeroEscolhido) {
                case 1:
                    System.out.println("A soma dos números "+ x + " e " + y + " resulta em: " + soma(x, y));
                    continue;
                case 2:
                    System.out.println("A subtração dos números " + x + " e " + y +" resulta em: " + sub(x, y));
                    continue;
                case 3:
                    System.out.println("A multiplicação dos números "+ x + " e "+ y + " resulta em:" + mult(x, y));
                    continue;
                case 4:
                    System.out.println("A divisão entre os números "+ x + " e " + y + " resulta em: " + div(x, y));
                    continue;
                    default:
                        System.out.println(" Saindo do menu! :) ");
                        System.exit(0);
            }
        }
    }
    public static int soma (int x, int y){
        return x + y;
    }
    public static int sub ( int x, int y){
        return x - y;
    }
    public static int mult ( int x, int y){
        return x * y;
    }
    public static int div ( int x, int y) {
        return x / y;
    }
}

