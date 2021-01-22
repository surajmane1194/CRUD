package factoryDesign;

public class MerchantFactory1 {
	
	static Merchant merchant = null;

	static Merchant gettypeofmerchant1(String merchtype) {
		if ("retail".equals(merchtype)) {
			merchant = new RetailMaerchant();
		}
		if ("wholesale".equals(merchtype)) {
			merchant = new WholesaleMerchant();
		}
		if ("directcomapny".equals(merchtype)) {
			merchant = new DirectCompanyMerchant();
		}
		if ("distributor".equals(merchtype)) {
			merchant = new DisributorMerchant();
		}

		return merchant;
	}
}
