public class LatihanKeempat {

    static void tampilkanDaftarBarang(String namaBarang, int jumlahBeli) {

        System.out.println("\nDaftar Barang:");

        for (int i = 1; i <= jumlahBeli; i++) {
            System.out.println("Barang ke-" + i + ": " + namaBarang);
        }
    }

    public static void main(String[] args) {

        String namaBarang = "Buku";
        int jumlahBeli = 3;

        System.out.println("PROGRAM PEMBELIAN BARANG");

        System.out.println("Pembelian berhasil");

        tampilkanDaftarBarang(namaBarang, jumlahBeli);
    }
}       