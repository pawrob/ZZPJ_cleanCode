package pl.zzpj2021.solid.ocp.usa.solution;

public class SCstate implements SpeedCalculation{
    private static final int MAX_SPEED = 100;
    @Override
    public int calculate(int speed) {
        if(speed > MAX_SPEED){
            return (speed % MAX_SPEED + speed) * 300;
        }
        return 0;
    }

}
