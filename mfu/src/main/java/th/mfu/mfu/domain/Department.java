package th.mfu.mfu.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DEPARTMENT")
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Department_id;
    
    private String Department_name;
    
    
    public Long getDepartment_id() {
        return Department_id;
    }

    public void setDepartment_id(Long department_id) {
        Department_id = department_id;
    }

    public String getDepartment_name() {
        return Department_name;
    }

    public void setDepartment_name(String department_name) {
        Department_name = department_name;
    }

}
