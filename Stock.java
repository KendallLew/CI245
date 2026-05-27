package cis245homework1;

public class Stock {
	String Symbol;
	String name;
	double previousClosingPrice;
	double currentPrice; 
	
	Stock(String newSymbol, String newName) {
		Symbol = newSymbol;
		name = newName; 
	}
	double getChangePercent() {
		return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
		
	}

}
