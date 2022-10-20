package work.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MessageTask extends Task {
    @Override
    public void execute() {
        System.out.println("Task-ul " + toString() + "a fost exectutat cu succes la data " +date.format(formatter));
    }
    private String body;
    LocalDateTime date;
    public static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm");

    public MessageTask(long id, String description, String body, LocalDateTime date) {
        super(id, description);
        this.body = body;
        this.date = date;
    }
}
