package Final;

public class HocPhi {
    private String MaHocPhi;
    private String MSSV;
    private int TongSoTC;
    private double DonGia;
    public HocPhi(String maHocPhi, String MSSV, int tongSoTC, int donGia) {
        MaHocPhi = maHocPhi;
        this.MSSV = MSSV;
        TongSoTC = tongSoTC;
        DonGia = donGia;
    }

    @Override
    public String toString() {
        return "HocPhi{" +
                "MaHocPhi='" + MaHocPhi + '\'' +
                ", MSSV='" + MSSV + '\'' +
                ", TongSoTC=" + TongSoTC +
                ", DonGia=" + DonGia +
                '}';
    }

    public double TongHocPhi(){
        return (double) DonGia*TongSoTC;
    }

    public String getMaHocPhi() {
        return MaHocPhi;
    }

    public void setMaHocPhi(String maHocPhi) {
        MaHocPhi = maHocPhi;
    }

    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public int getTongSoTC() {
        return TongSoTC;
    }

    public void setTongSoTC(int tongSoTC) {
        TongSoTC = tongSoTC;
    }

    public double getDonGia() {
        return DonGia;
    }

    public void setDonGia(double donGia) {
        DonGia = donGia;
    }
}
