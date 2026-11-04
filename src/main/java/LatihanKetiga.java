public class LatihanKetiga {

    static int hitungKembalian(int uangBayar, int totalHarga) {
        return uangBayar - totalHarga;
    }

    public static void main(String[] args) {

        int uangBayar = 50000;
        int totalHarga = 35000;

        System.out.println("PROGRAM PEMBAYARAN BARANG");

        if (uangBayar >= totalHarga) {

            int kembalian = hitungKembalian(
                uangBayar, totalHarga
            );

            System.out.println("Pembayaran berhasil");
            System.out.println("Uang bayar: Rp" + uangBayar);
            System.out.println("Total harga: Rp" + totalHarga);
            System.out.println("Uang kembalian: Rp" + kembalian);

        } else {
            System.out.println("Uang pembayaran tidak cukup");
        }
    }
}   