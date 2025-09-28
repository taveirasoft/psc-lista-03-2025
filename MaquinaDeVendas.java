import java.util.Scanner;

public class MaquinaDeVendas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //Entrada de dados
        System.out.print("Digite o valor da compra: ");
        int valorCompra = sc.nextInt();

        System.out.print("Digite o valor pago: ");
        int valorPago = sc.nextInt();

        //Verifica se o valor pago suficiente
        if(valorPago< valorCompra) {
            System.out.println("Quantia paga insuficiente para realizar a compra! ");
        } else{
            int troco = valorPago - valorCompra;
            System.out.println("\nvalor da compra R$ " + valorCompra);
            System.out.println("\nvalor pago R$ ");
            System.out.println("Troco R$ " + troco);

            //Calculo das notas
            int notas50 = troco/50;
            troco = troco % 50;

            int notas20 = troco/20;
            troco = troco % 20;

            int notas10 = troco/10;
            troco = troco % 10;

            int notas5 = troco/5;
            troco = troco % 5;

            int notas2 = troco/2;
            troco = troco % 2;

            int notas1 = troco;

            //Saída dos resultado
            System.out.println("Notas de R$ 50,00 " + notas50);
            System.out.println("Notas de R$ 20,00 " + notas20);
            System.out.println("Notas de R$ 10,00 " + notas10);
            System.out.println("Notas de R$ 5,00 " + notas5);
            System.out.println("Notas de R$ 2,00 " + notas2);
            System.out.println("Notas de R$ 1,00 " + notas1);








        }

    }
}