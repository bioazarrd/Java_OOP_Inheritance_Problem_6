package D_JavaAdvancedOOP.Lecture2_Inheritances.ExProblem6;
public enum Gender {

    FEMALE("Female"),
    MALE("Male");

    private final String asString;

    Gender (String asString) {
        this.asString = asString;
    }

    @Override
    public String toString() {
        return this.asString;
    }
}
