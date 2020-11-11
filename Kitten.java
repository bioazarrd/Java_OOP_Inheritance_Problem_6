package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem6;
public class Kitten extends Cat{

    private static final String GENDER = Gender.FEMALE.toString();

    public Kitten(String name, int age) {
        //zabranqvame na konstruktora da tyrsi gender
        super(name, age, GENDER);
    }

    @Override
    public String produceSound() {
        return "Meow";
    }
}
