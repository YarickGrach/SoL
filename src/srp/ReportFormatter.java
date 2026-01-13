package srp;

import java.time.LocalDateTime;

public class ReportFormatter {
    public String formatReport(int sum, double avg) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== Report ===\n");
        sb.append("Sum: ").append(sum).append("\n");
        sb.append("Average: ").append(avg).append("\n");
        sb.append("Generated at: ").append(LocalDateTime.now()).append("\n");
        return sb.toString();
    }
}