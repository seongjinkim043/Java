package starbucks;

import starbucks.branch.StarbucksYeongdeungpo;
import ts.TimeSquare;

public class StarbucksCEO {

	public static void main(String[] args) {
		
		StarbucksYeongdeungpo sy = new StarbucksYeongdeungpo();
		
		
		TimeSquare.regist(sy);
		TimeSquare.discountApplePay(sy);
	}
}
