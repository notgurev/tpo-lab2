package lab2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.function.DoubleFunction;

public class CsvLogger {
    private static final String pathPrefix = "src/test/resources/";
    private static final char CSV_SEPARATOR = ',';

    private final String filePath;

    public CsvLogger(String fileName) {
        this.filePath = pathPrefix + fileName;
    }

    public void logToCSV(DoubleFunction<Double> calculate, double from, double to, double step) {
        try (var ps = openCSVFile()) {
            String csv;
            for (var x = from; x < to; x += step) {
                Double result = calculate.apply(x);

                if (result > 10000) {
                    result = Double.NaN;
                }

                csv = String.format(Locale.US, "%f%s%f\n", x, CSV_SEPARATOR, result);
                ps.print(csv);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private PrintStream openCSVFile() throws IOException {
        Files.deleteIfExists(Paths.get(this.filePath));
        return new PrintStream(new FileOutputStream(filePath, true));
    }
}