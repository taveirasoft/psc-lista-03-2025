import java.util.Scanner;

public class MaiorMenorMedia {
    public static void main(String[] argrs) {
        //Entrada dos números
        try (Scanner sc = new Scanner(System.in)) {
            //Entrada dos números
            System.out.print("Digite o primeiro número: ");
            int num1 = sc.nextInt();

            System.out.print("Digite o segundo número: ");
            int num2 = sc.nextInt();

            System.out.print("Digite o terceiro número: ");
            int num3 = sc.nextInt();

            //Cálculo do maior, menor e média
            int maior = Math.max(num1, Math.max(num2, num3));
            int menor = Math.min(num1, Math.min(num2, num3));
            double media = (num1 + num2 + num3) / 3.0;

            //Saída dos resultados
            System.out.println("Maior número é " + maior);
            System.out.println("Menor número é " + menor);
            System.out.println("Média é " + media);
        }
    }
}