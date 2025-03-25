package starbucks;

import starbucks.branch.StarbucksYeongdeungpo;
import starbucks.branch.StarbucksHongdae;

public class StarbucksCEO {

	public static void main(String[] args) {
		
		StarbucksYeongdeungpo sy = new StarbucksYeongdeungpo();
		StarbucksHongdae sh = new StarbucksHongdae();
		
		System.out.println("==== 영등포 지점 ====");
		sy.brewing();
		sy.discount();
		sy.operatingHours();
		System.out.println();
		
		System.out.println("==== 홍대 지점 ====");
		sh.brewing();
		sh.discount();
		sh.operatingHours();
		sh.specialPromotion();
	}
}
