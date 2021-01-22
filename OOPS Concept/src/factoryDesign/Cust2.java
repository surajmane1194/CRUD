package factoryDesign;

import factoryDesign.Merchant;
import factoryDesign.MerchantFactory;

public class Cust2 {
	public static void main(String[] args) {
		Merchant merchant= MerchantFactory1.gettypeofmerchant1("retail");
		merchant.yourname();
		Merchant merchantD= MerchantFactory1.gettypeofmerchant1("distributo");
		merchantD.yourname();
		Merchant merchantW= MerchantFactory1.gettypeofmerchant1("wholesale");
		merchantW.yourname();
		//Merchant merchant= new Merchant();
		//merchant.getClass()
	}

}
