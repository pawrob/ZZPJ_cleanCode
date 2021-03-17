package pl.zzpj2021.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Calculator {

	Map<Integer, Integer> integerHashMap = new HashMap<>();
	private int maxValue = Integer.MIN_VALUE;
	private int minValue = Integer.MAX_VALUE;

	public Calculator(List<Integer> integers) {
		inputIntegers(integers);
	}

	public Calculator() {

	}

	public void inputIntegers(List<Integer> integers) {
		for (Integer integer : integers) {
			inputIntegers(integer);
		}
	}

	public void inputIntegers(Integer number) {
		integerHashMap.merge(number, 1, Integer::sum);
		if (number > maxValue) {
			maxValue = number;
		}
		if (number < minValue) {
			minValue = number;
		}
	}

	public double getAverage() {
		double sum = 0;
		double count = 0;
		for (Entry<Integer, Integer> numberCount : integerHashMap.entrySet()) {
			count += numberCount.getValue();
			sum += numberCount.getKey() * numberCount.getValue();
		}
		if (count == 0) {
			return 0;
		}
		return sum / count;
	}

	public int getMinValue() {
		return minValue;
	}

	public int getMaxValue() {
		return maxValue;
	}
}