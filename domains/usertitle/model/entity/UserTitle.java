package vn.fis.spro.customer.domains.usertitle.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "user_title", schema = "customer")
public class UserTitle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "chart_node_id", nullable = false)
    private Long chartNodeId;

    @NotNull
    @Column(name = "user_info_id", nullable = false)
    private Long userInfoId;

    @Size(max = 50)
    @Column(name = "position_code", length = 50)
    private String positionCode;

    @Size(max = 200)
    @Column(name = "position_name", length = 200)
    private String positionName;

    @Size(max = 50)
    @Column(name = "title_code", length = 50)
    private String titleCode;

    @Size(max = 200)
    @Column(name = "title_name", length = 200)
    private String titleName;

    @Size(max = 10)
    @Column(name = "manager_level", length = 10)
    private String managerLevel;

    @Column(name = "concurrently")
    private Boolean concurrently;

    @Column(name = "concurrently_begin_date")
    private LocalDate concurrentlyBeginDate;

    @Column(name = "concurrently_end_date")
    private LocalDate concurrentlyEndDate;

    @Column(name = "secretary_begin_date")
    private LocalDate secretaryBeginDate;

    @Column(name = "secretary_end_date")
    private LocalDate secretaryEndDate;

    @Column(name = "status_secretary")
    private Long statusSecretary;

    @Column(name = "created_time")
    private Instant createdTime;

    @Column(name = "updated_time")
    private Instant updatedTime;

}