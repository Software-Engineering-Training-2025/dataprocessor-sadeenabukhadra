package output;

public class ConsoleOutput implements Output {

    @Override
    public void write(double value) {
        System.out.println("Result = " + value);
    }
}
