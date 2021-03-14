package dabral.rajdeep.employeeManagementSystem.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("car")
public class CarSingleTableStructureChild extends TravelSingleTableStructureParent{
    private String carId;

    public CarSingleTableStructureChild(String personId, String personName, String carId){
        super(personId, personName);
        this.carId=carId;
    }
    public CarSingleTableStructureChild(){
        super("","");
    }

    public String getCarId() {
        return carId;
    }
    public void setCarId(String carId) {
        this.carId = carId;
    }
}
