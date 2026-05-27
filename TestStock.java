package cis245homework1;

public class TestStock {

	public static void main(String[] args) {
		Stock stock1 = new Stock("ORCL", "Oracle Corporation");
		
		stock1.previousClosingPrice = 34.5;
		stock1.currentPrice = 34.35;
		
		System.out.println("Stock Name: " + stock1.name);
		System.out.println("Stock Symbol: " + stock1.Symbol);
		System.out.printf("Price-Change Percentage: %.2f%%\n" , stock1.getChangePercent());
		

	}

}
