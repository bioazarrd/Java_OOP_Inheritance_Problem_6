package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem6;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        String line = reader.readLine();
        List<Animals> animalsList = new ArrayList<>();

        while (!line.equals("Beast!")) {
            String type = line;
            String[] tokens = reader.readLine().split("\\s+");

            try {
                Animals animal = createAnimal(type, tokens);
                animalsList.add(animal);
            } catch (Exception ex) {
                ex.printStackTrace();
                System.out.println("Invalid input!");
            }
            line = reader.readLine();
        }


        for (Animals animal : animalsList) {
            System.out.println(animal.toString());
        }
    }










    private static Animals createAnimal(String type, String[] tokens) {
        String name = tokens[0];
        int age = Integer.parseInt(tokens[1]);

        String gender = "";
        if (!type.equals("Kitten") && !type.equals("Tomcat")) {
            gender = tokens[2];
        }


        Animals animal = null;

        if (type.equals("Cat")) {
            animal =  new Cat(name, age, gender);
        } else if (type.equals("Dog")) {
            animal =  new Dog(name, age, gender);
        } else if (type.equals("Frog")) {
            animal =  new Frog(name, age, gender);
        } else if (type.equals("Kitten")) {
            animal =  new Kitten(name, age);
        } else if (type.equals("Tomcat")) {
            animal =  new Tomcat(name, age);
        }
        return animal;
    }
}
