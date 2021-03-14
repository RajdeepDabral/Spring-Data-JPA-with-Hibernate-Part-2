package dabral.rajdeep.employeeManagementSystem.entities;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;



@Entity
@Table(name = "bikeJoined")
@PrimaryKeyJoinColumn(name = "personId")
public class BikeJoined extends TravelJoined{
    private String bikeId;
    public BikeJoined(String personId, String personName, String bikeId){
        super(personId,personName);
        this.bikeId=bikeId;
    }
    public BikeJoined(){
        super("","");
    }
    public String getBikeId() {
        return bikeId;
    }
    public void setBikeId(String bikeId) {
        this.bikeId = bikeId;
    }
}
