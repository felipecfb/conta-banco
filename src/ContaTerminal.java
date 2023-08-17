import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
        Integer numeroDaConta = sc.nextInt();

        System.out.print("Digite o número da agência: ");
        String agencia = sc.next();

        System.out.print("Digite seu nome: ");
        sc.nextLine();
        String nomeDoCliente = sc.nextLine();

        System.out.print("Digite o saldo da conta: ");
        double saldoDaConta = sc.nextDouble();

        System.out.printf(
                "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeDoCliente, agencia, numeroDaConta, saldoDaConta);

        sc.close();
    }
}
