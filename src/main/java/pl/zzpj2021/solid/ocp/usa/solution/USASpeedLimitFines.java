package pl.zzpj2021.solid.ocp.usa.solution;

public class USASpeedLimitFines {
    private SpeedCalculation speedCalculation;

    public int calcualateSpeedLimitFine(SpeedCalculation speedCalculation, int speed){
        return speedCalculation.calculate(speed);
    }

    public int getMaxSpeed(){
        return speedCalculation.getMaxSpeed();
    }
}
