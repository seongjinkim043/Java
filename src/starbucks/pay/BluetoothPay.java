package starbucks.pay;

public interface BluetoothPay {

	default void payBluetooth() {
		System.out.println("블루투스 페이 결제중...");
	}
}
