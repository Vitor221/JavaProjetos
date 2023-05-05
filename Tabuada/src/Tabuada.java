import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para se efetuar a tabuada:");
        int numeroTabuada = scanner.nextInt();
        System.out.println("Número retornado: " + numeroTabuada);

        for(int i = 0; i < 11; i++) {
            System.out.println(numeroTabuada + "*" + i + "=" + numeroTabuada * i);
        }
    }
}
