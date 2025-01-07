package Module8.Singleton.Homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class Logger {
    private static Logger logger;
    private static LogLevel logLevel;
    private static File file;

    private Logger(LogLevel logLevel, File file) throws IOException {
        Logger.logLevel = logLevel;
        Logger.file = file;
        Logger.file.createNewFile();
    }

    public static Logger getLogger(LogLevel logLevel, File file) throws IOException {
        if (logger == null) {
            logger = new Logger(logLevel, file);
        }
        return logger;
    }

    void writeToLogger(String text) throws IOException {
        LocalDateTime localDateTime = LocalDateTime.now();
        FileWriter fileWriter = new FileWriter(Logger.file, true);
        fileWriter.write(localDateTime + " " + logLevel.name() + " " + text + "\n");
        fileWriter.close();
    }


    public static void main(String[] args) throws IOException {
        String filename = "Logger.txt";
        File file = new File(filename);
        Logger l2 = Logger.getLogger(LogLevel.DEBUG, file);
        Logger l1 = Logger.getLogger(LogLevel.TRACE, file);
        Logger l3 = Logger.getLogger(LogLevel.FATAL, file);
        l1.writeToLogger("Meow1");
        l2.writeToLogger("Meow2");
        l3.writeToLogger("Meow3");
    }
}

enum LogLevel {
    TRACE, DEBUG, INFO, WARN, ERROR, FATAL;
}
