import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
           System.out.println("---------------------------------------------------");
           System.out.println("Olá, Seja Bem Vindo ao  $$$ NOSSO BANK $$$ ");
           System.out.println("        Segurança e Rentabilidade.     ");
           System.out.println("---------------------------------------------------");
           System.out.println("Por Favor, escolha uma das operações abaixo:");
           System.out.println("");
           System.out.println("""
             1 - DEPÓSITOS
             2 - SAQUES
             3 - TRANSFERÊNCIAS
             4 - SAIR
             """);

            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o valor a ser Depositado:R$ ");
                    double valorDepositado = scanner.nextDouble();
                    saldo += valorDepositado;
                    System.out.println("Seu Depósito foi realizado e já encontar-se na sua conta!");
                    System.out.println("Seu Saldo atual é:R$ " + saldo);
                    break;
                case 2:
                    System.out.println("Informe o valor de Saque:R$ ");
                    double valorSaque = scanner.nextDouble();
                    if(valorSaque > saldo){
                        System.out.println("Operação não foi realizada, seu Saldo é Insuficiente!");
                        System.out.println("Refaça a sua operação.");
                    }
                    else {
                    saldo -= valorSaque;
                    System.out.println("Seu Saque foi realizado com Sucesso!");
                    System.out.println("Seu Saldo atual é:R$ " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Informe o valor da Tranferência:R$ ");
                    double valorTransferencia = scanner.nextDouble();
                    if(valorTransferencia > saldo){
                        System.out.println("Operação não foi realizada, seu Saldo é Insuficiente!");
                        System.out.println("Refaça a sua operação.");
                    }
                    else {
                    saldo -= valorTransferencia;
                    System.out.println("Sua Transferência foi realizado com Sucesso!");
                    System.out.println("Seu Saldo atual é:R$ " + saldo);
                    }
                    break;
                  
                case 4:
                    System.out.println("Obrigado por utilizar Nossos Serviços.");
                    System.out.println("Conte sempre com  $$$ NOSSO BANK $$$ ");
                    continuar = false;  // Atualiza a variável de controle para encerrar o loop
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
