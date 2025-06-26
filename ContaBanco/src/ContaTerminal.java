import java.math.BigDecimal;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner bancoDados = new Scanner(System.in);

        //Apresentação do banco
        System.out.println("Olá, seja bem-vindo ao banco DioMaster!\n");

        System.out.println("Por favor, digite o seu nome.");
        String nomeCliente = bancoDados.nextLine();

        System.out.println("Certo, agora digite o número da sua Agência.");
        String agenciaBanco = bancoDados.next();

        System.out.println("Okay, agora digite o número da sua Conta.");
        int numeroConta = bancoDados.nextInt();

        System.out.println("Digite seu saldo!");
        BigDecimal saldoConta = bancoDados.nextBigDecimal();
        
        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agenciaBanco + ", conta " + numeroConta + " e seu saldo de R$" + saldoConta + " já está disponível para saque.");

        




    }
}
