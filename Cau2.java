class HocSinh {
    private String hoTen, lop;
    private double toan;
    private double ly;
    private double hoa;
    public String getHoTen(){
        return hoTen;
    }
    public void setHoTen(String hoTen){
        this.hoTen=hoTen;
    }
    public String getLop(){
        return lop;
    }
    public void setLop(String lop){
         this.lop=lop;
    }
    public double getToan(){
        return toan;
    }
    public void setToan(double toan){
         this.toan=toan;
    }
    public double getLy(){
        return ly;
    }
    public void setLy(double ly){
         this.ly=ly;
    }
    public double getHoa(){
        return hoa;
    }
    public void setHoa(double hoa){
        this.hoa=hoa;
    }
    public double tinhDiemTB(){
        return (this.toan + this.ly + this.hoa)/3;
    }
}
class HocSinhChuyenToan extends HocSinh{
    @Override
    public double tinhDiemTB(){
        return (this.getToan()*2 + this.getLy()+this.getHoa())/4;
    }

}
public class Cau2{
    public static void main(String[] args) {
        HocSinh hs=new HocSinh();
        hs.setHoTen("Nguyen Van A");
        hs.setLop("CNTT");
        hs.setToan(6);
        hs.setLy(7);
        hs.setHoa(5);
        System.out.println("Ten hoc sinh: "+hs.getHoTen());
        System.out.println("Lop: "+hs.getLop());
        System.out.println("Diem Toan: "+hs.getToan() + "," + "  Diem Ly: "+hs.getLy()+ "," + "  Diem Hoa: "+hs.getHoa());
        
        HocSinhChuyenToan hsct=new HocSinhChuyenToan();
        hsct.setHoTen("Tran Van B");
        hsct.setLop("CNTT4");
        hsct.setToan(9);
        hsct.setLy(7);
        hsct.setHoa(10);
        System.out.println("Ten hoc sinh chuyen toan: "+hsct.getHoTen());
        System.out.println("Lop chuyen toan: "+hsct.getLop());
        System.out.println("Diem Toan: "+hsct.getToan() + "," + "  Diem Ly: "+hsct.getLy()+ "," + "  Diem Hoa: "+hsct.getHoa());
        System.out.println("DTB cua hoc sinh chuyen toan: "+hsct.tinhDiemTB());
}
}
