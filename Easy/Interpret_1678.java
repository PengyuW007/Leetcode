package Easy;

public class Interpret_1678 {
    public static void main(String[] args) {
        String command = "G()(al)";

        System.out.println(interpret(command));
    }

    public static String interpret(String command) {
        command = command.replace("()", "o");

        command = command.replace("(al)", "al");

        return command;
    }
}
