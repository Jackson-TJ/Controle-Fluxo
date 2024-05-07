
import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float saldo = 0;
        boolean teste = true;
        // Loop infinito para manter o programa em execução até que o usuário decida sair
        while (teste) {
            System.out.println("digite a opção deseja: 0- Encerramento 1- Deposito 2- Saque 3- Saldo");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 0: {
                    System.out.println("Até logo!");
                    teste = false;
                    break;
                }
                case 1: {
                    System.out.println("Digite o valor a ser depoisitado:");
                   float deposito = scanner.nextFloat();
                    saldo = deposito + saldo;
                    System.out.println("Seu saldo atualizado é : " + saldo);
                    break;
                }
                case 2: {
                    System.out.println("Digite o Valor a ser sacado :");
                    float saque = scanner.nextFloat();
                    if (saque > saldo) {
                        System.out.println("Saldo Insuficiente! Seu saldo é de :  " + saldo);
                        continue;
                    } else {
                        saldo -= saque;
                        System.out.println("Saque realizado! Seu saldo ficou em : " + saldo);
                    }
                    break;
                }
                case 3: {
                    System.out.println("Seu saldo é :  " + saldo);
                }
                break;
                // TODO: Implemente as condições necessárias para avaliaa a opção escolhida:
                // Dica: Utilze o switch/case para o programa realizar as operações escolhidas pelo usuário.


                // Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}