package starbucks.branch;

import starbucks.Starbucks;

public class StarbucksYeongdeungpo extends Starbucks {
	
	@Override
	public void discount() {
		super.discount();
		System.out.println("글로벌인 회원 한정 5% 추가 할인 진행중");
	}
	
	public void operatingHours() {
		System.out.println("STARBUCKS 영등포 지점 운영 시간 : 08:00 ~ 22:00");
	}
}
