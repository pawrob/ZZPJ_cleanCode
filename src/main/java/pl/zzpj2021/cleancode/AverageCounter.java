package pl.zzpj2021.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AverageCounter {

    Map<Integer, Integer> integersQuantity = new HashMap<>();
    private int highestIntegerFound = Integer.MIN_VALUE;
    private int leastIntegerFound = Integer.MAX_VALUE;

    public AverageCounter(List<Integer> i1) {
        inputNumbers(i1);
    }

    public AverageCounter() {
    }

    public void inputNumbers(List<Integer> integerList) {
        integerList.forEach(this::inputNumber);
    }

    public void inputNumber(Integer number) {

        integersQuantity.put(number, checkNumberQuantity(number) + 1);

        if (number > highestIntegerFound)
            highestIntegerFound = number;

        if (number < leastIntegerFound)
            leastIntegerFound = number;
    }

    public int checkNumberQuantity(int i) {
        return integersQuantity.getOrDefault(i, 0);
    }

    public double getAverage() {
        double sumOfNumbers = 0;
        double sumOfKeys = 0;
        for (Entry<Integer, Integer> u : integersQuantity.entrySet()) {
            sumOfKeys += u.getValue();
            sumOfNumbers += u.getKey() * u.getValue();
        }
        if(sumOfKeys == 0)
            return 0;
        return sumOfNumbers / sumOfKeys;
    }

    public int getHighestIntegerFound() {
        return highestIntegerFound;
    }

    public int getLeastIntegerFound() {
        return leastIntegerFound;
    }
}