package th.mfu.mfu.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ROOM")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Room_id;

    @OneToMany
    @JoinColumn(name = "Department_id", referencedColumnName = "Department_id")
    private Department department;

    @OneToMany
    @JoinColumn(name = "Build_id", referencedColumnName = "Build_id")
    private Build build;

    
}
