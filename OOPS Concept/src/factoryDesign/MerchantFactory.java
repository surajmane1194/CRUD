package factoryDesign;

import com.sun.corba.se.impl.transport.ReaderThreadImpl;

import jdk.internal.dynalink.beans.StaticClass;

public class MerchantFactory {
	public static Merchant getmerchanttype(String merchtype) {
		 Merchant merchent=null;
		if("retail".equals(merchtype)) {
			merchent= new RetailMaerchant();
		}
		if("wholesale".equals(merchtype)) {
			merchent= new WholesaleMerchant();
		}
		if("directcomapny".equals(merchtype)) {
			merchent= new DirectCompanyMerchant();
		}
		if("disributor".equals(merchtype)) {
			merchent= new DisributorMerchant();
		}
		return merchent;
	}
}
