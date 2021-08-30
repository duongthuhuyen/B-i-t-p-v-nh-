package staticdemo;

import java.util.concurrent.SynchronousQueue;

public class SV {
    private final double PI;
    public static String schoolName ="Đại học";
    private int maSV;
    private String name;
    private static SV sinhvien;//private
            //SV là sington pattern
    public SV(double y){
        PI = y;
    }
     public SV(int maSV, String name,double x) {
         PI = x;
        this.maSV = maSV;
        this.name = name;
    }

    public static String getSchoolName() {
        return schoolName;
    }

    public static void setSchoolName(String schoolName) {
        SV.schoolName = schoolName;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /*@Override
    public String toString() {
        return "SV{" +schoolName+
                ",maSV=" + maSV +
                ", name='" + name + '\'' +
                '}';
    }synchronized public static SV of(int ma,String n){
        if(sinhvien == null){

                sinhvien = new SV(ma, n);
            }

        return sinhvien;
    }*/

    public double getPI() {
        return PI;
    }
}
