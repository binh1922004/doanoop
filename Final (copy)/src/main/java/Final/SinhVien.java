package Final;

import java.util.ArrayList;
import java.util.List;

public class SinhVien{
    private String Ma;
    private String Ten;
    private int Tuoi;
    private String GioiTinh;
    private int Khoa;
    private String MaNganh;
    private Nganh nganh;
    private List<LopHoc> DSLopHoc;
    public SinhVien(String ma, String ten, int tuoi, String gioiTinh, int khoa, String maNganh) {
        Ma = ma;
        Ten = ten;
        Tuoi = tuoi;
        GioiTinh = gioiTinh;
        Khoa = khoa;
        MaNganh = maNganh;
        DSLopHoc = new ArrayList<>();
    }

    public boolean timLop(String maLop){
        for (LopHoc lopHoc: DSLopHoc){
            if (lopHoc.getMaLop() == maLop)
                return true;
        }
        return false;
    }
    public int getKhoa() {
        return Khoa;
    }

    public void setKhoa(int khoa) {
        Khoa = khoa;
    }

    public void addLop(LopHoc lop){
        DSLopHoc.add(lop);
    }

    public List<LopHoc> getDSLopHoc() {
        return DSLopHoc;
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

    public void setDSLopHoc(List<LopHoc> DSLopHoc) {
        this.DSLopHoc = DSLopHoc;
    }

    public String getMaNganh() {
        return MaNganh;
    }

    public void setMaNganh(String maNganh) {
        MaNganh = maNganh;
    }

    public Nganh getNganh() {
        return nganh;
    }

    public void setNganh(Nganh nganh) {
        this.nganh = nganh;
    }
}
