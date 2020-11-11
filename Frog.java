package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem6;
public class Frog extends Animals {

    public Frog(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return "Rabbit";
    }


}
