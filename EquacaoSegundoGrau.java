package EquacaoSegundoGrau;

import java.util.Scanner;

public class EquacaoSegundoGrau {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Entrada dos coeficientes
        System.out.print("Digite o valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = sc.nextDouble();

        //Verificações
        if (a == 0 && c != 0) {
            System.out.println("Coeficientes informados incorretamente! ");
        } else if (a == 0 && b != 0) {
            // Equaçãp de primeiro grau
            double raiz = -c / b;
            System.out.println("Essa ér uma equação do primeiro grau! ");
            System.out.println("Raiz real: x = " + raiz);
        } else {
            //Equação de segundo grau
            double delta = (a * b) - (4 * a * c);

            if (delta < 0) {
                System.out.println("Esta equação não possui raízes reais! ");
            } else if (delta == 0) {
                double x = -b / (2 * a);
                System.out.println("Esta equação possui duas raízes reais iguais! ");
                System.out.println("x1 = x2 " + x);

            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Esta equação possui duas raízes reais diferentes! ");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);


            }
        }
    }
}
