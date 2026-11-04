public class LatihanKedua {
    public static void main(String[] args) {

        int stok = 5;

        System.out.println("Simulasi Stok Barang");

        while (stok > 0) {
            stok--;
            System.out.println("Sisa stok: " + stok);
        }

        System.out.println("Stok habis");
    }
}   