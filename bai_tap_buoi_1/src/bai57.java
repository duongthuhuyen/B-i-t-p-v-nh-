import java.util.Scanner;

public class bai57 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int k = 0;
        while(x>0){
            int a= x%10;
            if(a%2==1){
                k++;
                System.out.print("Khong phai so có toàn các chữ số chắn");
                return;
            }
            x /=10;

        }
        if(k== 0){
            System.out.print("Là số có toàn chữ số chẵn");
        }
        //System.out.print(k);
    }
}
