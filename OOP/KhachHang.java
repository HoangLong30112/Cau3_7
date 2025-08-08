package Cau2.OOP;

import java.util.ArrayList;
import java.util.Date;

public class KhachHang
{
    private String maKH;
    private String tenKH;
    private String sdt;
    private ArrayList<HoaDon> hoadon;

    public KhachHang(String maKH, String tenKH, String sdt) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.sdt = sdt;
        this.hoadon = new ArrayList<>();
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public ArrayList<HoaDon> getHoadon() {
        return hoadon;
    }

    public void setHoadon(ArrayList<HoaDon> hoadon) {
        this.hoadon = hoadon;
    }

    public void muaDienThoai(DienThoai dienThoai){
        HoaDon hd = new HoaDon("HD"+(hoadon.size() + 1), this, new Date());
        hd.themDienThoai(dienThoai);
        hoadon.add(hd);
    }
}
