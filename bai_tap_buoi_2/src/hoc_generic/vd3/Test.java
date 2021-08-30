package hoc_generic.vd3;

public class Test {
    public static void main(String[] args) {
        BaseBusiness.get(CKConstance.BOND).excute(new Bond());
        BaseBusiness.get(CKConstance.FUND).excute(new Fund());


    }
}
