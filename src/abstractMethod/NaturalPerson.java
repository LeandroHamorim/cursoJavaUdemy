package AbstractMethod;

public class NaturalPerson extends Person{

    private Double healthExpenses;

    public NaturalPerson(){}

    public NaturalPerson(String name, Double annualIncome, Double healthExpenses){
        super(name,annualIncome);
        this.healthExpenses = healthExpenses;
    }
    public Double getHealthExpenses() {
        return healthExpenses;
    }

    public void setHealthExpenses(Double healthExpenses) {
        this.healthExpenses = healthExpenses;
    }

    @Override
    public Double tax() {
        if(getAnnualIncome() < 20000.00){
            return getAnnualIncome() * 0.15;
        }
        else if((getAnnualIncome() > 20000.00) && (healthExpenses != 0)){
            return ((getAnnualIncome() * 0.25) - (healthExpenses * 0.50));
        }
            return getAnnualIncome() * 0.25;
    }
}
