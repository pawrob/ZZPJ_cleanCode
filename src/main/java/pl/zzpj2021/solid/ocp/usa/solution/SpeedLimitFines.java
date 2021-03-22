package pl.zzpj2021.solid.ocp.usa.solution;

public class SpeedLimitFines {
    private MaxSpeedRule maxSpeedRule;

    public SpeedLimitFines(MaxSpeedRule maxSpeedRule) {
        this.maxSpeedRule = maxSpeedRule;
    }

    public double calcualateSpeedLimitFine(int speed) {
        if(speed > maxSpeedRule.getMaxSpeed())
            return maxSpeedRule.getFineValue();
        return 0.0;
    }
}
