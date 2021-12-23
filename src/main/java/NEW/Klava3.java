package NEW;
import java.util.Scanner;
public class Klava3 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
 System.out.println("Input forbidden symbols:");
        String forbidden = scanner.nextLine();
        System.out.println("Input lines:");

        String stopWorld = "#";
        StringProcessor processor = new StringProcessor(forbidden, stopWorld);

        while (true) {
            String line = scanner.nextLine();
            boolean isExit = processor.process(line);
           if (isExit) {
               break;
            }
       }
    }
}

