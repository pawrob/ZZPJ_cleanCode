package pl.zzpj2021.solid.ocp.usa.solution;

public class GLMaxSpeedRule implements MaxSpeedRule{

    private static final int GL_MAX_SPEED = 1;
    private static final double GL_FINE_VALUE = 10.1;

    @Override
    public int getMaxSpeed() {
        return GL_MAX_SPEED;
    }

    @Override
    public double getFineValue() {
        return GL_FINE_VALUE;
    }
}
