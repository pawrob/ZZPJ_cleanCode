package pl.zzpj2021.solid.ocp.usa.solution;

public class ALMaxSpeedRule implements MaxSpeedRule{

    private static final int AL_MAX_SPEED = 2;
    private static final double AL_FINE_VALUE = 12.1;

    @Override
    public int getMaxSpeed() {
        return AL_MAX_SPEED;
    }

    @Override
    public double getFineValue() {
        return AL_FINE_VALUE;
    }
}
