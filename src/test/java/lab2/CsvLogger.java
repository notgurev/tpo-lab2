package lab2;

import lombok.SneakyThrows;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Locale;

public class CsvLogger {
    private static final String pathPrefix = "src/test/resources/";
    private static final char CSV_SEPARATOR = ',';

    private final String filePath;

    public CsvLogger(String path) {
        this.filePath = pathPrefix + path;
    }

    @SneakyThrows
    public void logToCSV(Calculator calculator, double from, double to, double step) {
        try (var ps = openCSVFile(calculator.getClass().getSimpleName())) {
            for (var x = from; x < to; x += step) {
                double result = calculator.calculate(x);
                ps.printf(Locale.US, "%f%s%f\n", x, CSV_SEPARATOR, result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private PrintStream openCSVFile(String path) throws IOException {
        Files.deleteIfExists(Paths.get(filePath + path));
        try {
            Files.createDirectory(Path.of(this.filePath));
        } catch (FileAlreadyExistsException ignore) {
        }
        return new PrintStream(new FileOutputStream(filePath + path, true));
    }
}