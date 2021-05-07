package digitalskola.week10;

// Animal merupakan interface yang memiliki method isEating tanpa body
interface Animal {
    // Method isEating menerima parameter boolean eat dan belum memiliki implementasi
    boolean isEating(boolean eat);
    // Method print sudah memiliki implementasi dengan access spesifier default
    default void print() {
        System.out.println("Ini adalah animal");
    }
}

public class HomeworkLambdaExpression {
    public static void main(String[] args) {

        // Lambda Expression mirip dengan Anonymous Inner Class yang mana memori tidak menyimpan informasi class dimana method tanpa body di define
        // Lambda Expression hanya bisa diterapkan pada interface yang hanya memiliki satu method tanpa body (functional interface)
        // “(eating) -> {return eating;}” merupakan sebuah lambda expressions
        Animal jerry = (eating) -> {
            return eating;
        };
        // (eating) merupakan implementasi method isEating yang menerima parameter eating boolean dan akan me-return eating
        System.out.println("Apakah jerry sedang makan: " + jerry.isEating(true));
        System.out.println("Apakah jerry sedang makan: " + jerry.isEating(false));
        jerry.print();
    }
}
