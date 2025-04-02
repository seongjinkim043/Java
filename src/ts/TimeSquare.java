package ts;

import gov.Shop;
import starbucks.Starbucks;
import starbucks.branch.StarbucksYeongdeungpo;
import starbucks.pay.ApplePay;

public class TimeSquare {
	
	public static final TimeSquare ts = new TimeSquare();

	private static ApplePay[] apShops;
	private static Shop[] shops;
	private static int roomNo;
	
	public static void regist(Shop shop) {
		shops[roomNo] = shop;
	}
	
	public static void checkShop(Shop shop) {
		if (shop instanceof Starbucks) {
			System.out.println("이 Shop은 Starbucks 입니다.");
		}
	}
	
	public static void discountApplePay(ApplePay ap) {
		
	}
	
	//public static void regist(Starbucks sb) {
		
	//}
}
