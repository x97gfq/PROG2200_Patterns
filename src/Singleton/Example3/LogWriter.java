package Singleton.Example3;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class LogWriter {
    private static LogWriter instance;
    private Logger logger;
    private FileHandler fileHandler;

    private LogWriter() {
        logger = Logger.getLogger("LogWriter");
        try {
            // Configure the logger
            fileHandler = new FileHandler("logfile.log");
            logger.addHandler(fileHandler);
            SimpleFormatter formatter = new SimpleFormatter();
            fileHandler.setFormatter(formatter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static LogWriter getInstance() {
        if (instance == null) {
            instance = new LogWriter();
        }
        return instance;
    }

    public void writeLineToFile(String line) {
        logger.info(line);
    }
}