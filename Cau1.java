class Nhanvien {
    protected String ten;
    protected long luong;
    public String getTen(){
        return ten;
    }
    public void setTen(String ten){
        this.ten=ten;
    }
    public long getLuong(){
        return luong;
    }
    public void setLuong(long luong){
        this.luong=luong;
    }
    protected String loainhanvien;
    public String getLoaiNhanVien(){
        return loainhanvien;
    }
    public void setLoaiNhanVien(String loainhanvien){
        this.loainhanvien=loainhanvien;
    }
    protected double tinhLuong;
    public double getTinhLuong(){
        return this.luong;
    }
}
class Nhanvienfulltime extends Nhanvien{
    private String loaiChucVu;
    private int ngayLamThem;
    
    public String  getLoaiChucVu(){
        return loaiChucVu;
    }
    public void setLoaiChucVu(String loaiChucVu){
        this.loaiChucVu=loaiChucVu;
    }
    public int getNgayLamThem(){
        return ngayLamThem;
    }
    public void setNgayLamThem(int ngayLamThem){
        this.ngayLamThem=ngayLamThem;
    }
    @Override
    public String getLoaiNhanVien(){
        return loainhanvien;
    }
    public void setLoaiNhanVien(String loainhanvien){
        this.loainhanvien=loainhanvien;
    }
    @Override
    public double getTinhLuong(){
        return this.ngayLamThem*luong; 
    }
}
class NhanvienParttime extends Nhanvien{
    private int gioLamViec;
    public int getGioLamViec(){
        return gioLamViec;
    }
    public void setGioLamViec(int gioLamViec){
        this.gioLamViec=gioLamViec;
    }
    @Override
    public String getLoaiNhanVien(){
        return loainhanvien;
    }
    public void setLoaiNhanVien(String loainhanvien){
        this.loainhanvien=loainhanvien;
    }
    @Override
    public double getTinhLuong(){
        return this.gioLamViec*luong;
    }
}
public class Cau1{
    public static void main(String[] args) {
        Nhanvien nv= new Nhanvien();
        nv.setTen("A");
        nv.setLoaiNhanVien("Tot");
        nv.setLuong(10000000);
        System.out.println("Thong tin nhan vien: ");
        System.out.println("Ten nhan vien: "+nv.getTen());
        System.out.println("Xep loai nhan vien: "+nv.getLoaiNhanVien());
        System.out.println("Luong nhan vien: "+nv.getLuong());

        Nhanvienfulltime nvft =new Nhanvienfulltime();
        nvft.setTen("A");
        nvft.setLoaiChucVu("Sep");
        nvft.setLuong(500000);
        nvft.setNgayLamThem(10);
        nvft.setLoaiNhanVien("Xuat sac");
        System.out.println("\n Thong tin nhan vien: ");
        System.out.println("Ten nhan vien: "+nvft.getTen());
        System.out.println("Loai chuc vu: "+nvft.getLoaiChucVu());
        System.out.println("Xep loai nhan vien: "+nvft.getLoaiNhanVien());
        System.out.println("Luong nhan vien: "+nvft.getLuong());
        System.out.println("So ngay lam them: "+nvft.getNgayLamThem());
        System.out.println("Tong luong nhan vien: "+nvft.getTinhLuong());
        

        NhanvienParttime nvpt= new NhanvienParttime();
        nvpt.setTen("C");
        nvpt.setLuong(25000);
        nvpt.setLoaiNhanVien("Kha");
        nvpt.setGioLamViec(5);
        System.out.println("\n Thong tin nhan vien: ");
        System.out.println("Ten nhan vien: "+nvpt.getTen());
        System.out.println("Xep loai nhan vien: "+nvpt.getLoaiNhanVien());
        System.out.println("Luong nhan vien: "+nvpt.getLuong());
        System.out.println("Tong luong nhan vien: "+nvpt.getTinhLuong());
    }
}
