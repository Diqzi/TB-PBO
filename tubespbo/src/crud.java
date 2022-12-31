import java.sql.SQLException;

//implement interface
public class crud implements test{
    //deklarasi variable
    String KodeVoucher;
    String NamaPembeli;
    String NamaVoucher;
    Integer IDTransaksi;
    Integer JenisVoucher;
    Integer Tagihan;
    Integer Bayar;
    Integer Kembali;

    //methode menampilkan menu pilihan
    public void ListVoucher(){
        System.out.println("==============================");
        System.out.println("===========LIST VOUCHER=========");
        System.out.println("==============================");
        System.out.println("1.Voucher Game 20  // Rp.21.000");
        System.out.println("2.Voucher Game 50  // Rp.51.000");
        System.out.println("3.Voucher Game 100 // Rp.101.000");
        System.out.println("4.Voucher Game 200 // Rp.200.000");
        System.out.println("5.Voucher Game 500 // Rp.500.000");
        System.out.println("6.Voucher Game 1jt // Rp.1000.000");
        System.out.println("==============================\n");
    }

    //method menambahkan data
    public void insert() throws SQLException{
    }

    //method menampilkan data
    public void display() throws SQLException{
    }

    //method mengubah data
    public void update() throws SQLException{
    }

    //method mencari data
    public void search() throws SQLException{
    }

    //method menghapus data
    public void delete()throws SQLException{
    }
}
