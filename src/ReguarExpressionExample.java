public class ReguarExpressionExample {
    public static void main(String[] args) {
        if (getAnimal("cat")){
            System.out.println("This is a Valid Animal");
        } else {
            System.out.println("This is not a Valid Animal");
        }
    }

    public static boolean getAnimal(String animal){
        return animal.matches("[Cc]at|[Dd]dog");
    }
}
