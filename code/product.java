import java.util.Scanner;

public class product {
	private int ma_sp;
	private String ten_sp;
	private double gia_sp;
	private double chiet_khau;
	private double real_price;
	public product(int ma_sp, String ten_sp, double gia_sp, double chiet_khau, double real_price) {
		super();
		this.ma_sp = ma_sp;
		this.ten_sp = ten_sp;
		this.gia_sp = gia_sp;
		this.chiet_khau = chiet_khau;
		this.real_price = real_price;
	}
	public double getReal_price() {
		return real_price = (this.gia_sp - (this.gia_sp * this.chiet_khau));
	}
	public void setReal_price(double real_price) {
		this.real_price = real_price;
	}
	public product() {
	}
	public int getMa_sp() {
		return ma_sp;
	}
	public void setMa_sp(int ma_sp) {
		this.ma_sp = ma_sp;
	}
	public String getTen_sp() {
		return ten_sp;
	}
	public void setTen_sp(String ten_sp) {
		this.ten_sp = ten_sp;
	}
	public double getGia_sp() {
		return gia_sp;
	}
	public void setGia_sp(double gia_sp) {
		this.gia_sp = gia_sp;
	}
	public double getChiet_khau() {
		return chiet_khau;
	}
	public void setChiet_khau(double chiet_khau) {
		this.chiet_khau = chiet_khau;
	}
	public void add() {
		Scanner input = new Scanner(System.in);
		System.out.print("Nhập mã sản phẩm: ");
		this.ma_sp = input.nextInt();
		input.nextLine();
		System.out.print("Nhập tên sản phẩm: ");
		this.ten_sp = input.nextLine();
		System.out.print("Nhập giá sản phẩm: ");
		this.gia_sp = input.nextDouble();
		System.out.print("Nhập chiết khấu sản phẩm: ");
		this.chiet_khau = input.nextDouble();
		System.out.println();
	}
	public void print() {
		System.out.println("Mã sản phẩm :" + this.ma_sp);
		System.out.println("Tên sản phẩm :" + this.ten_sp);
		System.out.println("Giá sản phẩm :" + this.gia_sp);
		System.out.println("Chiết khấu sản phẩm :" + this.chiet_khau);
		System.out.println("Giá thực :" + this.real_price);
		System.out.println("==========");
	}
}

