package starbucks.branch;

import starbucks.Starbucks;
import starbucks.pay.StarbucksPay;
import starbucks.pay.ApplePay;
import starbucks.pay.Pay;

public class StarbucksYeongdeungpo extends Starbucks implements StarbucksPay, ApplePay, Pay {
	
	@Override
	public void discount() {
		super.discount();
		System.out.println("글로벌인 회원 한정 5% 추가 할인 진행중");
	}
	
	public void operatingHours() {
		System.out.println("STARBUCKS 영등포 지점 운영 시간 : 08:00 ~ 22:00");
	}
	
	@Override
	protected void Mugwort() {
		System.out.println("쑥 케이크 개발중...");
	}
	
	@Override 
	public void payCard() {
		System.out.println("스타벅스 카드로 결제중...");
	}
	
	public void payGalaxy() {
		System.out.println("애플페이 갤럭시 결제중...");
	}
	
	@Override
	public void pay() {
		System.out.println("애플페이 결제중...");
	}
	
}
