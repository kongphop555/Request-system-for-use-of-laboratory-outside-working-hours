package th.mfu.mfu.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name ="BUILD")
public class Build {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Build_id;
    private String Build_name;


    public int getBuild_id() {
        return Build_id;
    }
    public void setBuild_id(int build_id) {
        Build_id = build_id;
    }
    public String getBuila_name() {
        return Build_name;
    }
    public void setBuila_name(String buila_name) {
        Build_name = buila_name;
    }
    
}
