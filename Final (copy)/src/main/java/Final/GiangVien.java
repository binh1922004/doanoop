package Final;

import java.util.ArrayList;
import java.util.List;

public class GiangVien extends ConNguoi{
    private String MaKhoa;
    private Khoa KhoaDay;
    private List<LopHoc> DSLop;

    public GiangVien(String ma, String ten, int tuoi, String gioiTinh, String khoa) {
        super(ma, ten, tuoi, gioiTinh);
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
        return super.getMa();
    }
    public void setMa(String ma) {
        super.setMa(ma);
    }
    public String getTen() {
        return super.getTen();
    }
    public void setTen(String ten) {
        super.setTen(ten);
    }
    public int getTuoi() {
        return super.getTuoi();
    }

    public void setTuoi(int tuoi) {
        super.setTuoi(tuoi);
    }

    public String getGioiTinh() {
        return super.getGioiTinh();
    }
    public void setGioiTinh(String gioiTinh) {
        super.setGioiTinh(gioiTinh);
    }

    public void addLop(LopHoc lop){
        DSLop.add(lop);
    }

}
