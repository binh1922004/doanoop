package Final;

public abstract class ConNguoi {
    protected String Ma;
    protected String Ten;
    protected int Tuoi;
    protected String GioiTinh;
    public ConNguoi(String ma, String ten, int tuoi, String gioiTinh) {
        Ma = ma;
        Ten = ten;
        Tuoi = tuoi;
        GioiTinh = gioiTinh;
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
