package Final;

import java.util.Map;

public class LopHoc {
    private String MaLop;
    private String TenMon;
    private String MaGV;
    private String MaPhongHoc;
    private double TienLuong;
    private int SoTC;
    private int SoSV;


    //Constructor
    public LopHoc(String maLop, String tenMon, String maGV, String maPhongHoc, double tienLuong, int soTC) {
        MaLop = maLop;
        TenMon = tenMon;
        MaGV = maGV;
        MaPhongHoc = maPhongHoc;
        TienLuong = tienLuong;
        SoTC = soTC;
        SoSV = 0;
    }


    //getter and setter
    public int getSoSV() {
        return SoSV;
    }

    public void setSoSV(int soSV) {
        SoSV = soSV;
    }

    public int getSoTC() {
        return SoTC;
    }

    public void setSoTC(int soTC) {
        SoTC = soTC;
    }

    public double getTienLuong() {
        return TienLuong;
    }

    public void setTienLuong(double tienLuong) {
        TienLuong = tienLuong;
    }

    public String getMaLop() {
        return MaLop;
    }

    public void setMaLop(String maLop) {
        MaLop = maLop;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setMaMon(String MaMon) {
        MaMon = MaMon;
    }

    public String getMaGV() {
        return MaGV;
    }

    public void setMaGV(String maGV) {
        MaGV = maGV;
    }


    public String getMaPhongHoc() {
        return MaPhongHoc;
    }

    public void setMaPhongHoc(String maPhongHoc) {
        MaPhongHoc = maPhongHoc;
    }
}
