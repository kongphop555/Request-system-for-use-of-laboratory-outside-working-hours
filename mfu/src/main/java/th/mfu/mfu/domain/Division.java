package th.mfu.mfu.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "DIVISION")
public class Division {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Division_id;
    private String Division_name;

    public Long getDivision_id() {
        return Division_id;
    }

    public void setDivision_id(Long division_id) {
        Division_id = division_id;
    }

    public String getDivision_name() {
        return Division_name;
    }

    public void setDivision_name(String division_name) {
        Division_name = division_name;
    }
}
