package Final;

import java.util.ArrayList;
import java.util.List;

public class SinhVien extends ConNguoi {
    private int Khoa;
    private String MaNganh;
    private Nganh nganh;
    private List<LopHoc> DSLopHoc;
    public SinhVien(String ma, String ten, int tuoi, String gioiTinh, int khoa, String maNganh) {
        super(ma, ten, tuoi, gioiTinh);
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
