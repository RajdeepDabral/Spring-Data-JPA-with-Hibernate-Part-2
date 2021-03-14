package dabral.rajdeep.employeeManagementSystem.entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name ="travelMode" ,discriminatorType = DiscriminatorType.STRING)
@Table(name = "travelSingleTableStructure")
public abstract class TravelSingleTableStructureParent {
    @Id
    private String personId;
    private String personName;

    public TravelSingleTableStructureParent(String personId, String personName) {
        this.personId = personId;
        this.personName = personName;

    }

    public String getPersonId() {
        return personId;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
    }
    public String getPersonName() {
        return personName;
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
}
