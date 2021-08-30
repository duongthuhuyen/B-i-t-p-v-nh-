import java.util.Scanner;

public class hoc_mang{
    private static int n;
    public static void input(int a[],int n ){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<n;i++ ){
            System.out.print("a["+i+"] = ");
            a[i]= sc.nextInt();
        }
    }
    public static void output(int a[],int n){
        for(int i=0;i<n;i++ ){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    //thêm 1 phần tử vào mảng
    public static void them(int a[],int giatrithem,int vitrithem){
        //n++;
        //a[n-1]=0;
        for(int i = n-1;i>=vitrithem-1;i--){
            a[i+1]=a[i];
        }
        a[vitrithem-1]=giatrithem;
        n++;
    }
    //thêm 1 phần tử vào trước số lẻ
    public static void themvaotruocsole(int a[],int giatrithem){
        for(int i = 0; i<n;i++){
            if(a[i]%2==1){
                them(a,giatrithem,i+1);
                //System.out.println(n);
               // output(a,n);
                i++;
            }

        }
    }
    //xóa 1 phần tử của
    public static void xoa(int a[],int vitrixoa){
        for(int i = vitrixoa-1;i<n-1;i++){
            a[i] =a[i+1];
        }
        a[n-1] = 0;
        n--;
    }
    //xóa số chẵn có trong mảng
    public static void xoasochan(int a[]){
        for(int i=0;i<n;i++ ){
            if(a[i]%2==0){
                xoa(a,i+1);
                i--;
            }
        }
    }
    //xap xep
    public static void sapxepgiam (int a[]){
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(a[j]>a[i]){
                    int b =a[j];
                    a[j]=a[i];
                    a[i]=b;
                }
            }
        }
    }
    public static void sapxeptang (int a[]){
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(a[j]<a[i]){
                    int b =a[j];
                    a[j]=a[i];
                    a[i]=b;
                }
            }
        }
    }
    public static void timsolonthuk(int a[],int k  ){
        /*sapxepgiam(a);
        int dem=1;
        for(int i=1;i<n;i++ ){
            if(a[i]!=a[i-1]){
                dem++;
            }
            if(dem == k ){
                System.out.println("số lớn thứ "+k +" trong mảng là : "+a[i]);
                return;
            }
        }*/
        int dem =1;
        for(int i =0;i<n-1;i++){
            for(int j =i+1;j<n;j++){
                if(a[j]>a[i]){
                    int b =a[j];
                    a[j]=a[i];
                    a[i]=b;
                }
            }
            if(i>0){
                if(a[i]!=a[i-1]){
                    dem++;
                }
            }
            if(dem ==k){
                System.out.println("số lớn thứ "+k +" trong mảng là : "+a[i]);
                return;
            }
        }
    }
    public static int demcacsokhacnhaucuamang(int a[]){
        int dem  =1;
        sapxeptang(a);
        for(int i  =1;i<n;i++){
            if(a[i]!=a[i-1]){
                dem++;
            }
        }
        return dem;
    }
    //thuật toán tìm kiếm tuần tự: duyệt tất cả các phần tửu của mảng. nếu bằng ptu thì return về vị trí
    //của phần tử tìm kiếm
    public static int timkiemtuantu(int a[],int x){
        for(int i=0;i<n;i++ ){
            if(a[i]==x){
                return i;
            }
        }
        return -1;
    }
    //thuật toán tìm kiếm nhị phân ( chỉ được áp dụng với mảng đã xắp xếp)
    public static int timkiemnhiphan(int a[],int left,int right,int x){
        sapxeptang(a);
        int l= left;
        int r = right;
        int midle;
        while(l<=r){
            midle = (l+r)/2;
            if(a[midle]>x){
                r = midle-1;
            }else if(a[midle]<x){
                l = midle+1;
            }else{
                return midle;
                //break;
            }
        }
        return -1;

    }
    //tìm trong mảng có 2 phần tử có tổng bằng k không a[i]+a[j] bằng k
    public static void timkiem2phantutongbangk(int a[],int k){
        sapxeptang(a);
        for(int i =0;i<n;i++){
            int b = k-a[i];
            if(timkiemnhiphan(a,0,n-1,b)!=i && timkiemnhiphan(a,0,n-1,b)!=-1){
                System.out.println("tồn tại 2 vị trí thỏa mãn là i bằng "+ i+" và j bằng "+timkiemnhiphan(a,0,n-1,b ));


            }
        }
    }
    // thuật toán lùa bò vào chuồng : k chuồng và n( được đánh dấu theo số chuồng ) con bò.
    // những con bò nào có chung số chuồng thì xẽ xếp vào 1 chuồng

    // vd: bài toán đếm tần xuất xuất hiện của các phần tử trong mảng biết rằng 0<= a[i]<=1000
    public static void tansuatxuathien(int a[]){
        int[] chuong = new int [1001];
        for (int i = 0;i<chuong.length;i++){
            chuong[i] = 0;
        }
        for(int i  = 0;i<n;i++){
            chuong[a[i]]++;
        }
        for(int i = 0;i<chuong.length;i++){
            if(chuong[i]!=0){
                System.out.println(i+" Tần xuất : "+chuong[i]);
            }
        }
    }

    // chữ số xuất hiện nhiều nhất trong mảng
    public static  int chusoxuathiennhieunhattrongmang(int a[]){
        int k [] = new int [1000];
        int j = 0;
        for(int i = 0;i<n;i++){
            while(a[i]>0){
                int b = a[i]%10;
                a[i]= a[i]/10;
                k[j]= b;
                j++;
            }
        }
        int[] chuong = new int [10];
        for (int i = 0;i<chuong.length;i++){
            chuong[i] = 0;
        }
        for(int i  = 0;i<j;i++){
            chuong[k[i]]++;
        }
        int c = chuong[0];
        int m = 0 ;
        for(int i = 0;i<chuong.length;i++){
            if(chuong[i]>c){
                c = chuong[i];
                m = i;
            }
        }
        return m;

    }
// kỹ thuật mảng đánh dấu: sinh ra 1 cái mảng để đánh dấu các điều kiện tránh lặp lại. đó
// khi không biết giới hạn của các số trong mảng, --> ko dùng được lùa bò vào chuồng
public static void tansuatxuathien2(int a[]){
    int[] danhdau = new int [a.length];
    for (int i = 0;i<danhdau.length;i++){
        danhdau[i] = 0;
    }
    for(int i  = 0;i<n;i++){

        if(danhdau[i]==0){
            int dem = 0;
            for(int j = i;j<n;j++){
                if(a[i]==a[j]){
                    dem++;
                    danhdau[j]=1;
                }
            }
            System.out.println(a[i]+" xuất hiện : "+dem);
        }
    }

}

//kỹ thuật đánh dấu mảng con
    // ví dụ : xuất tất cả mảng con trong mảng 1 chiều
    public static void mangcon(int a[]){
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                for(int k = i;k<= j;k++){
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
        }
    }

// xuất ra tổng của từng mảng con

    public static void tongmangcon(int a[]){
        for(int i = 0;i<n;i++){
            for(int j = i;j<n;j++){
                int s =0;
                for(int k = i;k<= j;k++){
                    s+= a[k];

                    }
                System.out.println(s);
                }
                //System.out.println();
            }
        }


    public static void main(String[] args) {
        int a[] = new int[100];
         n = 3;

        input(a,n);
        output(a,n);
        //them(a,10,1);
        //output(a,n);
        //themvaotruocsole(a,0);
        //System.out.println(n);
       // output(a,n);
        //xoa(a,2);
        //output(a,n);
        //xoasochan(a);
        //timsolonthuk(a,4);
        //output(a,n);
        //System.out.println("Đếm số phần tử khác nhau của mảng: "+demcacsokhacnhaucuamang(a));
        // bài toán tìm số lớn thứ k trong dãy--> xắp xếp giảm dần và đếm tìm phần tử thứ k
        // bài toán đếm số phần tử khác nhau trong mảng3
        //System.out.println("Đếm số phần tử khác nhau của mảng: "+timkiemnhiphan(a,0,8,3));
        //timkiem2phantutongbangk(a,10);
        //tansuatxuathien(a);
       // System.out.println("Chữ số xuất hiện nhiều nhất trong mảng là "+chusoxuathiennhieunhattrongmang(a));
        //tansuatxuathien2(a);
        tongmangcon(a);



}

}
