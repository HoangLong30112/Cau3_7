package working_dir.Cau3_7.OOP;

import java.util.ArrayList;

public class Cau2_7
{
    public static void main(String[] args) {
        ArrayList<DienThoai> phones = new ArrayList<>();
        phones.add(new DienThoai("DT01", "iPhone 15", "Apple", 30000000));
        phones.add(new DienThoai("DT02", "Galaxy S24", "Samsung", 25000000));

        // Danh sách khách hàng mẫu
        KhachHang kh1 = new KhachHang("KH01", "Nguyen Van A", "0901234567");
        KhachHang kh2 = new KhachHang("KH02", "Tran Van A", "0901234567");

        // Khách hàng mua 1 điện thoại
        kh1.muaDienThoai(phones.get(0));
        kh1.muaDienThoai(phones.get(1));

        kh2.muaDienThoai(phones.get(1));


        // In hóa đơn đầu tiên của khách hàng
        kh1.getHoadon().get(0).inHoaDon();
        kh2.getHoadon().get(0).inHoaDon();
    }
}
