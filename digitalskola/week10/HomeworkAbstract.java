package digitalskola.week10;

// Class Bootcamp merupakan abstract class yang memiliki beberapa abstract method
abstract class Bootcamp {
    // Method printBootcamp bukan merupakan abstract method sehingga bisa langsung memiliki implementasi
    void printBootcamp() {
        System.out.println("Bootcamp by Digital Skola");
    }
    // Abstract method hanya bisa digunakan pada instance method (non static method)
    // Method tutorName dan participantAttendance merupakan abstract method yang harus memiliki implementasi di subclass
    abstract void tutorName();
    abstract int participantAttendance();
}

// Class DataEngineer merupakan subclass dari class Bootcamp sehingga harus memiliki implementasi method tutorName dan participantAttendance
class DataEngineer extends Bootcamp {
    // Abstarct method tutorName diimplementasi di class DataEngineer dengan cara Overriding
    @Override
    void tutorName() {
        System.out.println("Nama tutor kelas Data Engineer: Mas Ali, Mas Dimas, Mas Rizki dan Mas Rio");
    }
    // Abstarct method participantAttendance diimplementasi di class DataEngineer dengan cara Overriding
    @Override
    int participantAttendance() {
        return 19;
    }
}


public class HomeworkAbstract {
    public static void main(String[] args) {
        // Class Bootcamp merupakan abstract class sehingga tidak bisa di instantiate langsung,
        // Jadi hanya class DataEngineer yang bisa di instantiate karena sudah memiliki implementasi dari method tutorName dan participantAttendance
        DataEngineer de = new DataEngineer();
        // Memanggil method printBootcamp dari object de
        de.printBootcamp();
        // Memanggil method tutorName dari object de
        de.tutorName();
        // Melakukan print method participantAttendance dari object de
        System.out.println("Jumlah partisipan kelas Data Engineer: " + de.participantAttendance());
    }
}
