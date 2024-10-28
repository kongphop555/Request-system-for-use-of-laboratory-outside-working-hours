package th.mfu.mfu.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.GenerationType;

@Entity
@Table
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long User_id;

    @Column(name = "user_name", nullable = false)
    private String User_name;

    private String User_mail;
    private String User_phone;

    @ManyToOne
    @JoinColumn(name = "Division_id", referencedColumnName = "Division_id")
    private Division division;

    //บอกว่า ตัวแปรนี้มีค่าเป็น enum (enum คือ ข้อมูลพิเศษที่ใช้สำหรับกำหนดกลุ่มของตัวแปร) เช่นตอนใช้จริง 
    // Order order = new Order(Status.ACTIVE);  // ตั้งค่า status เป็น ACTIVE
    // System.out.println(order.getStatus());    // OUTPUT: ACTIVE
    @Enumerated(EnumType.STRING)
    @Column(name = "usertype", nullable = false)
    private User_type usertype;

    public enum User_type{
        STUDENT, STAFF, TEACHER, HEAD_DEPARTMENT, DIRECTOR
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public User_type getUsertype() {
        return usertype;
    }

    public void setUsertype(User_type usertype) {
        this.usertype = usertype;
    }

    public Long getUser_id() {
        return User_id;
    }

    public void setUser_id(Long user_id) {
        User_id = user_id;
    }

    public String getUser_name() {
        return User_name;
    }

    public void setUser_name(String user_name) {
        User_name = user_name;
    }

    public String getUser_mail() {
        return User_mail;
    }

    public void setUser_mail(String user_mail) {
        User_mail = user_mail;
    }

    public String getUser_phone() {
        return User_phone;
    }

    public void setUser_phone(String user_phone) {
        User_phone = user_phone;
    }

}
