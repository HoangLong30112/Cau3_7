package Cau2.OOP;

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
    
    public  void inHoaDon(){
        System.out.println("Mã HD: " + maHD);
        System.out.println("Khách hàng: " + khachHang.getTenKH());
        System.out.println("Ngày mua: " + ngaymua);
        System.out.println("Sản phẩm:");
        for (DienThoai dt : dienThoai) {
            System.out.println("- " + dt.getTenDT() + " (" + dt.getGia() + " VND)");
        }
    }
}
