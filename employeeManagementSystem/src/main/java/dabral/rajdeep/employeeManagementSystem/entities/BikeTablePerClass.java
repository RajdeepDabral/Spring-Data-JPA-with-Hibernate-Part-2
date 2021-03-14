package dabral.rajdeep.employeeManagementSystem.entities;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "bikeTablePerClass")
public class BikeTablePerClass extends TravelTablePerClass {
    private String bikeId;
    public BikeTablePerClass(String personId, String personName, String bikeId){
        super(personId,personName);
        this.bikeId=bikeId;
    }
    public BikeTablePerClass(){
        super("","");
    }
    public String getBikeId() {
        return bikeId;
    }
    public void setBikeId(String bikeId) {
        this.bikeId = bikeId;
    }
}
