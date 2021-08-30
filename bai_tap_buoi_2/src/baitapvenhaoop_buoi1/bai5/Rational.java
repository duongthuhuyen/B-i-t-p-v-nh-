package baitapvenhaoop_buoi1.bai5;

public class Rational {
    private int numerator;
    private  int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Rational() {
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void reduce(){
        int x= this.numerator;
        int y= this.denominator;
        while (x!=y){
            if(x>y){
                x-=y;
            }
            if (x<y){
                y -= x;
            }
        }
        this.numerator /= x;
        this.denominator /= y;

    }
    public  void  reciprocal(){
        int x = this.numerator;
        this.numerator = this.denominator;
        this.denominator = x;
    }
    public void add(Rational kq,Rational sh){
        kq.numerator = this.numerator *sh.denominator+this.denominator*sh.numerator;
        kq.denominator= this.denominator*sh.denominator;
        kq.reduce();
    }
    public void subtract(Rational kq,Rational st){
        kq.numerator = this.numerator *st.denominator-this.denominator*st.numerator;
        kq.denominator= this.denominator*st.denominator;
        kq.reduce();
    }
    public void multiply(Rational kq,Rational ts){
        kq.numerator = this.numerator*ts.numerator;
        kq.denominator = this.denominator*ts.denominator;
        kq.reduce();
    }
    public void divide(Rational kq, Rational sc){
        sc.reciprocal();
        this.multiply(kq,sc);
    }
    public void soSanh(Rational a){
        Rational kq = new Rational();
        this.subtract(kq,a);
        double k = (double) kq.numerator/(double) kq.denominator;
        if (k>0.0001){
            System.out.println(this.numerator+"/"+this.denominator+" > "+a.numerator+"/"+a.denominator);

        }else if (k == 0.0001){
            System.out.println(this.numerator+"/"+this.denominator+" = "+a.numerator+"/"+a.denominator);
        }else{
            System.out.println(this.numerator+"/"+this.denominator+" < "+a.numerator+"/"+a.denominator);
        }
    }
}
