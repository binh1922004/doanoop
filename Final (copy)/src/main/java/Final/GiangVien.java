package Final;

import java.util.ArrayList;
import java.util.List;

public class GiangVien{
    private String Ma;
    private String Ten;
    private int Tuoi;
    private String GioiTinh;
    private String MaKhoa;
    private Khoa KhoaDay;

    public GiangVien(String ma, String ten, int tuoi, String gioiTinh, String khoa) {
        Ma = ma;
        Ten = ten;
        Tuoi = tuoi;
        GioiTinh = gioiTinh;
        MaKhoa = khoa;
    }


    @Override
    public String toString() {
        return "Ma giang vien " + Ma + " - Ten giang vien " + Ten;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        MaKhoa = maKhoa;
    }

    public Khoa getKhoaDay() {
        return KhoaDay;
    }

    public void setKhoaDay(Khoa khoaDay) {
        KhoaDay = khoaDay;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String ma) {
        Ma = ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int tuoi) {
        Tuoi = tuoi;
    }

    public String getGioiTinh() {
        return GioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        GioiTinh = gioiTinh;
    }
}
