package baitapkethua.bai12;

public class Test {
    public static void main(String[] args) {
         Shape s  = new Circle();
         s.draw();
         Drawing drawing = new Drawing();
         drawing.drawShape(s);
    }

}
