package pl.zzpj2021.solid.isp.contactbook.solution;

public interface MessageSender {
    void sendMessage(Contact emailable, String subject, String body);
}
