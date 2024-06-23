import java.util.Locale;
import java.util.Scanner;

public class contaterminal {

    public static void main (String[] args){

         Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Qual o seu nome ");
        String nome = scanner.next();

        System.out.println("qual o numero do cartao ");
        int numero = scanner.nextInt();

        System.out.println("qual sua agencia  ");
        String agencia = scanner.next();

        System.out.println("Qual o seu saldo  ");
        Double saldo = scanner.nextDouble();

        System.out.println("Ola " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " +  agencia + " , conta 13" + numero + " e seu saldo " + saldo + " já está disponível para saque" );
    }    
    
}
