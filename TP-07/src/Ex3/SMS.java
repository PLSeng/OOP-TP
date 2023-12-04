package Ex3;

public class SMS {
    String subject;
    String fromPhoneNumber;
    String receiverNumber;
    String type;
    String content;
    String status;

    public SMS(String subject, String fromPhoneNumber, String receiverNumber, String type, String content, String status) {
        this.subject = subject;
        this.fromPhoneNumber = fromPhoneNumber;
        this.receiverNumber = receiverNumber;
        this.type = type;
        this.content = content;
        this.status = status;
    }

    public SMS(String fromPhoneNumber, String receiverNumber, String content) {
        this("No Subject", fromPhoneNumber, receiverNumber, "Text", content, "New");
    }

    public SMS(String fromPhoneNumber, String receiverNumber) {
        this("No Subject", fromPhoneNumber, receiverNumber, "Text", "No Content", "New");
    }
}