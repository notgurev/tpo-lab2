package lab2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CsvLogger {
    private String filePath = "src/test/resources/";

    private final char CSV_SEPARATOR = ',';
    private final int[] numerators = new int[] {1, 1, 1, 2, 3, 5, 7, 5, 4, 5, 7, 11, 1, 2, 1, -1, -1, -3, -1, -5, -7};
    private final int[] denominators = new int[] {6, 4, 3, 3, 4, 6, 6, 4, 3, 3, 4, 6, 1, 1, 2, 2, 4, 4, 1, 4, 4};

    public CsvLogger(String fileName) {
        this.filePath = filePath + fileName;
    }

    public void setFilePath(String fileName) {
        this.filePath = "src/test/resources/" + fileName;
    }

    public void log(Function function) {
        String csvString = "";

        try {
            Files.deleteIfExists(Paths.get(this.filePath));
        } catch (IOException ignored) {
        }

        try (PrintStream printStream = new PrintStream(new FileOutputStream(filePath, true))) {
            for (int i = 0; i < numerators.length; i += 1) {

                Double result = function.calculate(numerators[i] * Math.PI / denominators[i]);

                csvString = String.format("%f%s %f\n", numerators[i] * Math.PI / denominators[i], CSV_SEPARATOR, result);
                printStream.print(csvString);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}