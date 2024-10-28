package th.mfu.mfu.domain;

import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "BOOKINGDATA")
public class BookingData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long refid;

    private String datereq;
    private String datestart;
    private String dateend;
    private String timestart;
    private String timeend;
    private int Approve_Teacher_id;
    private int Approve_department_id;
    private int Approve_Director_id;
    private String ApproveDate_Teacher;
    private String ApproveDate_department;
    private String ApproveDate_Director;
    
    @Enumerated(EnumType.STRING)
    private Status Bookingstatus;
    
    private String Reason; 
    
    private enum Status{
        APPROVED,
        DENIED,
        IN_PROCESS
    }

    @ManyToOne
    @JoinColumn(name = "User_id",referencedColumnName = "User_id")
    private Users users;

    @ManyToOne
    @JoinColumn(name = "Room_id",referencedColumnName = "Room_id")
    private Room room;
   
    

    public Status getBookingstatus() {
        return Bookingstatus;
    }
    public void setBookingstatus(Status statuss) {
        this.Bookingstatus = statuss;
    }
    public Users getUsers() {
        return users;
    }
    public void setUsers(Users users) {
        this.users = users;
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    public Long getRefid() {
        return refid;
    }
    public void setRefid(Long ref_id) {
        refid = ref_id;
    }
    public String getDatereq() {
        return datereq;
    }
    public void setDatereq(String dateReq) {
        this.datereq = dateReq;
    }
    public String getDatestart() {
        return datestart;
    }
    public void setDatestart(String datestart) {
        this.datestart = datestart;
    }
    public String getDateend() {
        return dateend;
    }
    public void setDateend(String dateend) {
        this.dateend = dateend;
    }
    public String getTimestart() {
        return timestart;
    }
    public void setTimestart(String timestart) {
        this.timestart = timestart;
    }
    public String getTimeend() {
        return timeend;
    }
    public void setTimeend(String timeend) {
        this.timeend = timeend;
    }
    public int getApprove_Teacher_id() {
        return Approve_Teacher_id;
    }
    public void setApprove_Teacher_id(int approve_Teacher_id) {
        Approve_Teacher_id = approve_Teacher_id;
    }
    public int getApprove_department_id() {
        return Approve_department_id;
    }
    public void setApprove_department_id(int approve_department_id) {
        Approve_department_id = approve_department_id;
    }
    public int getApprove_Director_id() {
        return Approve_Director_id;
    }
    public void setApprove_Director_id(int approve_Director_id) {
        Approve_Director_id = approve_Director_id;
    }
    public String getApproveDate_Teacher() {
        return ApproveDate_Teacher;
    }
    public void setApproveDate_Teacher(String approveDate_Teacher) {
        ApproveDate_Teacher = approveDate_Teacher;
    }
    public String getApproveDate_department() {
        return ApproveDate_department;
    }
    public void setApproveDate_department(String approveDate_department) {
        ApproveDate_department = approveDate_department;
    }
    public String getApproveDate_Director() {
        return ApproveDate_Director;
    }
    public void setApproveDate_Director(String approveDate_Director) {
        ApproveDate_Director = approveDate_Director;
    }
    public String getReason() {
        return Reason;
    }
    public void setReason(String reason) {
        Reason = reason;
    }

    
}
