import factoryDesign.DisributorMerchant;
import factoryDesign.Merchant;
import factoryDesign.MerchantFactory;
import factoryDesign.RetailMaerchant;
import factoryDesign.WholesaleMerchant;

public class Cust1 {
public static void main(String[] args) {
	

	
	Merchant merchant = MerchantFactory.getmerchanttype("retil");
	merchant.yourname();
	Merchant merchant1 = MerchantFactory.getmerchanttype("directCompany");
	merchant1.yourname();
	Merchant merchant2 = MerchantFactory.getmerchanttype("wholesale");
	merchant2.yourname();
	/*Merchant merchant= new RetailMaerchant();
	merchant.yourname();
	Merchant merchant2= new WholesaleMerchant();
	merchant2.yourname();
	Merchant merchant3= new DisributorMerchant();
	merchant3.yourname();*/
	
	
}
}
