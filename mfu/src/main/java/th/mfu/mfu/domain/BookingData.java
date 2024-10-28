package th.mfu.mfu.domain;

import java.time.LocalTime;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "BOOKINGDATA")
public class BookingData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Ref_id;

    @Temporal(TemporalType.DATE)
    private Date dateReq;
    @Temporal(TemporalType.DATE)
    private Date datestart;
    @Temporal(TemporalType.DATE)
    private Date dateend;

    private LocalTime timestart;
    private LocalTime timeend;
    private int Approve_Teacher_id;
    private int Approve_department_id;
    private int Approve_Director_id;
    private Date ApproveDate_Teacher;
    private Date ApproveDate_department;
    private Date ApproveDate_Director;
    private String Reason;


    
    public Long getRef_id() {
        return Ref_id;
    }
    public void setRef_id(Long ref_id) {
        Ref_id = ref_id;
    }
    public Date getDateReq() {
        return dateReq;
    }
    public void setDateReq(Date dateReq) {
        this.dateReq = dateReq;
    }
    public Date getDatestart() {
        return datestart;
    }
    public void setDatestart(Date datestart) {
        this.datestart = datestart;
    }
    public Date getDateend() {
        return dateend;
    }
    public void setDateend(Date dateend) {
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
    public Date getApproveDate_Teacher() {
        return ApproveDate_Teacher;
    }
    public void setApproveDate_Teacher(Date approveDate_Teacher) {
        ApproveDate_Teacher = approveDate_Teacher;
    }
    public Date getApproveDate_department() {
        return ApproveDate_department;
    }
    public void setApproveDate_department(Date approveDate_department) {
        ApproveDate_department = approveDate_department;
    }
    public Date getApproveDate_Director() {
        return ApproveDate_Director;
    }
    public void setApproveDate_Director(Date approveDate_Director) {
        ApproveDate_Director = approveDate_Director;
    }
    public String getReason() {
        return Reason;
    }
    public void setReason(String reason) {
        Reason = reason;
    }

    
}
