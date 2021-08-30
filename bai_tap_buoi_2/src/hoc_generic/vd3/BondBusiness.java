package hoc_generic.vd3;

public class BondBusiness extends BaseBusiness<Bond>{
    @Override
    public void excute(Bond business) {
        System.out.println("Trái phiếu "+business.getName());
    }
}
