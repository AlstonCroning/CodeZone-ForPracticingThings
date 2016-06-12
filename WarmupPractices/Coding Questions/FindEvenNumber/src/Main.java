public class Main {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++) {
            System.out.println(i + " -> " + isEvenNumber(i));
        }
    }

    private static boolean isEvenNumber(int number) {
        int remainder = number % 2;
        return (remainder == 0);
    }
}
