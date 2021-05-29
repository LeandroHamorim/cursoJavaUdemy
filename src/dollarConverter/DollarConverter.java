package dollarConverter;

public class  DollarConverter {
	public static double IOF = 0.06;
	public static double converter(double dollarPrice,double dollarBought){
		return dollarBought * dollarPrice  * (1.0 + IOF);
	}

}
