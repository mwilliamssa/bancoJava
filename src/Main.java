import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String nome = "Matheus Williams";
        String tipoConta = "Corrente";
        double saldoInicial = 2500;
        double pix;
        boolean saldoInsuficiente = false;
        Scanner leitura = new Scanner(System.in);
        int opcoes = 0;
        System.out.printf(String.format("""
                Dados do cliente:
                
                Nome do cliente: %s
                Tipo de conta do cliente: %s
                Saldo do cliente: R$%.2f
                
                
                """, nome, tipoConta, saldoInicial));
        while (opcoes != 4){
            System.out.println("""
                    Operações
                    
                    1- Consultar saldos
                    2- Receber valor
                    3- Saque
                    4- sair
                    
                    Digite a opção desejada:""");
            opcoes = leitura.nextInt();

            switch (opcoes) {
                case 1:
                    System.out.println("Consultar sados");
                    System.out.printf("O saldo é de R$%.2f%n", saldoInicial);
                    break;
                case 2:
                    System.out.println("Receber valor");
                    pix = leitura.nextDouble();
                    saldoInicial += pix;
                    System.out.printf("Seu saldo atual é de R$%.2f%n", saldoInicial);
                    break;
                case 3:
                    System.out.println("Sacar valor");
                    while(!saldoInsuficiente) {
                        System.out.println("Qual o valor desejado para saque?");
                        pix = leitura.nextDouble();
                        if (pix > saldoInicial){
                            System.out.println("Saldo insuficiente");
                            System.out.printf("Seu saldo é de R$%.2f%n", saldoInicial);
                            System.out.println("Deseja tentar novamente? Digite 1 para sim e 2 para não:");
                            int escolha = leitura.nextInt();
                            switch (escolha){
                                case 1:
                                    break;
                                case 2:
                                    saldoInsuficiente = true;
                                    break;
                            }
                        } else {
                            saldoInicial -= pix;
                            System.out.printf("Seu saldo atual é de R$%.2f%n", saldoInicial);
                            saldoInsuficiente = true;
                        }
                    }
                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Erro");
                    break;
            }
        }
        System.out.println("Sistema encerrado!");
    }
}