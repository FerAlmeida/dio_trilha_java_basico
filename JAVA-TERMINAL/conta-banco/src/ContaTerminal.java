import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int contaCorrente;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("**********   BEM VINDO AO $$$ NOSSO BANK $$$  *********");
        System.out.println();
        System.out.println(" ----- SEU DINHEIRO EM SEGURANÇA E COM RENTABILIDADE -----");
        System.out.println();
        System.out.println(" Por favor, digite o número da sua Conta:");
        contaCorrente = sc.nextInt();

        System.out.println(" Agora digite o número da sua Agência: ");
        agencia = sc.next();

        System.out.println(" Me informe o seu nome: ");
        nomeCliente = sc.next();
        sc.nextLine();

        System.out.println(" Informe o valor a ser depositado: ");
        saldo = sc.nextDouble();

        System.out.println();
        System.out.printf("Olá %s, obrigado por criar uma conta em "
                + " $$$ NOSSO BANK $$$. \n"
                + "A sua agência é de número %s.\n"
                + "A sua Conta é a de número %s.\n"
                + "O valor depositado de %.2f, já encontra-se disponível em sua conta.\n\n"
                + " *********  Conte sempre com $$$ NOSSO BANK $$$  ********", nomeCliente, agencia,contaCorrente,saldo);

        sc.close();
    }

}

