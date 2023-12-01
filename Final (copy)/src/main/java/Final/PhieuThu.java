package Final;

public class PhieuThu {
    private String MaPhieu;
    private String MaHocPhi;
    private double TienDaThu;

    public PhieuThu(String maPhieu, String maHocPhi, double tienDaThu) {
        MaPhieu = maPhieu;
        MaHocPhi = maHocPhi;
        TienDaThu = tienDaThu;
    }

    public String getMaPhieu() {
        return MaPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        MaPhieu = maPhieu;
    }

    public String getMaHocPhi() {
        return MaHocPhi;
    }

    public void setMaHocPhi(String maHocPhi) {
        MaHocPhi = maHocPhi;
    }

    public double getTienDaThu() {
        return TienDaThu;
    }

    public void setTienDaThu(double tienDaThu) {
        TienDaThu = tienDaThu;
    }
}
