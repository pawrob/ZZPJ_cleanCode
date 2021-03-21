package pl.zzpj2021.solid.ocp.usa.solution;

public class GAstate implements SpeedCalculation{
    private static final int MAX_SPEED = 120;
    @Override
    public int calculate(int speed) {
        if(speed > MAX_SPEED){
            return speed % MAX_SPEED * 200;
        }
        return 0;
    }

}
