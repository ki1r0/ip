package Judy.task;

public class Deadline extends Task {
    private final String deadline;

    public Deadline(String description, String deadline) {
        super(description);
        this.deadline = parseDateTime(deadline);
    }

    @Override
    public String toString() {
        return "[D]" + super.toString() + " (by: " + deadline + ")";
    }

    @Override
    public String toDataString() {
        return "D | " + super.toDataString() + " | " + deadline;
    }
}
