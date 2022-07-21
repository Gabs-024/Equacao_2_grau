package Exercicio_Equacao;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Delta delta = new Delta();
        EqXn x = new EqXn();

        System.out.println("Considere a Equacao: Ax^2 Bx C = 0 informe os valores.");

        System.out.println("----- ----- ----- -----");

        System.out.println("Digite o Valor de A?");
        delta.setA(entrada.nextDouble());
        System.out.println("Digite o Valor de B?");
        delta.setB(entrada.nextDouble());
        System.out.println("Digite o Valor de C?");
        delta.setC(entrada.nextDouble());
        delta.calculaDelta();

        System.out.println("----- ----- ----- -----");

        System.out.println("Resolução da equação");
        
        System.out.println("Delta = " + delta.getDelta());
        if (delta.getDelta() < 0){
            System.out.println("Delta deu negativo!");
        } else {
            System.out.println("x1 = " + x.calculaXn(delta));
            System.out.println("x2 = " + x.calculaXp(delta));
        }
    }
}
