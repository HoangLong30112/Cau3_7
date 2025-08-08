package working_dir.Cau3_7.OOP;

import java.util.ArrayList;
import java.util.Date;

public class HoaDon
{
    private String maHD;
    private KhachHang khachHang;
    private ArrayList<DienThoai> dienThoai;
    private Date ngaymua;

    public HoaDon(String maHD, KhachHang khachHang, Date ngaymua) {
        this.maHD = maHD;
        this.khachHang = khachHang;
        this.dienThoai = new ArrayList<>();
        this.ngaymua = ngaymua;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public ArrayList<DienThoai> getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(ArrayList<DienThoai> dienThoai) {
        this.dienThoai = dienThoai;
    }

    public Date getNgaymua() {
        return ngaymua;
    }

    public void setNgaymua(Date ngaymua) {
        this.ngaymua = ngaymua;
    }

    public  void themDienThoai(DienThoai dt){
        dienThoai.add(dt);
    }

    public double giamGia(DienThoai dt) {
        for(DienThoai dienThoai : dienThoai){
            if(dienThoai.getHangSX().equalsIgnoreCase("Samsung")){
                return dienThoai.getGia() * 0.9;
            }
        }
        return dt.getGia();
    }

    public double inGiamGia(DienThoai dt) {
        for(DienThoai dienThoai : dienThoai){
            if(dienThoai.getHangSX().equalsIgnoreCase("Samsung")){
                return 10;
            }
        }
        return 0;
    }


    public  void inHoaDon(){
        System.out.println("Mã HD: " + maHD);
        System.out.println("Khách hàng: " + khachHang.getTenKH());
        System.out.println("Ngày mua: " + ngaymua);
        System.out.println("Sản phẩm:");
        for (DienThoai dt : dienThoai) {
            System.out.printf("- %s (%,.0f VND)/Giảm giá: %,.0f%%%n", dt.getTenDT(), giamGia(dt), inGiamGia(dt));
        }
    }
}
