
/**
 * Calculator class for Ex110
 */

public class Calculator {
    private Reader reader;
    private int operations;

    public Calculator() {
        this.reader = new Reader();
        this.operations = 0;
    }

    private void statistics() {
        System.out.println("Calculations completed: " + this.operations);
    }

    private int[] askValues() {
        int[] values = new int[2];
        System.out.print("First value: ");
        int value1 = this.reader.readInteger();
        values[0] = value1;
        System.out.print("Second value: ");
        int value2 = this.reader.readInteger();
        values[1] = value2;
        this.operations += 1;
        return values;
    }

    private void add() {
        int[] values = askValues();
        int sum = values[0] + values[1];
        System.out.println(sum);
    }

    private void subtract() {
        int[] values = askValues();
        int difference = values[0] - values[1];
        System.out.println(difference);
    }

    private void multiply() {
        int[] values = askValues();
        int product = values[0] * values[1];
        System.out.println(product);
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = reader.readString();
            if (command.toLowerCase().equals("end")) {
                break;
            }

            if (command.toLowerCase().equals("add")) {
                add();
            } else if (command.toLowerCase().equals("subtract")) {
                subtract();
            } else if (command.toLowerCase().equals("multiply")) {
                multiply();
            }
        }

        statistics();
    }
}