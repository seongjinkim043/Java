package starbucks.branch;

import starbucks.Starbucks;

public class StarbucksHongdae extends Starbucks {
	
	public void discount() {
		super.discount();
		System.out.println("홍익대 학생 한정 15% 할인 진행!");
	}
	
	public void operatingHours() {
		System.out.println(BRAND_NAME + "홍대 지점 운영 시간 : 08:00 ~ 22:00");
	}
	
	public void specialPromotion() {
		System.out.println("홍대 지점 오픈 기념 아메리카노 1+1 행사 진행중");
	}

}
