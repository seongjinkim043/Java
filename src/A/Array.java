package A;

public class Array {
 
	public static void main(String[] args) {
		String data = "번호, 메뉴, 가격, 수량, 총액, 주문일시, 결제방법\n";
			   data += "1, 아메리카노, 5000, 20, 1000000, 2025031945710, C1\n";
			   data += "2, 카페라떼, 6000, 15, 90000, 20250329145930, C1\n";
			   
			   System.out.println(data);
			   data = data.replace("\n", ",");
			   
			   String[] arr = data.split(",");
			   
			   for( int i = 0; i < arr.length; i++) {
				   System.out.print(arr[i] + " | ");
				   if ((i + 1) % 7 == 0) {
					   System.out.println();
				   }
			   }
			   System.out.println();
	}
}
