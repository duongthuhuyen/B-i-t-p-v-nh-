package hoc_generic.vd3;

public class FunBusiness extends BaseBusiness<Fund>{
    @Override
    public void excute(Fund business) {
        System.out.println("Cổ phiếu: "+business.getBalance());

    }
}
