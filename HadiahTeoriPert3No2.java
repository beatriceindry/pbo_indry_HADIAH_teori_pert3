import java.util.Scanner;
public class HadiahTeoriPert3No2{
	public static void main(String[] args){
		Scanner masukan = new Scanner(System.in);
		
		String nama, alamat;
		int umur;
		
		System.out.print("Nama = ");
		nama = masukan.nextLine();
		System.out.print("Alamat = ");
		alamat = masukan.nextLine();
		System.out.print("Umur = ");
		umur = masukan.nextInt();
		System.out.println("Saudara		:		"+nama);
		System.out.println("Tinggal Di	:		"+alamat);
		System.out.println("Berumur		:		"+umur+ " Tahun");
	}
}