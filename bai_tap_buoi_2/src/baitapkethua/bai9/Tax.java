package baitapkethua.bai9;

public abstract class Tax implements TaxType {
    protected static double[][] taxs;
    public static final int bike = 0;
    public static final int moto = 1;
    public static final int bus = 2;
    public static final int truck = 3;
    public static final int vat=0;
    public static final int registration = 1;
    static{
        taxs = new double[4][2];
        taxs[bike][vat]=0;
        taxs[bike][registration]=0;
        taxs[moto][vat]=0.1;
        taxs[moto][registration]=0.05;
        taxs[bus][vat]=0.1;
        taxs[bus][registration]=0.2;
        taxs[truck][vat]=0.1;
        taxs[truck][registration]=0.02;
    }
}
