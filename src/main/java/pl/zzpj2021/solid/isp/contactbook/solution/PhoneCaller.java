package pl.zzpj2021.solid.isp.contactbook.solution;

public class PhoneCaller implements CallMaker {
    @Override
    public void makeCall(Contact dialable) {
        String telephone = dialable.getTelephone();
        System.out.println("Calling... " + telephone);
    }
}
