package digitalskola.week10;

// Class Student memiliki keyword final artinya tidak bisa dilakukan inheritance
final class Student {
    // Instance variabel studentName dan jumlahMurid hanya bisa di assign satu kali dalam satu objek
    final String studentName;
    final int jumlahMurid;

    // Parameter studentName dan jumlahMurid karena bersifat final tidak bisa di assign lagi (hanya menerima value saat instantiate objek)
    Student(final String studentName, final int jumlahMurid) {
        this.studentName = studentName;
        this.jumlahMurid = jumlahMurid;
    }

    // Parameter namaKelas karena bersifat final tidak bisa di assign lagi (hanya menerima value saat pemanggilan method)
    // Method printKelas tidak bisa dilakukan overriding karena bersifat final
    final void printKelas(final String namaKelas) {
        System.out.println(this.studentName + " murid kelas " + namaKelas + " dengan total murid " + this.jumlahMurid);
    }
}

public class HomeworkFinalKeyword {
    public static void main(String[] args) {

        // Untuk objek yang berbeda walaupun memiliki keyword final tetap bisa memberi value parameter berbeda,
        // karena kita melaukan instantiate untuk objek yang berbeda
        Student arinan = new Student("Arinan", 20);
        arinan.printKelas("12C");

        Student randi = new Student("Randi", 19);
        randi.printKelas("12A");
    }
}
