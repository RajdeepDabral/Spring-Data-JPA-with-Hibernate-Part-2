package dabral.rajdeep.employeeManagementSystem.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;


@Entity
@DiscriminatorValue("bike")
public class BikeSingleTableStructureChild extends TravelSingleTableStructureParent{
    private String bikeId;
    public BikeSingleTableStructureChild(String personId, String personName, String bikeId){
        super(personId,personName);
        this.bikeId=bikeId;
    }
    public BikeSingleTableStructureChild(){
        super("","");
    }
    public String getBikeId() {
        return bikeId;
    }
    public void setBikeId(String bikeId) {
        this.bikeId = bikeId;
    }
}
