import java.util.Scanner;

/**
 * class limas berfungsi untuk menginput atribut dari alasluas tinggi dan volume dari limas
 */
class Limas {
    private double alasLuas;
    private double tinggi;
    private double volume;

    /**
     * constructor limas
     * @param alasLuas Luas alas limas
     * @param tinggi tinggi limas
     */
    public Limas(double alasLuas, double tinggi) {
        this.alasLuas = alasLuas;
        this.tinggi = tinggi;
    }

    /** metode untuk menghitung volume
     *
     */
    public void hitungVolume() {
        this.volume = (1.0/3.0) * this.alasLuas * this.tinggi;
    }

    /**
     * method untuk getvolume
     * @return
     */
    public double getVolume() {
        return this.volume;
    }
}

/**mainclass dan output yang akan diakses oleh user
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan luas alas limas: ");
        double alasLuas = scanner.nextDouble();

        System.out.print("Masukkan tinggi limas: ");
        double tinggi = scanner.nextDouble();

        Limas limas = new Limas(alasLuas, tinggi);

        limas.hitungVolume();

        System.out.println("Volume limas adalah: " + limas.getVolume());
    }
}
