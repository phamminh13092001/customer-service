package vn.fis.spro.customer.domains.userinfo.model.entity;

import lombok.Data;
import lombok.ToString;
import vn.fis.spro.common.util.JSONObjectConverter;
import vn.fis.spro.customer.domains.usertitle.model.entity.UserTitle;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Entity
@Table(name = "user_info")
@Data
public class UserInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "location_id", nullable = true)
    private Long locationId;

    @Column(name = "staff_code", nullable = true)
    private String staffCode;

    @Column(name = "firstname", nullable = true)
    private String firstname;

    @Column(name = "lastname", nullable = true)
    private String lastname;

    @Column(name = "email", nullable = true)
    private String email;

    @Column(name = "phone", nullable = true)
    private String phone;

    /**
     * active, inactive
     */
    @Column(name = "status", nullable = true)
    private String status;

    /**
     * done, notyet
     */
    @Column(name = "handover_status", nullable = true)
    private String handoverStatus;

    @Column(name = "available")
    private Boolean available;

    @Column(columnDefinition = "json")
    @Convert(converter = JSONObjectConverter.class)
    private Map<String, Object> addition;

    @Column(name = "direct_manager", nullable = true)
    private String directManager;

    @Column(name = "vice_manager", nullable = true)
    private String viceManager;

    @Column(name = "id_card_no", nullable = true)
    private String idCardNo;

    @Column(name = "id_card_issued_date", nullable = true)
    private Date idCardIssuedDate;
    @Column(name = "id_card_issuer", nullable = true)
    private String idCardIssuer;

    @Column(name = "description", nullable = true)
    private String description;

    @Column(name = "created_user", nullable = true)
    private String createdUser;

    @Column(name = "created_date", nullable = true)
    private LocalDate createdDate;

    @Column(name = "modified_date", nullable = true)
    private LocalDate modifiedDate;

    @Column(name = "modified_user", nullable = true)
    private String modifiedUser;

    @Column(name = "has_secretary", nullable = true)
    private Integer hasSecretary;

    @Column(name = "assignment")
    private Boolean assignment;

    @Column(name = "working_type")
    private String workingType;

    @Column(name = "multi_chart_approval")
    private Boolean multiChartApproval;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_info_id", nullable = true)
    @ToString.Exclude
    private List<UserTitle> userTitles;
//
//    @OneToMany(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_info_id", nullable = true)
//    @ToString.Exclude
//    private List<Account> accountInfo;
//
//    @OneToMany(mappedBy = "userInfo", fetch = FetchType.LAZY)
//    @JsonIgnore
//    private Set<CustomFlowUser> customFlowUsers;

    @PrePersist
    private void prePersist() {
        setCreatedDate(LocalDate.now());
        setModifiedDate(LocalDate.now());
    }

    @PreUpdate
    private void preUpdate() {
        setModifiedDate(LocalDate.now());
    }

}