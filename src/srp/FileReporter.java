package srp;

import java.io.FileWriter;
import java.io.IOException;

public class FileReporter {
    public void saveReport(String report, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            writer.write(report);
            System.out.println("Report saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error writing report file: " + e.getMessage());
        }
    }
}