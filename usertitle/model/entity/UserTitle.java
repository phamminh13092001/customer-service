package vn.fis.spro.customer.domains.usertitle.model.entity;

import lombok.Data;
import lombok.ToString;
import vn.fis.spro.customer.domains.chartnode.model.entity.ChartNode;
import vn.fis.spro.customer.domains.userinfo.model.entity.UserInfo;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "user_title")
public class UserTitle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "position_code", nullable = true)
    private String positionCode;

    @Column(name = "position_name", nullable = true)
    private String positionName;

    @Column(name = "title_code", nullable = true)
    private String titleCode;

    @Column(name = "title_name", nullable = true)
    private String titleName;


    @Column(name = "manager_level", nullable = true)
    private String managerLevel;

    @Column(name = "concurrently", nullable = true)
    private Integer concurrently;

    @Column(name = "concurrently_begin_date", nullable = true)
    private LocalDate concurrentlyBeginDate;

    @Column(name = "concurrently_end_date", nullable = true)
    private LocalDate concurrentlyEndDate;
    @Column(name = "secretary_begin_date", nullable = true)
    private LocalDate secretaryBeginDate;

    @Column(name = "secretary_end_date", nullable = true)
    private LocalDate secretaryEndDate;

    @Column(name = "status_secretary")
    private Boolean statusSecretary;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "chart_node_id", nullable = false)
    @ToString.Exclude
    private ChartNode chartNode;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_info_id", nullable = false)
    @ToString.Exclude
    private UserInfo userInfo;

}