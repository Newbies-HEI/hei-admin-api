package school.hei.haapi.repository;

public interface EmailSenderRepo {
    void sendEmail(String to, String subject, String message);
}
