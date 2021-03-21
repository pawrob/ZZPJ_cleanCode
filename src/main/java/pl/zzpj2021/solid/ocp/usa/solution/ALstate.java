package pl.zzpj2021.solid.ocp.usa.solution;

public class ALstate implements SpeedCalculation{
    private static final int MAX_SPEED = 150;
    @Override
    public int calculate(int speed) {
        if(speed > MAX_SPEED){
            return (speed - MAX_SPEED) * 100;
        }
        return 0;
    }

}
