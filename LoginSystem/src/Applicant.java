public class Applicant {
    private String firstAndLastName;
    private String numberOfAdults;
    private String numberOfMinors;
    private String numberOfPets;

    public Applicant(String firstAndLastName, String numberOfAdults, String numberOfMinors, String numberOfPets) {
        this.firstAndLastName = firstAndLastName;
        this.numberOfAdults = numberOfAdults;
        this.numberOfMinors = numberOfMinors;
        this.numberOfPets = numberOfPets;
    }

    public String getFirstAndLastName() {
        return firstAndLastName;
    }

    public String getNumberOfAdults() {
        return numberOfAdults;
    }

    public String getNumberOfMinors() {
        return numberOfMinors;
    }

    public String getNumberOfPets() {
        return numberOfPets;
    }
}
