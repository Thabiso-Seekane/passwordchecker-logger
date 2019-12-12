import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class passWordchecker {
    public boolean funcPassword(String password) {

        final Logger logger = LogManager.getLogger(main.class.getName());

        String regexp = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).{8,50}$";
        Scanner input = new Scanner(System.in);

        if (password.matches(regexp) == true && password != " ") {
            logger.info("password meets requirements.");
        } else {
            while (password.matches(regexp) == false) {
                logger.error("Password should include Special Characters and should be between 8 and cannot be null");

                logger.info("Please create password:");
                password = input.nextLine();

                if (password.matches(regexp) == true && password != " ") {
                    logger.info("password meets requirements.");
                }
            }

        }
        return true;
    }
}
