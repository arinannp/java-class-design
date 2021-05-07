package digitalskola.week10;

class Segitiga {
    // Membuat instance variabel alas dan tinggi yang hanya bisa diakses instance method (non static method)
    int alas = 3;
    int tinggi = 6;

    // Membuat instance method luasSegitiga yang memiliki local inner class Luas
    void luasSegitiga() {
        // Class Luas merupakan local inner class yang hanya bisa dibuat di dalam method
        class Luas {
            // Karena calculation merupakan instance method, maka dapat akses instance variabel alas dan tinggi
            int calculation() {
                return (alas * tinggi) / 2;
            }
        }
        // Jika ingin akses method instance calculation dari class Luas, maka harus melakukan instantiate objek dari class Luas
        Luas ls = new Luas();
        System.out.println("Luas segitiga adalah " + ls.calculation());
    }
}

public class HomeworkLocalInnerClass {
    public static void main(String[] args) {
        // Melakukan instantiate class Segitiga untuk dapat mengakses method instance luasSegitiga
        Segitiga triangle = new Segitiga();
        triangle.luasSegitiga();
    }
}
