package pl.zzpj2021.solid.ocp.usa.solution;

public interface StatePolicy {

    int getSpeedLimit();
    String getStateCode();
    double calculateFine(int speed);
}
