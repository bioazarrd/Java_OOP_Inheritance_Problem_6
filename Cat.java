package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem6;

public class Cat extends Animals {
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }


    @Override
    public String produceSound() {
        return "Meow meow!";
    }
}
