package srp;

import java.util.List;

public class ReportManager {
    private final DataCalculator calculator;
    private final ReportFormatter formatter;
    private final ConsoleReporter consoleReporter;
    private final FileReporter fileReporter;

    public ReportManager(List<Integer> data) {
        this.calculator = new DataCalculator(data);
        this.formatter = new ReportFormatter();
        this.consoleReporter = new ConsoleReporter();
        this.fileReporter = new FileReporter();
    }

    public void generateReport() {
        int sum = calculator.calculateSum();
        double avg = calculator.calculateAverage();
        String report = formatter.formatReport(sum, avg);

        consoleReporter.printReport(report);
        fileReporter.saveReport(report, "report.txt");
    }
}