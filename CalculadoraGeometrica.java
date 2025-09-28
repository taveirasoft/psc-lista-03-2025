package EquacaoSegundoGrau;

import java.util.Scanner;

public class CalculadoraGeometrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Digite o código da operação (1-Perímetro, 2-Área, 3-Volume): ");
        int operacao = sc.nextInt();

        System.out.print("Digite o valor do raio: ");
        double raio = sc.nextDouble();

        //Valor de PI
        double pi = 3.141592;

        //Estrutura de decisão
        if (operacao == 1) {
            double perimetro = 2 * pi * raio;
            System.out.println("Perímetro do círculo = " + perimetro);
        } else if (operacao == 2) {
            double area = pi * raio * raio;
            System.out.println("Area do círculo = " + area);
        } else if (operacao == 3) {
            double volume = (4.0 / 3.0) * pi * raio * raio * raio;
            System.out.println("Volume da esfera = " + volume);
        } else {
            System.out.println("Erro: código de operação inválido! ");






        }

    }
}
