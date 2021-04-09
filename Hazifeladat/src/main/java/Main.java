import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class);
    private static final Marker LINE = MarkerManager.getMarker("LINE_M");
    private static final Marker QUESTION = MarkerManager.getMarker("QUESTION_M");
    private static final Marker EXCLAMATION = MarkerManager.getMarker("EXCLAMATION_M");

    public static void main(String[] args) throws InterruptedException
    {
        for (int i = 1; i <= Integer.parseInt(args[0]); i++)
        {
            ThreadContext.put("iteration", String.valueOf(i));
            logger.error(LINE, "Közösségben jártam, karanténba zártak... ");
            logger.error(EXCLAMATION, "Locsolni így nem tudok, lányok online utaljatok!");
            logger.error(QUESTION, "Szabad-e locsolni?");
            logger.error("Gőzöm sincs mit csinálok.");
            Thread.sleep(2000);
        }
    }
}
