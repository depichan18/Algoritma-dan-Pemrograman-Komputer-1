public class sintakcontinue {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i % 4 == 0) {
                break;
            }
            System.out.println(i + ".");
        }
        System.out.println("adl tampian out");
    }
}
