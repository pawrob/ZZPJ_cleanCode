package pl.zzpj2021.solid.isp.contactbook.solution;

public class EmailContact extends Contact implements Emailable{

    public String emailAddress;

    public EmailContact(String name, String address, String emailAddress) {
        super(name, address);
        this.emailAddress = emailAddress;
    }


    @Override
    public String getEmailAddress() {
        return emailAddress;
    }

    @Override
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}
