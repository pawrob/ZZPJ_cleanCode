package pl.zzpj2021.solid.isp.contactbook.solution;

import lombok.Getter;
import lombok.Setter;

public class Contact implements  Diallable, Emailable {

    @Getter @Setter
    public String name;
    @Getter @Setter
    public String address;
    public String telephone;
    public String emailAddress;

    public Contact(String name, String address) {
        super();
        this.name = name;
        this.address = address;
    }

    @Override
    public String getTelephone() {
        return telephone;
    }

    @Override
    public void setTelephone(String telephone) {
        this.telephone = telephone;
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
