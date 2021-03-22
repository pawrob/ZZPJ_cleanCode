package pl.zzpj2021.solid.isp.contactbook.solution;

public class TelephoneContact  extends Contact implements Dialable{

    public String telephone;

    public TelephoneContact(String name, String address, String telephone) {
        super(name, address);
        this.telephone = telephone;
    }


    @Override
    public String getTelephone() {
        return telephone;
    }

    @Override
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
}
