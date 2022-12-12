package lesson2;

public class Main {
    public static void main(String[] args) {
        System.out.println(buildString('X', 'o', 21));
        System.out.println(buildString());
    }

    private static String buildString(char c1, char c2, int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i % 2 == 0) {
                sb.append(c1);
            } else {
                sb.append(c2);
            }
        }
        return sb.toString();
    }

    private static String buildString() {
        return buildString('F', '_', 10);
    }

}