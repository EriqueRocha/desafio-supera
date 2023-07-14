import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double valor = scanner.nextDouble();
        int notas, moedas;
        int valorInteiro = (int) valor;
        int centavos = (int) Math.round((valor - valorInteiro) * 100);

        System.out.println("NOTAS:");
        notas = valorInteiro / 100;
        System.out.println(notas + " nota(s) de R$ 100.00");
        valorInteiro %= 100;

        notas = valorInteiro / 50;
        System.out.println(notas + " nota(s) de R$ 50.00");
        valorInteiro %= 50;

        notas = valorInteiro / 20;
        System.out.println(notas + " nota(s) de R$ 20.00");
        valorInteiro %= 20;

        notas = valorInteiro / 10;
        System.out.println(notas + " nota(s) de R$ 10.00");
        valorInteiro %= 10;

        notas = valorInteiro / 5;
        System.out.println(notas + " nota(s) de R$ 5.00");
        valorInteiro %= 5;

        notas = valorInteiro / 2;
        System.out.println(notas + " nota(s) de R$ 2.00");
        valorInteiro %= 2;

        System.out.println("MOEDAS:");
        moedas = valorInteiro;

        System.out.println(moedas + " moeda(s) de R$ 1.00");

        System.out.println(centavos + " moeda(s) de R$ 0.01");
        centavos %= 100;

        moedas = centavos / 50;
        System.out.println(moedas + " moeda(s) de R$ 0.50");
        centavos %= 50;

        moedas = centavos / 25;
        System.out.println(moedas + " moeda(s) de R$ 0.25");
        centavos %= 25;

        moedas = centavos / 10;
        System.out.println(moedas + " moeda(s) de R$ 0.10");
        centavos %= 10;

        moedas = centavos / 5;
        System.out.println(moedas + " moeda(s) de R$ 0.05");
        centavos %= 5;

        System.out.println(centavos + " moeda(s) de R$ 0.01");

        scanner.close();
    }
}
