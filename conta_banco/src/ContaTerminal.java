import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

    final int Conta=1021;
    final double Saldo=249.7;
    final String Agencia="1024-2";
    final String NomeCliente="Davi Castro";

    System.out.print("Olá, seja bem vindo!, digite a seguir o número da sua agência:");
        String leituraAgencia = scanner.nextLine();
    
    if (leituraAgencia.equals(Agencia)) {
        System.out.printf("%nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", NomeCliente, Agencia, Conta, Saldo);
    }
    else{
        System.out.println("Desculpe, essa agência não existe, tente novamente");
            System.exit(0);
    }

    }
}
