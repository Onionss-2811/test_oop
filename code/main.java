import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = 5;
		product sp[] = new product[n];
		boolean flag = true;
		do {
			System.out.println("1.Nhập thông tin cho từng sản phẩm\n"
					+ "2.Hiển thị sản phẩm theo giá tăng dần\n"
					+ "3.Thoát\n");
			System.out.println("Vui lòng chọn chức năng: ");
			int chon = input.nextInt();
			switch(chon) {
			case 1:
				for(int i = 0; i < n; i++) {
					System.out.println("Nhập sản phẩm thứ " + (i+1));
					System.out.println();
					sp[i] = new product();
					sp[i].add();
				}
				break;
			case 2:
				product temp = sp[0];
				for(int i = 0; i < n; i++) {
					for(int j = i + 1; j < n; j++) {
						if(sp[i].getReal_price() > sp[j].getReal_price()) {
							temp = sp[j];
							sp[j] = sp[i];
							sp[i] = temp;
						}
					}
				}
				System.out.println("Sắp xếp sản phẩm theo giá thực:");
				for(int i = 0; i < n; i++) {
					sp[i].print();
				}
				break;
			case 3:
				System.out.println("Tạm biệt");
				flag = false;
				break;
			default:
				System.out.println("Chức năng không phù hợp");
				break;
			}
			
		}while(flag);

	}

}
