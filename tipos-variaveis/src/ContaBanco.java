import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ola Cliente! Digite o numero da Agencia!");
        int numero = scanner.nextInt();

        System.out.println("Agora digite a Agência ");
        String agencia = scanner.next();

        System.out.println("qual é o seu nome completo?");
        String nome = scanner.next();

        System.out.println("Ola Cliente! Digite Sua Agencia!");
        Double saldo = scanner.nextDouble();

        System.out.printf("Olá" + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível");

        scanner.close();

    }

    // todo : conhecer e importar a classe scanner
    // exbir as mensagens para nosso usuário
    // obter pela scanner os valores digitados no terminal
    // exibir mensagem conta criada
}
