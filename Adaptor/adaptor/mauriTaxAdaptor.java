package adaptor;

import java.util.*;

public class mauriTaxAdaptor implements decathlonTaxCalc {
	
	mauriTax mt = new mauriTax();
	
    public double taxCalc(double amt) {
        return mt.getVat(amt);
    }

}