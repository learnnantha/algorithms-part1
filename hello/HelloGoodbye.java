import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class HelloGoodbye {
    public static void main(String[] args) {
        String arg = String.join(" and ", args);
        System.out.println("Hello " + arg + ".");
        List<String> rev = Arrays.asList(args);
        Collections.reverse(rev);
        arg = String.join(" and ", rev);
        System.out.println("Goodbye " + arg + ".");
    }
}
