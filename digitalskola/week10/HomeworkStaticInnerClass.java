package digitalskola.week10;

class School {
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
        System.out.println("Alamat sekolah " + School.schoolName + " di Gandis street");
    }

    // Static Inner Class Teacher hanya dapat akses static variabel schoolName dan teacherName serta static method printAddress dari class School
    static class Teacher {
        void printTeacher() {
            System.out.println(School.teacherName + " adalah guru dari sekolah " + School.schoolName);
            School.printAddress();
        }
    }
}

public class HomeworkStaticInnerClass {
    public static void main(String[] args) {

        // Saat instantiate objek untuk class Teacher, tidak memerlukan reference dari class School
        School.Teacher raka = new School.Teacher();
        raka.printTeacher();
    }
}
