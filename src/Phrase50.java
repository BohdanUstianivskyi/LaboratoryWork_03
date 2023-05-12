public class Phrase50 {
    public static void main(String[] args) {
        String phrase = "Bohdan Ustianivskyi";
        for (int i = 0; i < 50; i++) {
            System.out.println(phrase);
        }
        int count = 0;
        while (count < 50) {
            System.out.println(phrase);
            count++;
        }
    }
}
