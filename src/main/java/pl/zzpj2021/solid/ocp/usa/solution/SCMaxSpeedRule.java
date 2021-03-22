package pl.zzpj2021.solid.ocp.usa.solution;

public class SCMaxSpeedRule implements MaxSpeedRule{

    private static final int SC_MAX_SPEED = 1;
    private static final double SC_FINE_VALUE = 10.1;

    @Override
    public int getMaxSpeed() {
        return SC_MAX_SPEED;
    }

    @Override
    public double getFineValue() {
        return SC_FINE_VALUE;
    }
}
