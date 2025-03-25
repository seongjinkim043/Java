package starbucks;

public class Starbucks {

	protected final static String BRAND_NAME = "STARBUCKS";
	
	protected void brewing() {
		System.out.println("에티오피아산 커피를 사용해서 추출중...");
	}
	
	protected void discount() {
		System.out.println("회원인 경우 10% 할인 적용중");
	}
	
	protected void operatingHours() {
        System.out.println(BRAND_NAME + " 기본 운영 시간: 08:00 ~ 22:00");
    }
	protected void specialPromotion() {
        System.out.println(BRAND_NAME + " 본사 이벤트: 신규 회원 가입 시 무료 음료 쿠폰 증정!");
    }
}
