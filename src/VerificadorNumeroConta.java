import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o numero da conta: ");
        String numeroConta = scanner.next();
        try {
            verificarNumeroConta(numeroConta);
        } catch (Exception e) {
            System.out.println("Erro:" +
                    "Numero de conta invalido. Digite exatamente 8 digitos.");
        }

    }
    private static void verificarNumeroConta(String numeroConta) throws illegalArgumentException {
        if(numeroConta.length() == 8){
            System.out.println("Numero de conta Valido.");
        }else
            throw new illegalArgumentException();

    }

    private static class illegalArgumentException extends Exception {


    }
}