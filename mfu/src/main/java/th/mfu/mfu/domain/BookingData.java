package th.mfu.mfu.domain;

import java.time.LocalTime;
import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "BOOKINGDATA")
public class BookingData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long refid;

    private LocalDate datereq;
    private LocalDate datestart;
    private LocalDate dateend;


    private LocalTime timestart;
    private LocalTime timeend;


    private int Approve_Teacher_id;
    private int Approve_department_id;
    private int Approve_Director_id;


    private LocalDate Approve_Date_Teacher;
    private LocalDate Approve_Date_Department;
    private LocalDate Approve_Date_Director;
    
    @Enumerated(EnumType.STRING)
    private Status Bookingstatus;
    
    private String Reason; 
    
    private enum Status{
        APPROVED,
        DENIED,
        IN_PROCESS
    }

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "User_id",referencedColumnName = "User_id")
    private Users users_id;

    @ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "Room_id",referencedColumnName = "Room_id")
    private Room room_id;

    public Long getRefid() {
        return refid;
    }

    public void setRefid(Long refid) {
        this.refid = refid;
    }

    public LocalDate getDatereq() {
        return datereq;
    }

    public void setDatereq(LocalDate datereq) {
        this.datereq = datereq;
    }

    public LocalDate getDatestart() {
        return datestart;
    }

    public void setDatestart(LocalDate datestart) {
        this.datestart = datestart;
    }

    public LocalDate getDateend() {
        return dateend;
    }

    public void setDateend(LocalDate dateend) {
        this.dateend = dateend;
    }

    public LocalTime getTimestart() {
        return timestart;
    }

    public void setTimestart(LocalTime timestart) {
        this.timestart = timestart;
    }

    public LocalTime getTimeend() {
        return timeend;
    }

    public void setTimeend(LocalTime timeend) {
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

    public LocalDate getApprove_Date_Teacher() {
        return Approve_Date_Teacher;
    }

    public void setApprove_Date_Teacher(LocalDate approveDate_Teacher) {
        Approve_Date_Teacher = approveDate_Teacher;
    }

    public LocalDate getApprove_Date_Department() {
        return Approve_Date_Department;
    }

    public void setApprove_Date_Department(LocalDate approveDate_department) {
        Approve_Date_Department = approveDate_department;
    }

    public LocalDate getApprove_Date_Director() {
        return Approve_Date_Director;
    }

    public void setApprove_Date_Director(LocalDate approveDate_Director) {
        Approve_Date_Director = approveDate_Director;
    }

    public Status getBookingstatus() {
        return Bookingstatus;
    }

    public void setBookingstatus(Status bookingstatus) {
        Bookingstatus = bookingstatus;
    }

    public String getReason() {
        return Reason;
    }

    public void setReason(String reason) {
        Reason = reason;
    }

    public Users getUsers() {
        return users_id;
    }

    public void setUsers(Users users) {
        this.users_id = users;
    }

    public Room getRoom() {
        return room_id;
    }

    public void setRoom(Room room) {
        this.room_id = room;
    }
   
    

}
