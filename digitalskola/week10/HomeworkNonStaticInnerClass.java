package digitalskola.week10;

class Sekolah {
    // Static variabel schoolName dan teacherName dapat diakses oleh static method dan instance method
    static String schoolName = "Random";
    static String teacherName = "Raka";
    // Instance variabel address hanya bisa diakses oleh instance method
    String address = "Gandis street";

    // Instance method printSekolah dapat akses Static variabel dan Instance variabel
    void printSekolah() {
        System.out.println(School.schoolName + " beralamat di " + this.address);
    }

    // Static method printAddress hanya dapat akses Static variabel
    static void printAddress() {
        System.out.println("Alamat sekolah " + Sekolah.schoolName + " di Gandis street");
    }

    // Non-Static Inner Class Guru dapat akses static variabel dan instance variabel serta static method dan instance method dari class School
    class Guru {
        void printTeacher() {
            System.out.println(Sekolah.teacherName + " adalah guru dari sekolah " + Sekolah.schoolName + " yang beralamat di " + address);
            Sekolah.printAddress();
            printSekolah();
        }
    }
}

public class HomeworkNonStaticInnerClass {
    public static void main(String[] args) {
        // Karena class Guru adalah Non-Static inner class, maka class Guru membutuhkan reference dari class Sekolah
        // Sehingga cara melakukan instantiate-nya sebagai berikut
        Sekolah school = new Sekolah();
        Sekolah.Guru teacher = school.new Guru();

        teacher.printTeacher();
    }
}
