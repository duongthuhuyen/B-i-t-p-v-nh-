import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class nhap {
    public static void main(String[] args) {
        /**
         *
         */
        /*
        try {
            Scanner sc = new Scanner(System.in);
            float x;
            x = sc.nextFloat();
            System.out.println(x);
        }catch (Exception e){
            System.out.println(e);
        }*/
        //int a =10;
        //String name = "Bong";
        //System.out.println("%d ",a);
        Date date = new Date();
        //date.getTime();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String st = simpleDateFormat.format(date);
        System.out.println(st);

    }

}
