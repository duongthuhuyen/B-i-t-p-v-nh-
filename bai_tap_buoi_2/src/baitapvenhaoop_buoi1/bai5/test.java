package baitapvenhaoop_buoi1.bai5;

public class test {
    public static void main(String[] args) {
        Rational ps1 = new Rational(2,4);
        //Rational kq = new Rational();
        Rational ps3 = new Rational(9,2);
        ps1.reduce();
        //System.out.println("Phan so ps1 sau khi rut gon : "+ps1.getNumerator()+"/"+ ps1.getDenominator());
        //ps1.add(kq,ps3);
        Rational kq1 = new Rational();
        //System.out.println("Cong 2 ps1 va ps3: "+kq.getNumerator()+"/ "+kq.getDenominator());
        ps1.subtract(kq1,ps3);
        System.out.println("Tru 2 ps1 va ps3 "+kq1.getNumerator()+"/"+kq1.getDenominator());
        /*Rational kq2 = new Rational();
        ps1.multiply(kq2,ps3);
        System.out.println("Nhan 2 phan so ps1 va ps3 : "+kq2.getNumerator()+" / "+kq2.getDenominator());
        Rational kq3 = new Rational();
        ps1.divide(kq3,ps3);
        System.out.println("Chia 2 phan so ps1 va ps3 : "+kq3.getNumerator()+"/"+kq3.getDenominator());
        ps1.soSanh(ps3);
*/
    }
}
