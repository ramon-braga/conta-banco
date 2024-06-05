import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Agência:");
        String agencia = scanner.next();

        System.out.println("Nome:");
        String nomeCiente = scanner.next();

        System.out.println("Saldo:");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCiente + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numeroConta +" e seu saldo "+ saldo +" já está disponível para saque");

    }
}
