import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Phan_1 {

    public static class Mang {

        public static void main(String[] args) {
            BtMang m = new BtMang();
            System.out.println("Hien Thi 10 sinh vien: ");
            m.HienThi(10);

            Scanner nhap = new Scanner(System.in);
            System.out.println("Nhap so sinh vien can hien thi: ");
            int n = nhap.nextInt();
            m.HienThi(n);
        }
    }

    public static class BtMang {

        public String TaoNgay(String ngay1, String ngay2) {
            try {
                SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
                Date n1 = f.parse(ngay1);
                Date n2 = f.parse(ngay2);
                Random r = new Random();
                while (true) {
                    long t = r.nextLong();

                    if (t >= n1.getTime() && t <= n2.getTime()) {
                        Date n = new Date(t);
                        return f.format(n);
                    }
                }
            } catch (Exception tt) {
                System.out.println("Loi: " + tt.getMessage());
                return null;
            }
        }

        public String TaoHoTen() {
            String[] ho = {"Pham", "Phan", "Nguyen", "Le", "Tran"};
            String[] chulot = {"Ngoc", "Thanh", "Hoang", "Van", "Trung"};
            String[] ten = {"Kiet", "Phuc", "Vu", "Nghia", "Toan"};
            Random r = new Random();
            String h = ho[r.nextInt(ho.length)];
            String cl = chulot[r.nextInt(chulot.length)];
            String t = ten[r.nextInt(ten.length)];
            return h + " " + cl + " " + t;
        }

        public void HienThi(int n) {
            Random r = new Random();
            for (int i = 1; i <= n; ++i) {
                double dtb = r.nextDouble() * 10;
                String gioiTinh = (r.nextBoolean()) ? "Nam" : "Nu";
                String ketQua = (dtb >= 5) ? "Đậu" : "Rớt";
                String xepLoai;
                if (dtb >= 8.0) {
                    xepLoai = "Giỏi";
                } else if (dtb >= 6.5) {
                    xepLoai = "Khá";
                } else if (dtb >= 5.0) {
                    xepLoai = "Trung bình";
                } else if (dtb >= 3.1) {
                    xepLoai = "Yếu";
                } else {
                    xepLoai = "Kém";
                }

                System.out.println(TaoHoTen() + "; "
                        + TaoNgay("01/01/1960", "01/01/2000") + "; "
                        + gioiTinh + "; "
                        + dtb + "; "
                        + ketQua + "; "
                        + xepLoai);
            }
        }
    }
}
