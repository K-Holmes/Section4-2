import java.util.Scanner;

public class RhymingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String animal = getAnimal(sc);
        if (rhymingAnimal(animal)){
            System.out.println("This animal rhymes with cat!");
        } else {
            System.out.println("This animal doesn't rhyme");
        }
        sc.close();
    }

    private static boolean rhymingAnimal(String animal){
        return animal.matches("[a-zA-Z]{1,2}(at|AT)");
    }
    private static String getAnimal(Scanner sc){
        System.out.println("Please enter the name of an animal");
        return sc.next();
    }
}
