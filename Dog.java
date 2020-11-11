package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem6;

public class Dog extends Animals{
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }


    @Override
    public String produceSound() {
        return "Woof!";
    }
}
