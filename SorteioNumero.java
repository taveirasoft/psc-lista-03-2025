package EquacaoSegundoGrau;

import java.util.Scanner;
import java.util.Random;

public class SorteioNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Entrada dos números
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número inteiro: ");
        int num2 = sc.nextInt();

        // Descobrir qual é o menor e o maior
        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        // Sorteio de um número aleatório no intervalo [menor, maior]
        int sorteado = random.nextInt(maior - menor + 1) + menor;

        // Exibir resultado
        System.out.println("Número sorteado: " + sorteado);

        // Verificar se é par ou ímpar
        if (sorteado % 2 == 0) {
            System.out.println("O número " + sorteado + " é PAR.");
        } else {
            System.out.println("O número " + sorteado + " é ÍMPAR.");
        }

    }

}