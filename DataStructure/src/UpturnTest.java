import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UpturnTest {
    public static void main(String[] args) throws IOException {
        String input;
        while (true) {
            input = getString();
            if (input.equals("")) break;
            Upturn tx = new Upturn(input);
            tx.upturnText();
            tx.upturnDisplay();
        }
    }

    private static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }
}
