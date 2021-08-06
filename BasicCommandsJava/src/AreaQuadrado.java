/*
 *   Autor: Gustavo Perinazzo
 *   Data: 06//08/2021
 *   Simples código para o calculo da área de um quadrado
 *
 * */
import java.util.*;

public class AreaQuadrado {
    public static void main(String[] args) {
        var in = new Scanner(System.in);
        System.out.println("Informe o valor do lado do quadrado para o calculo: ");
        double ladoQuadrado = in.nextDouble();
        double areaQuadrado = ladoQuadrado * ladoQuadrado;
        System.out.println(" O valor da área do quadrado será: " + areaQuadrado);
    }
}

