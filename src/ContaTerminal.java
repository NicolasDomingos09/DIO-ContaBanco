import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numConta;
        String agencia;
        String nomeCliente;
        double saldoConta;

        System.out.println("Digite o número da agência: ");
        agencia = scan.next();

        System.out.println("Digite o número da conta: ");
        numConta = scan.nextInt();

        System.out.println("Digite o nome do cliente: ");
        nomeCliente = scan.next();

        System.out.println("Digite o saldo da conta: ");
        saldoConta = scan.nextDouble();

        System.out.println("Olá "+nomeCliente +  ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numConta + " seu saldo "+ saldoConta+  " já está disponível para saque");



    }
}