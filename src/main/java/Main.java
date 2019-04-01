import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {
    private final static Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        try {
            FileExplorer fileExplorer = new FileExplorer(args);
            fileExplorer.parseRepository();
        } catch (Exception e) {
            log.error(e.getMessage());
        }
    }
}
