public class Kelipatan {

    public static void main(String[] args) {
        // Fungsi untuk mencetak angka dengan interval 3.5
        cetakAngka();
    }

    // Fungsi untuk mencetak angka dengan interval 3.5
    public static void cetakAngka() {
        double angka = 3.5; // Mulai dari 3.5
        while (angka <= 35.0) {
            System.out.printf("%.1f%n", angka); // Menampilkan angka dengan satu decimal
            angka += 3.5; // Menambah 3.5 ke angka
        }
    }
}