package vn.fis.spro.customer.domains.userinfo.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "user_info", schema = "customer")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "location_id")
    private Long locationId;

    @Column(name = "has_secretary")
    private Byte hasSecretary;

    @Size(max = 15)
    @Column(name = "staff_code", length = 15)
    private String staffCode;

    @Size(max = 50)
    @Column(name = "firstname", length = 50)
    private String firstname;

    @Size(max = 50)
    @Column(name = "lastname", length = 50)
    private String lastname;

    @Size(max = 100)
    @Column(name = "email", length = 100)
    private String email;

    @Size(max = 15)
    @Column(name = "phone", length = 15)
    private String phone;

    @Size(max = 30)
    @Column(name = "status", length = 30)
    private String status;

    @Size(max = 10)
    @Column(name = "handover_status", length = 10)
    private String handoverStatus;

    @Column(name = "available")
    private Boolean available;

    @Lob
    @Column(name = "addition")
    private String addition;

    @Size(max = 100)
    @Column(name = "direct_manager", length = 100)
    private String directManager;

    @Size(max = 100)
    @Column(name = "vice_manager", length = 100)
    private String viceManager;

    @Size(max = 45)
    @Column(name = "id_card_no", length = 45)
    private String idCardNo;

    @Column(name = "id_card_issued_date")
    private LocalDate idCardIssuedDate;

    @Size(max = 100)
    @Column(name = "id_card_issuer", length = 100)
    private String idCardIssuer;

    @Size(max = 255)
    @Column(name = "description")
    private String description;

    @Size(max = 50)
    @Column(name = "created_user", length = 50)
    private String createdUser;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Column(name = "modified_date")
    private LocalDate modifiedDate;

    @Size(max = 50)
    @Column(name = "modified_user", length = 50)
    private String modifiedUser;

    @Column(name = "assignment")
    private Boolean assignment;

    @Size(max = 10)
    @Column(name = "working_type", length = 10)
    private String workingType;

    @Column(name = "multi_chart_approval")
    private Boolean multiChartApproval;

}