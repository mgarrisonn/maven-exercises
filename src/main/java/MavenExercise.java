import org.apache.commons.lang3.StringUtils;
import util.Input;

public class MavenExercise {
    public static void main(String[] args) {
        Input input = new Input();

        // tells whether or not user enters a number
        System.out.println("Enter a number: ");
        System.out.println(StringUtils.isNumeric(input.getString()));

        // flips the case of a string
        System.out.println("Enter your name: ");
        System.out.println(StringUtils.swapCase(input.getString()));

        // reverses a string
        System.out.println("Enter your favorite color: ");
        System.out.println(StringUtils.reverse(input.getString()));
    }
}
