package dabral.rajdeep.employeeManagementSystem.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "carJoined")
@PrimaryKeyJoinColumn(name = "personId")
public class CarJoined extends TravelJoined {
    private String carId;

    public CarJoined(String personId, String personName, String carId){
        super(personId, personName);
        this.carId=carId;
    }
    public CarJoined(){
        super("","");
    }

    public String getCarId() {
        return carId;
    }
    public void setCarId(String carId) {
        this.carId = carId;
    }
}