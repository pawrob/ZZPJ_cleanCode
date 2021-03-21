package pl.zzpj2021.solid.isp.contactbook.solution;

public class Emailer implements MessageSender {
    @Override
    public void sendMessage(Contact emailable, String subject, String body) {
        String emailAddress = emailable.getEmailAddress();

        sendEmail(emailAddress, subject, body);
    }

    private void sendEmail(String emailAddress, String subject, String body) {
        System.out.println("Sending email... to " + emailAddress);
    }
}
