public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"32/43", "Olá Mundo", "B-to-B", "Nome real", "Preencher dados", "carregando...", "tente novamente"};
        String[] wordListTwo = {"habilitado", "jabuticada","montanha-russa", "40 pessoas", "isso é um array?", "e se..."};
        String[] wordListThree = {"Bala de menta", "chiclete com banana", "olha o avião", "missão", "padrão empresarial", "ética"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println("Precisamos de " + phrase);
    }
}
