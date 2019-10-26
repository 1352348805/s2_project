package page145x5;
import org.apache.log4j.Logger;
public class demo {
    private static final Logger logger = Logger.getLogger(demo.class);

    public static void main(String[] args) {
        try {
            int[] array = new int[5];
            int i = array[5];

        } catch (ArrayIndexOutOfBoundsException e) {
            logger.info("数组越界");
        }
    }
}
