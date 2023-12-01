package Final;

import java.util.ArrayList;
import java.util.List;

public class PhongHoc {
    private String MaPhongHoc;
    private int SoLuongLop;
    private List<LopHoc> DSLop;

    public PhongHoc(String maPhongHoc) {
        MaPhongHoc = maPhongHoc;
        DSLop = new ArrayList<>();
        SoLuongLop = 0;
    }
    void addLop(LopHoc lop){
        DSLop.add(lop);
        SoLuongLop++;
    }
    public String getMaPhongHoc() {
        return MaPhongHoc;
    }

    public void setMaPhongHoc(String maPhongHoc) {
        MaPhongHoc = maPhongHoc;
    }

    public List<LopHoc> getDSLop() {
        return DSLop;
    }

    public void setDSLop(ArrayList<LopHoc> DSLop) {
        this.DSLop = DSLop;
    }
}

