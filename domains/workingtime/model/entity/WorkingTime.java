package vn.fis.spro.customer.domains.workingtime.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "working_time", schema = "customer")
public class WorkingTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 100)
    @Column(name = "name", length = 100)
    private String name;

    @Size(max = 45)
    @Column(name = "work_schedule_code", length = 45)
    private String workScheduleCode;

    @Size(max = 200)
    @Column(name = "description", length = 200)
    private String description;

    @Size(max = 100)
    @Column(name = "timezone", length = 100)
    private String timezone;

    @Size(max = 20)
    @Column(name = "start_time", length = 20)
    private String startTime;

    @Size(max = 100)
    @Column(name = "saturday_working", length = 100)
    private String saturdayWorking;

    @Size(max = 100)
    @Column(name = "sunday_working", length = 100)
    private String sundayWorking;

    @Column(name = "morning_working")
    private Double morningWorking;

    @Column(name = "lunch_break")
    private Double lunchBreak;

    @Column(name = "afternoon_working")
    private Double afternoonWorking;

    @Size(max = 1000)
    @Column(name = "vacation", length = 1000)
    private String vacation;

    @Column(name = "created_date")
    private Instant createdDate;

    @Size(max = 100)
    @Column(name = "created_user", length = 100)
    private String createdUser;

    @Column(name = "modified_date")
    private LocalDate modifiedDate;

    @Size(max = 50)
    @Column(name = "modified_user", length = 50)
    private String modifiedUser;

    @Size(max = 1000)
    @Column(name = "share_with", length = 1000)
    private String shareWith;

    @Size(max = 200)
    @Column(name = "company_code", length = 200)
    private String companyCode;

    @Size(max = 200)
    @Column(name = "company_name", length = 200)
    private String companyName;

}