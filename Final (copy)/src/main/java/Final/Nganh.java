package Final;

import java.util.ArrayList;
import java.util.List;

public class Nganh {
    private String MaNganh;
    private String TenNganh;

    private String MaKhoa;
    private Khoa Khoa;

    public Nganh(String maNganh, String tenNganh, String maKhoa) {
        MaNganh = maNganh;
        TenNganh = tenNganh;
        MaKhoa = maKhoa;
    }

    @Override
    public String toString() {
        return "Ma nganh " + MaNganh + " - Ten nganh " + TenNganh;
    }

    public String getMaNganh() {
        return MaNganh;
    }

    public void setMaNganh(String maNganh) {
        MaNganh = maNganh;
    }

    public String getTenNganh() {
        return TenNganh;
    }

    public void setTenNganh(String tenNganh) {
        TenNganh = tenNganh;
    }

    public String getMaKhoa() {
        return MaKhoa;
    }

    public void setMaKhoa(String maKhoa) {
        MaKhoa = maKhoa;
    }

    public Final.Khoa getKhoa() {
        return Khoa;
    }

    public void setKhoa(Final.Khoa khoa) {
        Khoa = khoa;
    }

}
