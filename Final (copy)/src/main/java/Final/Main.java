package Final;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static ArrayList<Khoa> dsKhoa;
    public static ArrayList<Nganh> dsNganh;
    public static ArrayList<GiangVien> dsGiangVien;
    public static ArrayList<LopHoc> dsLop;
    public static ArrayList<PhongHoc> dsPhongHoc;
    public static ArrayList<HocPhi> dsHocPhi;
    public static ArrayList<SinhVien> dsSinhVien;
    public static ArrayList<PhieuThu> dsPhieuThu;
    public static void main(String[] args) {
         dsKhoa = new ArrayList<>();
         dsNganh = new ArrayList<>();
         dsGiangVien = new ArrayList<>();
         dsLop = new ArrayList<>();
         dsPhongHoc= new ArrayList<>();
         dsSinhVien = new ArrayList<>();
         dsHocPhi = new ArrayList<>();
         dsPhieuThu = new ArrayList<>();
        //tạo danh sách khoa
        taoDSKhoa();
        //tạo danh sách ngành
        taoDSNganh();
        //tạo danh sách giảng viên
        taoDSGV();
        //Bổ sung trưởng khoa
        dsKhoa.get(0).setTruongKhoa("G001");
        dsKhoa.get(1).setTruongKhoa("G007");
        dsKhoa.get(2).setTruongKhoa("G012");
        dsKhoa.get(3).setTruongKhoa("G015");
        //tạo danh sách lóp
        taoDSLop();
        //Tạo danh sách phòng học
        taoDSPhongHoc();
        //Tạo danh sách sinh viên
        taoDSSinhVien();
        //Tạo danh sách học phí
        taoDSHocPhi();
        //Tạo danh sách phiếu thu
        taoDSPhieuThu();

        Cau1("K001");
        System.out.println("--Cau hoi 1--");

        Cau2("K002");
        System.out.println("--Cau hoi 2--");

        int res = Cau3("K003");
        System.out.println("Khoa K003 co " + res + " nganh");
        System.out.println("--Cau hoi 3---");

        Cau4();
        System.out.println("--Cau hoi 4--");

        Cau5();
        System.out.println("--Cau hoi 5--");

        Cau6();
        System.out.println("--Cau hoi 6--");

        Cau7();
        System.out.println("--Cau hoi 7--");

        Cau8();
        System.out.println("--Cau hoi 8--");

        Cau9();
        System.out.println("--Cau hoi 9--");

        Cau10();
        System.out.println("--Cau hoi 10--");

        Cau11();
        System.out.println("--Cau hoi 11--");

        Cau12();
        System.out.println("--Cau hoi 12--");


    }
    static void taoDSKhoa(){
        dsKhoa.add(new Khoa("K001", "Cong Nghe Thong Tin"));
        dsKhoa.add(new Khoa("K002", "Dien Dien Tu"));
        dsKhoa.add(new Khoa("K003", "Co Khi Dong Luc"));
        dsKhoa.add(new Khoa("K004", "Thoi Trang va Du Lich"));
    }
    static void taoDSNganh(){
        dsNganh.add(new Nganh("N001", "Cong nghe thong tin", "K001"));
        dsNganh.add(new Nganh("N002", "Ky thuat du lieu", "K001"));
        dsNganh.add(new Nganh("N003", "An toan thong tin", "K001"));

        dsNganh.add(new Nganh("N004", "CNKT Dien dien tu", "K002"));
        dsNganh.add(new Nganh("N005", "CNKT Dien tu vien thong", "K002"));
        dsNganh.add(new Nganh("N006", "IoT", "K002"));

        dsNganh.add(new Nganh("N007", "Ky thuat oto", "K003"));
        dsNganh.add(new Nganh("N008", "Ky thuat nhiet", "K003"));

        dsNganh.add(new Nganh("N009", "Cong nghe may", "K004"));
        dsNganh.add(new Nganh("N010", "Thiet ke thoi trang", "K004"));
        dsNganh.add(new Nganh("N011", "QTNH va AU", "K004"));
    }
    static void taoDSGV(){
        dsGiangVien.add(new GiangVien("G001", "Nguyen Van A",  35, "Nam","K001"));
        dsGiangVien.add(new GiangVien("G002", "Nguyen Van B", 35,"Nam",  "K001"));
        dsGiangVien.add(new GiangVien("G003", "Nguyen Van C", 43,"Nu",  "K001"));
        dsGiangVien.add(new GiangVien("G004", "Nguyen Van D", 35,"Nam",  "K001"));

        dsGiangVien.add(new GiangVien("G005", "Nguyen Van E", 32,"Nu",  "K002"));
        dsGiangVien.add(new GiangVien("G006", "Nguyen Van F", 32,"Nam",  "K002"));
        dsGiangVien.add(new GiangVien("G007", "Nguyen Van E", 44,"Nam",  "K002"));
        dsGiangVien.add(new GiangVien("G008", "Nguyen Van V",  32,"Nu", "K002"));

        dsGiangVien.add(new GiangVien("G009", "Nguyen Van K", 31,"Nam", "K003"));
        dsGiangVien.add(new GiangVien("G010", "Nguyen Van L", 38,"Nu",  "K003"));
        dsGiangVien.add(new GiangVien("G011", "Nguyen Van X", 39,"Nam",  "K003"));
        dsGiangVien.add(new GiangVien("G012", "Nguyen Van P", 40,"Nam",  "K003"));

        dsGiangVien.add(new GiangVien("G015", "Nguyen Van I", 40,"Nu",  "K004"));
        dsGiangVien.add(new GiangVien("G013", "Nguyen Van G", 41, "Nu", "K004"));
        dsGiangVien.add(new GiangVien("G014", "Nguyen Van R", 35,"Nu",  "K004"));
    }
    static void taoDSLop(){
        dsLop.add(new LopHoc("L001", "M001", "G003", "P001",100, 3));
        dsLop.add(new LopHoc("L002", "M002", "G004", "P001",150, 4));
        dsLop.add(new LopHoc("L003", "M003", "G001", "P001",150, 3));
        dsLop.add(new LopHoc("L004", "M004", "G012", "P002",100, 2));
        dsLop.add(new LopHoc("L005", "M005", "G013", "P002",100, 1));
        dsLop.add(new LopHoc("L006", "M006", "G004", "P003",120, 4));
        dsLop.add(new LopHoc("L007", "M007", "G005", "P001",120, 4));
        dsLop.add(new LopHoc("L008", "M008", "G006", "P004",120, 3));
        dsLop.add(new LopHoc("L009", "M009", "G007", "P006",125, 2));
        dsLop.add(new LopHoc("L010", "M010", "G009", "P006",125, 3));
        dsLop.add(new LopHoc("L011", "M011", "G009", "P004",125, 3));
        dsLop.add(new LopHoc("L012", "M012", "G007", "P002",110, 4));
        dsLop.add(new LopHoc("L013", "M013", "G010", "P003",110, 3));
        dsLop.add(new LopHoc("L014", "M014", "G011", "P002",100, 3));
        dsLop.add(new LopHoc("L015", "M015", "G015", "P004",150, 1));
        dsLop.add(new LopHoc("L016", "M016", "G014", "P001",150, 2));
    }
    static void taoDSPhongHoc(){
        dsPhongHoc.add(new PhongHoc("P001"));
        dsPhongHoc.add(new PhongHoc("P002"));
        dsPhongHoc.add(new PhongHoc("P003"));
        dsPhongHoc.add(new PhongHoc("P004"));
        dsPhongHoc.add(new PhongHoc("P005"));
        dsPhongHoc.add(new PhongHoc("P006"));
    }
    static void taoDSSinhVien(){
        dsSinhVien.add(new SinhVien("S001", "Vo Van A", 19, "Nam", 22, "N001"));
        //sv hoc bao nhieu mon
            dsSinhVien.get(0).addLop(dsLop.get(0));
            dsSinhVien.get(0).addLop(dsLop.get(1));
            dsSinhVien.get(0).addLop(dsLop.get(3));
        dsSinhVien.add(new SinhVien("S002", "Vo Van B", 19,"Nu", 22, "N001"));
            dsSinhVien.get(1).addLop(dsLop.get(0));
            dsSinhVien.get(1).addLop(dsLop.get(2));
            dsSinhVien.get(1).addLop(dsLop.get(4));
        dsSinhVien.add(new SinhVien("S003", "Vo Van C", 18, "Nam", 23, "N002"));
            dsSinhVien.get(2).addLop(dsLop.get(3));
            dsSinhVien.get(2).addLop(dsLop.get(6));
            dsSinhVien.get(2).addLop(dsLop.get(7));
        dsSinhVien.add(new SinhVien("S004", "Vo Van D", 23, "Nam", 19, "N003"));
            dsSinhVien.get(3).addLop(dsLop.get(2));
            dsSinhVien.get(3).addLop(dsLop.get(15));
            dsSinhVien.get(3).addLop(dsLop.get(9));
        dsSinhVien.add(new SinhVien("S005", "Vo Van E", 20, "Nu", 21, "N003"));
            dsSinhVien.get(4).addLop(dsLop.get(3));
            dsSinhVien.get(4).addLop(dsLop.get(4));
            dsSinhVien.get(4).addLop(dsLop.get(11));
        dsSinhVien.add(new SinhVien("S006", "Vo Van H", 20, "Nam",21, "N004"));
            dsSinhVien.get(5).addLop(dsLop.get(8));
            dsSinhVien.get(5).addLop(dsLop.get(9));
            dsSinhVien.get(5).addLop(dsLop.get(10));
        dsSinhVien.add(new SinhVien("S007", "Vo Van V", 25, "Nu",19, "N005"));
            dsSinhVien.get(6).addLop(dsLop.get(13));
        dsSinhVien.add(new SinhVien("S008", "Vo Van J", 19, "Nu",22, "N005"));
            dsSinhVien.get(7).addLop(dsLop.get(14));
            dsSinhVien.get(7).addLop(dsLop.get(12));
            dsSinhVien.get(7).addLop(dsLop.get(0));
        dsSinhVien.add(new SinhVien("S009", "Vo Van K", 19, "Nu",23, "N004"));
            dsSinhVien.get(8).addLop(dsLop.get(3));
            dsSinhVien.get(8).addLop(dsLop.get(4));
        dsSinhVien.add(new SinhVien("S010", "Vo Van L", 20, "Nam",20, "N006"));
            dsSinhVien.get(9).addLop(dsLop.get(8));
            dsSinhVien.get(9).addLop(dsLop.get(10));
            dsSinhVien.get(9).addLop(dsLop.get(12));
        dsSinhVien.add(new SinhVien("S011", "Vo Van Q", 23, "Nam",21, "N007"));
            dsSinhVien.get(10).addLop(dsLop.get(1));
            dsSinhVien.get(10).addLop(dsLop.get(3));
            dsSinhVien.get(10).addLop(dsLop.get(4));
            dsSinhVien.get(10).addLop(dsLop.get(10));
        dsSinhVien.add(new SinhVien("S012", "Vo Van O", 19, "Nam",22, "N007"));
            dsSinhVien.get(11).addLop(dsLop.get(0));
            dsSinhVien.get(11).addLop(dsLop.get(3));
            dsSinhVien.get(11).addLop(dsLop.get(4));
        dsSinhVien.add(new SinhVien("S013", "Vo Van X", 22, "Nam",19, "N008"));
            dsSinhVien.get(12).addLop(dsLop.get(13));
            dsSinhVien.get(12).addLop(dsLop.get(15));
            dsSinhVien.get(12).addLop(dsLop.get(12));
    }
    static void taoDSHocPhi(){
        int cnt = 0;
        for (SinhVien sv: dsSinhVien){
            int tongTC = 0;
            cnt++;
            String maHocPhi = "H" + String.valueOf(cnt);
            List<LopHoc> lopHocs= sv.getDSLopHoc();
            for (LopHoc lopHoc: lopHocs){
                tongTC += lopHoc.getSoTC();
            }
            dsHocPhi.add(new HocPhi(maHocPhi, sv.getMa(), tongTC, sv.getKhoa()));
        }
    }

    static void taoDSPhieuThu(){
        dsPhieuThu.add(new PhieuThu("PT1", "H1", 100));
        dsPhieuThu.add(new PhieuThu("PT2", "H1", 98));

        dsPhieuThu.add(new PhieuThu("PT3", "H2", 50));
        dsPhieuThu.add(new PhieuThu("PT4", "H2", 50));
        dsPhieuThu.add(new PhieuThu("PT5", "H2", 52));

        dsPhieuThu.add(new PhieuThu("PT6", "H3", 200));

        dsPhieuThu.add(new PhieuThu("PT7", "H4", 100));
        dsPhieuThu.add(new PhieuThu("PT8", "H4", 5));

        dsPhieuThu.add(new PhieuThu("PT9", "H5", 147));

        dsPhieuThu.add(new PhieuThu("PT10", "H6", 65));
        dsPhieuThu.add(new PhieuThu("PT11", "H6", 3));
        dsPhieuThu.add(new PhieuThu("PT12", "H6", 100));

        dsPhieuThu.add(new PhieuThu("PT13", "H7", 33));
        dsPhieuThu.add(new PhieuThu("PT14", "H7", 23));

        dsPhieuThu.add(new PhieuThu("PT15", "H8", 120));
        dsPhieuThu.add(new PhieuThu("PT16", "H8", 54));

        dsPhieuThu.add(new PhieuThu("PT17", "H9", 32));
        dsPhieuThu.add(new PhieuThu("PT18", "H9", 33));
        dsPhieuThu.add(new PhieuThu("PT19", "H9", 1));

        dsPhieuThu.add(new PhieuThu("PT20", "H10", 78));
        dsPhieuThu.add(new PhieuThu("PT21", "H10", 82));

        dsPhieuThu.add(new PhieuThu("PT22", "H11", 210));

        dsPhieuThu.add(new PhieuThu("PT23", "H12", 21));

        dsPhieuThu.add(new PhieuThu("PT24", "H13", 50));
    }
    static void Cau1(String maKhoa){
        List<Nganh> ds_nganh = dsNganh.stream()
                .filter(nganh -> nganh.getMaKhoa().equals(maKhoa))
                .collect(Collectors.toList());
        if (ds_nganh.size() == 0){
            System.out.println("Khoa co nganh thuoc khoa " + maKhoa);
        }
        else{
            System.out.println("Danh sach nganh thuoc khoa " + maKhoa);
            for (Nganh nganh: ds_nganh){
                System.out.println(nganh);
            }
        }
    }
    static void Cau2(String maKhoa){
        Optional<String> matruongnhom = dsKhoa.stream()
                .filter(khoa -> khoa.getMaKhoa().equals(maKhoa))
                .map(Khoa::getTruongKhoa)
                .findFirst();
        if (matruongnhom.isPresent()){
            System.out.println("Khoa " + maKhoa + " co truong nhom la " + matruongnhom.get());
        }
        else{
            System.out.println("Khong co khoa noa phu hop");
        }
    }
    static int Cau3(String maKhoa){
        long soluongnganh = dsNganh.stream()
                .filter(nganh -> nganh.getMaKhoa().equals(maKhoa))
                .count();
        return (int)soluongnganh;
    }
    static void Cau4(){
        for (Khoa khoa: dsKhoa){
            khoa.setSoLuongNganh(Cau3(khoa.getMaKhoa()));
        }
        Optional<Khoa> maxnganh = dsKhoa.stream()
                .max(Comparator.comparing(khoa -> khoa.getSoLuongNganh()));
        System.out.println("Khoa co nhieu nganh nhat la " + maxnganh.get().getMaKhoa());
    }

    static void Cau5(){
        for (PhongHoc phongHoc: dsPhongHoc){
            String maPhong = phongHoc.getMaPhongHoc();
            long soluonglop = dsLop.stream().filter(lopHoc -> lopHoc.getMaPhongHoc().equals(maPhong))
                    .count();
            System.out.println("Phong hoc " + maPhong + " co " + soluonglop + " lop");
        }
    }

    static void Cau6(){
        Set<String> giangVienCoLop = dsLop.stream()
                .map(LopHoc::getMaGV)
                .collect(Collectors.toSet());

        List<GiangVien> gv = dsGiangVien.stream()
                .filter(giangVien -> giangVienCoLop.contains(giangVien.getMa()) == false)
                .collect(Collectors.toList());
        if (gv.size() == 0){
            System.out.println("Giang vien nao cung co lop");
        }
        else{
            System.out.println("Danh sach giang vien chua co lop");
            for (GiangVien giangVien: gv){
                System.out.println(giangVien);
            }
        }
    }
    static void Cau7(){
        Map<String, Double> tongThuNhap = dsLop.stream().
                collect(Collectors.groupingBy(LopHoc::getMaGV, Collectors.summingDouble(LopHoc::getTienLuong)));
        List<Map.Entry<String, Double>> sortedThuNhap = new ArrayList<>(tongThuNhap.entrySet());
        sortedThuNhap.sort((e1,e2) -> e2.getValue().compareTo(e1.getValue()));
        sortedThuNhap.forEach(entry ->{
            System.out.println("Ma giang vien " + entry.getKey() + " - tong thu nhap " + entry.getValue());
        });
    }

    static void Cau8(){
        Map<String, Double> tongThuNhap = dsLop.stream().
                collect(Collectors.groupingBy(LopHoc::getMaGV, Collectors.summingDouble(LopHoc::getTienLuong)));
        Optional<Double> maxThuNhap = tongThuNhap.values().stream().max(Double::compare);
        Optional<Double> minThuNhap = tongThuNhap.values().stream().min(Double::compare);
        double avgThuNhap = tongThuNhap.values().stream().
                mapToDouble(Double::doubleValue).
                average().
                orElse(0.0);
        System.out.println("Thu nhap cao nhat " + maxThuNhap.get());
        tongThuNhap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(maxThuNhap.orElse(0.0)))
                .forEach(entry -> System.out.println("Ma giang vien " + entry.getKey() + " co tong thu nhap lon nhat " + entry.getValue()));
        System.out.println("Thu nhap nho nhat " + minThuNhap.get());
        tongThuNhap.entrySet().stream()
                .filter(entry -> entry.getValue().equals(minThuNhap.orElse(0.0)))
                .forEach(entry -> System.out.println("Ma giang vien " + entry.getKey() + " co tong thu nhap thap nhat " + entry.getValue()));
        System.out.println("Nhom tho co thu nhap lon hoac bang trun binh");
        tongThuNhap.entrySet().stream()
                .filter(entry -> entry.getValue() >= avgThuNhap)
                .forEach(entry -> {
                    System.out.println("Ma giang vien " + entry.getKey());
                });
    }

    static void Cau9(){
        Map<String, Long> soLanSuDungPhong = dsLop.stream()
                .collect(Collectors.groupingBy(LopHoc::getMaPhongHoc, Collectors.counting()));
        Optional<Map.Entry<String, Long>> maxSoLan = soLanSuDungPhong.entrySet().stream()
                .max(Map.Entry.comparingByValue());
        if (maxSoLan.isPresent()){
            System.out.println("Phong hoc duoc su dung nhieu nhat " + maxSoLan.get().getKey() + " voi so lan la " + maxSoLan.get().getValue());
        }
    }
    static void Cau10(){
        Set<String> phongHocDaSuDung = dsLop.stream()
                .map(LopHoc::getMaPhongHoc)
                .collect(Collectors.toSet());

        System.out.println("Danh sach nhung phong chua duoc su dung");
        dsPhongHoc.stream()
                .filter(phongHoc -> !phongHocDaSuDung.contains(phongHoc.getMaPhongHoc()))
                .forEach(phongHoc -> System.out.println("Phong hoc " + phongHoc.getMaPhongHoc() + " chua duoc su dung"));
    }

    static void Cau11(){
        Optional<HocPhi> maxHocPhi = dsHocPhi.stream()
                .max(Comparator.comparing(hocphi -> hocphi.TongHocPhi()));
        System.out.println("Ma sinh vien " + maxHocPhi.get().getMSSV() + " - tien hoc phi " + maxHocPhi.get().TongHocPhi());
    }

    static void Cau12(){
        Map<String, Double> toltalTienHocPhi = dsPhieuThu.stream()
                .collect(Collectors.groupingBy(PhieuThu::getMaHocPhi, Collectors.summingDouble(PhieuThu::getTienDaThu)));

        dsHocPhi.stream()
                .filter(hocPhi -> hocPhi.TongHocPhi() == toltalTienHocPhi.getOrDefault(hocPhi.getMaHocPhi(), 0.0))
                .forEach(hp -> System.out.println("Sinh vien " + hp.getMSSV() + " - da dong du tien hoc, tien da thanh toan: " + hp.TongHocPhi()));
    }
    static int Cau13(String maLop){
        int tong = 0;
        for (SinhVien sv: dsSinhVien){
            for (LopHoc lop: sv.getDSLopHoc()){
                if (lop.getMaLop() == maLop)
                    tong++;
            }
        }
        System.out.println("Ma lop " + maLop + " - co " + tong + " sinh vien");
        return tong;
    }
}
