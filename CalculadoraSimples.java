package EquacaoSegundoGrau;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada dos números
        System.out.print("Digite o primeiro número: ");
        double num1 = sc.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = sc.nextDouble();

        // Entrada do símbolo da operação
        System.out.print("Digite a operação (+, -, *, /, ^): ");
        char operacao = sc.next().charAt(0);  // pega o primeiro caractere digitado

        double resultado;

        // Estrutura de decisão
        if (operacao == '+') {
            resultado = num1 + num2;
            System.out.println("Resultado = " + resultado);
        } else if (operacao == '-') {
            resultado = num1 - num2;
            System.out.println("Resultado = " + resultado);
        } else if (operacao == '*') {
            resultado = num1 * num2;
            System.out.println("Resultado = " + resultado);
        } else if (operacao == '/') {
            if (num2 == 0) {
                System.out.println("Erro: divisão por zero não é permitida!");
            } else {
                resultado = num1 / num2;
                System.out.println("Resultado = " + resultado);
            }
        } else if (operacao == '^') {
            resultado = Math.pow(num1, num2); // num1 elevado a num2
            System.out.println("Resultado = " + resultado);
        } else {
            System.out.println("Erro: símbolo da operação inválido.");

        }

        }

    }
