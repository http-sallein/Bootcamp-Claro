import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o número da agência");
        int numeroAgencia = terminal.nextInt();


        System.out.println("Digite o nome da agência");
        String nomeAgencia = terminal.next();

        System.out.println("Digite o seu nome");
        String nomeUsuario = terminal.next();

        System.out.println("Digite o seu saldo");
        double saldo = terminal.nextDouble();

        System.out.println(
                "Olá " + nomeUsuario +
                " brigado por criar uma conta em nosso banco, sua agência é "
                + numeroAgencia +
                " conta " + numeroAgencia + " e seu saldo " + saldo +
                " já está disponível para saque"
        );
    }
}