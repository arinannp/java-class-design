package digitalskola.week10;

// Abstract class dan Interface dapat memiliki method yang tidak ada body-nya
interface Human {
    // Method makan, bernafas dan isWorking adalah method yang belum memiliki implementasi
    void makan();
    void bernafas();
    boolean isWorking(boolean work);
    // Method tanpa body hanya bisa diterapkan pada non-static method
}

public class HomeworkAnonymousInnerClass {
    public static void main(String[] args) {

        // Apabila membuat implementasi method dari interface dengan instantiation dan overriding di method main,
        // Maka object class akan menjadi Anonymous Inner Class artinya memori tidak menyimpan informasi class dimana method tanpa body di define
        Human manusia = new Human() {
            // Membuat implementasi dari method makan dengan overriding
            @Override
            public void makan() {
                System.out.println("Manusia sedang makan");
            }

            // Membuat implementasi dari method bernafas dengan overriding
            @Override
            public void bernafas() {
                System.out.println("Manusia sedang bernafas");
            }

            // Membuat implementasi dari method isWorking yang menerima parameter work dengan overriding
            @Override
            public boolean isWorking(boolean work) {
                return work;
            }
        };
        manusia.makan();
        manusia.bernafas();
        System.out.println("Apakah manusia sedang bekerja: " + manusia.isWorking(true));
    }
}
