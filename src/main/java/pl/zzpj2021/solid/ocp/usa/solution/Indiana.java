package pl.zzpj2021.solid.ocp.usa.solution;

public class Indiana implements StatePolicy {

    private static final int SPEED_LIMIT = 80;
    private static final String STATE_CODE = "IN";

    @Override
    public int getSpeedLimit() {
        return SPEED_LIMIT;
    }

    @Override
    public String getStateCode() {
        return STATE_CODE;
    }

    @Override
    public double calculateFine(int speed) {
        // calculate
        // ...

        return 85;
    }
}
