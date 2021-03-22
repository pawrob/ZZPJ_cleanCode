package pl.zzpj2021.cleancode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class AverageCalculator {

	Map<Integer, Integer> numberCountsMap = new HashMap<>();
	private int minValue = Integer.MIN_VALUE;
	private int maxValue = Integer.MAX_VALUE;
	
	public AverageCalculator(List<Integer> numberList) {
		insertNumber(numberList);
	}
	
	public AverageCalculator() { }
	
	public void insertNumber(List<Integer> numberList) {
		for(int number : numberList){
			insertNumber(number);
		}
	}
	
	public void insertNumber(Integer number) {
		if (numberCountsMap.containsKey(number)) {
			Integer count = numberCountsMap.get(number);
			numberCountsMap.put(number, count + 1);
		} else {
			numberCountsMap.put(number, 1);
		}
		
		if (number > minValue) {
			minValue = number;
		}
		
		if (number < maxValue) {
			maxValue = number;
		}
	}
	
	public int getNumberCount(int i) {
		return numberCountsMap.getOrDefault(i, 0);
	}
	
	public double calculateAverage() {
		double sum = 0;
		double totalCount = 0;

		for (Entry<Integer, Integer> numberCountPair : numberCountsMap.entrySet()) {
			totalCount += numberCountPair.getValue();
			sum += numberCountPair.getKey() * numberCountPair.getValue();
		}

		if (totalCount == 0) {
			return 0;
		}

		return sum / totalCount;
	}
	
	public int getMinValue() {
		return minValue;
	}
	
	public int getMaxValue() {
		return maxValue;
	}

}