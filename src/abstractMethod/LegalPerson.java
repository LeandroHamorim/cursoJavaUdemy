package AbstractMethod;

public class LegalPerson extends Person{

    private Integer numberOfEmployees;

    public LegalPerson(){}

    public LegalPerson(String name, Double annualIncome, Integer numberOfEmployees) {
        super(name, annualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if(numberOfEmployees > 10){
            return getAnnualIncome() * 0.14;
        }
        return getAnnualIncome() * 0.16;
    }
}
