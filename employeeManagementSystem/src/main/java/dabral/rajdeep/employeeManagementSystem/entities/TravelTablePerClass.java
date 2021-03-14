package dabral.rajdeep.employeeManagementSystem.entities;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class TravelTablePerClass {
    @Id
    private String personId;
    private String personName;

    public TravelTablePerClass(String personId, String personName) {
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
