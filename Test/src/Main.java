import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    final private static HashMap<String, String> animalSounds = new HashMap<>();

    static {
        animalSounds.put("Dog", "Woof");
        animalSounds.put("Cat", "Meow");
        animalSounds.put("Mouse", "Squeak");
        animalSounds.put("Cow", "Mooo");
    }

    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Mouse");
        animals.add("Cow");

        for (String animal : animals) {
            if (animal.equals("Dog"))  {
                continue;
            }
            System.out.println(animal + " says " + getSound(animal));
        }
    }

    private static String getSound(String animal) {
        return animalSounds.get(animal);
    }
}