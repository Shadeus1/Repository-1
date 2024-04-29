public class Dog extends Main {

    private String type;
    private String move;
    private String mode;


    public Dog(String type, String move, String mode) {
        this.type = type;
        this.move = move;
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "The " + type + " is " + move + " and is " + mode;
    }
}
