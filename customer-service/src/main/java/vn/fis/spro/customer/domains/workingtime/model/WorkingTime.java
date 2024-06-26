package vn.fis.spro.customer.domains.workingtime.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "working_time")
public class WorkingTime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = true)
    private String name;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "timezone", nullable = true)
    private String timezone;

    @Column(name = "start_time", nullable = true)
    private String startTime;

    @Column(name = "saturday_working", nullable = true)
    private String saturdayWorking;

    @Column(name = "sunday_working", nullable = true)
    private String sundayWorking;

    @Column(name = "morning_working", nullable = true)
    private Double morningWorking;

    @Column(name = "lunch_break", nullable = true)
    private Double lunchBreak;

    @Column(name = "afternoon_working", nullable = true)
    private Double afternoonWorking;

    @Column(name = "vacation", nullable = true)
    private String vacation;

    @Column(name = "created_date", nullable = true)
    private LocalDateTime createdDate;

    @Column(name = "created_user", nullable = true)
    private String createdUser;

    @Column(name = "modified_date", nullable = true)
    private LocalDate modifiedDate;

    @Column(name = "modified_user", nullable = true)
    private String modifiedUser;

    @Column(name = "work_schedule_code", nullable = true)
    private String workScheduleCode;

    @Column(name = "share_with", nullable = true)
    private String shareWith;
    @Column(name = "company_code")
    private String companyCode;
    @Column(name = "company_name")
    private String companyName;


}
