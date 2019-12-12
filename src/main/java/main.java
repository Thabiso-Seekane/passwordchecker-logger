import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class main {
    public static void main(String[] args) {

       final Logger logger = LogManager.getLogger(main.class.getName());

        Scanner input = new Scanner(System.in);
        passWordchecker pass = new passWordchecker();
        logger.info("Please create password:");
        //System.out.println("Please create password:");
        String password = input.nextLine();
        pass.funcPassword(password);
    }
}