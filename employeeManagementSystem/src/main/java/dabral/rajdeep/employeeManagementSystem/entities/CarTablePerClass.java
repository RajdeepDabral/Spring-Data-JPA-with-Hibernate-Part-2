package dabral.rajdeep.employeeManagementSystem.entities;


import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "carTablePerClass")
public class CarTablePerClass extends TravelTablePerClass {
    private String carId;

    public CarTablePerClass(String personId, String personName, String carId){
        super(personId, personName);
        this.carId=carId;
    }
    public CarTablePerClass(){
        super("","");
    }

    public String getCarId() {
        return carId;
    }
    public void setCarId(String carId) {
        this.carId = carId;
    }
}
