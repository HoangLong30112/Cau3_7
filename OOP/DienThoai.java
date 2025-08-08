package working_dir.Cau3_7.OOP;

public class DienThoai
{
    private String maDT;
    private String tenDT;
    private String hangSX;
    private int gia;

    public DienThoai(String maDT, String tenDT, String hangSX, int gia) {
        this.maDT = maDT;
        this.tenDT = tenDT;
        this.hangSX = hangSX;
        this.gia = gia;
    }

    public String getMaDT() {
        return maDT;
    }

    public void setMaDT(String maDT) {
        this.maDT = maDT;
    }

    public String getTenDT() {
        return tenDT;
    }

    public void setTenDT(String tenDT) {
        this.tenDT = tenDT;
    }

    public String getHangSX() {
        return hangSX;
    }

    public void setHangSX(String hangSX) {
        this.hangSX = hangSX;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }
}
