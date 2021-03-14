package dabral.rajdeep.employeeManagementSystem.entities;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class SalaryComponentMapping {
    @Column(name="basicSalary")
    private double basicSalary;
    @Column(name="bonusSalary")
    private double bonusSalary;
    @Column(name="taxAmount")
    private double taxAmount;
    @Column(name="specialAllowanceSalary")
    private double specialAllowanceSalary;

    public SalaryComponentMapping(){

    }
    public SalaryComponentMapping(double basicSalary, double bonusSalary, double taxAmount, double specialAllowanceSalary) {
        this.basicSalary = basicSalary;
        this.bonusSalary = bonusSalary;
        this.taxAmount = taxAmount;
        this.specialAllowanceSalary = specialAllowanceSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getBonusSalary() {
        return bonusSalary;
    }

    public void setBonusSalary(double bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getSpecialAllowanceSalary() {
        return specialAllowanceSalary;
    }

    public void setSpecialAllowanceSalary(double specialAllowanceSalary) {
        this.specialAllowanceSalary = specialAllowanceSalary;
    }
}
