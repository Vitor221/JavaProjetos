public class ParImpar {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);

        parImpar(x);
    }

    static void parImpar(int x) {
        if(x % 2 == 0) {
            System.out.println("O número digitado é Par");
        } else {
            System.out.println("O número digitado é Impar");
        }
    }
}
