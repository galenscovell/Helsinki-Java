
/**
 * Main class for Ex148, working with StringBuilder
 */


public class Main {

    public static String build(int[] values) {
        StringBuilder sb = new StringBuilder();

        sb.append("\n {\n");
        for (int i = 0; i < values.length - 1; i++) {
            if ((i + 1) % 4 == 0) {
                sb.append(" " + values[i] + ", \n");
            } else {
                sb.append(" " + values[i] + ", ");
            }
        }
        sb.append(" " + values[values.length - 1]);
        sb.append("\n }\n");
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(build(values));
    }
}