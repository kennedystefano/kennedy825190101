import java.util.Scanner;
public class Tampilkan {
    public static void main(String[] args){
        Data data = new Data("Desoni","Jakarta, 28 Maret 1998","Pompa Air Jakarta Timur No.56","Laki-Laki","Kristen","Batuk Keras","Obat Menthol OBH");
        Scanner masukan = new Scanner(System.in);

        System.out.print(data.toString());

        System.out.print("\nMasukan Nama: ");
        data.setNama(masukan.nextLine());
        System.out.print("Masukan Tempat Tanggal Lahir: ");
        data.setTtl(masukan.nextLine());
        System.out.print("Masukan Alamat: ");
        data.setAlamat(masukan.nextLine());
        System.out.print("Masukan Jenis Kelamin: ");
        data.setJenisKelamin(masukan.nextLine());
        System.out.print("Masukan Kristen: ");
        data.setAgama(masukan.nextLine());
        System.out.print("Masukan Penyakit: ");
        data.setPenyakit(masukan.nextLine());
        System.out.print("Masukan Obat: ");
        data.setObat(masukan.nextLine());

        System.out.print(data.toString());
    }
}