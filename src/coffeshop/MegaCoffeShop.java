package coffeshop;

import java.time.LocalDateTime;

import java.util.Scanner;

import com.samsung.sec.ComputerPart;

public class MegaCoffeShop {
	
	public static final String BRAND = "MEGA_COFFEE";
	public static final String OFF_LINE_ORDER = "F";
	
	
	private String branchName;
	private String ownerName;
	private String[] menuArr;
    private int[] menuPrices;
    private String[] partTimers;
    private int totalSales;
    
    void test() {
    	com.samsung.sec.ComputerPart cp =
    			new com.samsung.sec.ComputerPart();
    }
    
    
    public MegaCoffeShop(String branchName, String OwnerName, String[] menu, int[] menuPrices, String[] partTimers) {
    	this.branchName = branchName;
    	this.ownerName = ownerName;
    	this.menuArr = menuArr;
    	this.menuPrices = menuPrices;
    	this.partTimers = partTimers;
    	this.totalSales = 0;
    }
    
    
    public void receiveOrder(char orderType, String[] menu, int[] amount, char payType) {
    	
    };
    
    
    public void searchSales(LocalDateTime from, LocalDateTime to, char type, String text) {
    	if (OFF_LINE_ORDER.equals(type)) {
    		
    	}
    }
    
    public void checkPartTimers(LocalDateTime from, LocalDateTime to, char type, String partTimerName) {
    	
    }


    /*public void offlineOrder(String menuItem, int quantity) {
    	
    }
    
    public void onlineOrder(String menuItem, int quantity) {
    	
    }*/

    
    private int getPrice(String menuItem) {
    	return 0;
    }
    
    
	

}
