package dabral.rajdeep.employeeManagementSystem.entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "travelJoined")
public abstract class TravelJoined {
    @Id
    private String personId;
    private String personName;

    public TravelJoined(String personId, String personName) {
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
