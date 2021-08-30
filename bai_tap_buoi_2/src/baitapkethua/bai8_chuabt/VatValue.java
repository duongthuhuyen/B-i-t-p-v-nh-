package baitapkethua.bai8_chuabt;

public abstract class VatValue implements VAT,ProductType{
    protected static double[] vats ;

    static{
        vats = new double[3];
        vats[FOOD]= 0.05;
        vats[ELECTRIC]=0.1;
        vats[CROKERY]=0.1;
    }


}
