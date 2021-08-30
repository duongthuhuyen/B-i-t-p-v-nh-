import java.util.Scanner;

public class mang2chieu {
    private static int dong;
    private static int cot;
    public static void nhapmang(int a[][]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<dong;i++ ){
            for(int j =0;j<cot;j++){
                System.out.print("a["+i+"]["+j+"]= ");
                a[i][j]=sc.nextInt();
            }
        }
    }
    public static void xuatmang(int a[][]){
        //Scanner sc = new Scanner(System.in);
        for(int i=0;i<dong;i++ ){
            for(int j =0;j<cot;j++){
                System.out.print(a[i][j]+" ");

            }
            System.out.println();
        }
    }
    public static int tinhtongdong(int a[][],int x ){
        //Scanner sc = new Scanner(System.in);
            int s=0;
            for(int j =0;j<cot;j++){
                s+=a[x][j];
            }
            //System.out.println();
        return s;
    }
    public static int tinhtongcot(int a[][],int x ){
        //Scanner sc = new Scanner(System.in);
        int s=0;
        for(int j =0;j<dong;j++){
            s+=a[j][x];
        }
        //System.out.println();
        return s;
    }
    public static int tinhtong(int a[][]){
        //Scanner sc = new Scanner(System.in);
        int s=0;
        for(int i=0;i<dong;i++ ){
            for(int j =0;j<cot;j++){
               s+=a[i][j];
            }
        }
        //System.out.println();
        return s;
    }
    // kiểm tra xem x có tồn tại trong mảng
    public static int[] kiemtra(int a[][],int x){
        for(int i=0;i<dong;i++ ){
            for(int j =0;j<cot;j++){
                if(a[i][j]== x){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    //đếm số phần tử hoàng hậu: là phần tử lớn nhất trên dòng , lớn nhất trên côt, lớn nhất trên 2 đường chép
    public static boolean Checkhoanghau(int a[][],int i,int j){
        //boolean check = true;
        for(int k =0;k<dong;k++){
            if(a[k][j]>a[i][j]){
                return false;
            }
        }
        for(int k =0;k<cot;k++){
            if(a[i][k]>a[i][j]){
                return false;
            }
        }
        int d = i-1;
        int c= j-1;
        while (d>=0&&c>=0){
            if(a[d][c] >a[i][j]){
                return false;
            }
            d--;
            c--;
        }
        d= i-1;
        c = j+1;
        while(d>=0 && c<cot){
            if(a[d][c]>a[i][j]){
                return false;

            }
            d--;
            c++;
        }
        d = i+1;
        c = j+1;
        while(d<dong && c<cot){
            if(a[d][c]>a[i][j]){
                return false;

            }
            d++;
            c++;
        }
         d = i+1;
         c = j-1;
        while(d<dong && c>=0){
            if(a[d][c]>a[i][j]){
                return false;

            }
            d++;
            c--;
        }
        return true;
    }
    public static int demphantuhoanghau(int a[][]){
        int dem = 0;
        for (int i =0;i<dong;i++){
            for(int j = 0;j<cot;j++){
                if(Checkhoanghau(a,i,j)){
                    dem++;
                }
            }
        }
        return dem;
    }
    // đếm số phần tử yên ngựa: là phần tử nhỏ nhất trên dòng và lớn nhất trên cột
    public static boolean checkyenngua(int a[][],int i,int j){

        for(int k =0;k<dong;k++){
            if(a[k][j]>a[i][j]){
                return false;
            }
        }
        for(int k =0;k<cot;k++){
            if(a[i][k]<a[i][j]){
                return false;
            }
        }
        return true;
    }
    public static int demphantuyenngua(int a[][]){
        int dem = 0;
        for (int i =0;i<dong;i++){
            for(int j = 0;j<cot;j++){
                if(checkyenngua(a,i,j)){
                    dem++;
                }
            }
        }
        return dem;
    }
   public static int chusoxuathien(int a[][]){
        int b[] = new int[10];
       for(int i=0;i<dong;i++ ){
           for(int j =0;j<cot;j++){
               while(a[i][j]>0){
                   int c =a[i][j]%10;
                   b[c]++;
                   a[i][j]=a[i][j]/10;
               }
           }
       }
       int max = b[0];
       int c = 0;
       for(int i =1;i<10;i++){
           if(max <b[i]){
               max =b[i];
               c = i;
           }
       }
       return c;
   }
    public static void main(String[] args) {
        dong =2;
        cot= 3;
        int a[][]=new int[dong][cot];
        nhapmang(a);
        xuatmang(a);
       // System.out.println(chusoxuathien(a));
        System.out.println("dem phan tu hoang hau : "+demphantuhoanghau(a));

    }
}
