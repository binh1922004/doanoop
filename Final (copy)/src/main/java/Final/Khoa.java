package Final;

import java.util.*;

public class Khoa {
    private String MaKhoa;
    private String TenKhoa;
    private String TruongKhoa;
    private List<Nganh> DSNganh;
    private int SoLuongNganh;
    private List<GiangVien> DSGiangVien;
    private int CntGiangVien;
    public Khoa(String makhoa, String tenKhoa){
        MaKhoa = makhoa;
        TenKhoa = tenKhoa;
        DSNganh = new ArrayList<>();
        DSGiangVien = new ArrayList<>();
        SoLuongNganh = CntGiangVien = 0;
    }

    void setSoLuongNganh(int soluongnganh){
        this.SoLuongNganh = soluongnganh;
    }
    int getSoLuongNganh(){
        return this.SoLuongNganh;
    }
    public void addNganh(Nganh nganh){
        DSNganh.add(nganh);
        SoLuongNganh++;
    }
    public void addGV(GiangVien gv){
        DSGiangVien.add(gv);
        CntGiangVien++;
    }
    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        MaKhoa = maKhoa;
    }

    public String getTenKhoa() {
        return TenKhoa;
    }

    public void setTenKhoa(String tenKhoa) {
        TenKhoa = tenKhoa;
    }

    public String getTruongKhoa() {
        return TruongKhoa;
    }

    public void setTruongKhoa(String truongKhoa) {
        TruongKhoa = truongKhoa;
    }
}
