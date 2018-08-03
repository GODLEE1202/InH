package COM.ex0424.pm;

import java.util.function.IntBinaryOperator;

public class MaxMin {
	
	private int[] scores = {92,88,72,33,85,64};
	
	public int MaxOrMin(IntBinaryOperator operator) {
		int result = scores[0];
		for(int score: scores) {
			result = operator.applyAsInt(result, score);
			
		}
		return result;
		
	}
}
