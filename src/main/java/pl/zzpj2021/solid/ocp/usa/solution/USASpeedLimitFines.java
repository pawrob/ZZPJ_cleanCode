package pl.zzpj2021.solid.ocp.usa.solution;

public class USASpeedLimitFines {

    public static double calculateSpeedLimitFine(StatePolicy statePolicy, int speed) {

        if(speed > statePolicy.getSpeedLimit()){
            return statePolicy.calculateFine(speed);
        }

        return 0;
    }
}
