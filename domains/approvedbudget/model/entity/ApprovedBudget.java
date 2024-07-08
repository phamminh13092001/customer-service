package vn.fis.spro.customer.domains.approvedbudget.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "approved_budget", schema = "customer")
public class ApprovedBudget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 200)
    @Column(name = "approved_budget_name", length = 200)
    private String approvedBudgetName;

    @Column(name = "level")
    private Integer level;

    @Column(name = "type")
    private Integer type;

    @Size(max = 50)
    @Column(name = "position", length = 50)
    private String position;

    @Size(max = 50)
    @Column(name = "title", length = 50)
    private String title;

    @Size(max = 50)
    @Column(name = "username", length = 50)
    private String username;

    @Column(name = "budget_from", precision = 20)
    private BigDecimal budgetFrom;

    @Column(name = "budget_to", precision = 20)
    private BigDecimal budgetTo;

    @Column(name = "effective_date")
    private LocalDate effectiveDate;

    @Column(name = "expired_date")
    private LocalDate expiredDate;

    @Column(name = "created_date")
    private Instant createdDate;

    @Size(max = 45)
    @Column(name = "created_user", length = 45)
    private String createdUser;

    @Column(name = "modified_date")
    private Instant modifiedDate;

    @Size(max = 45)
    @Column(name = "modified_user", length = 45)
    private String modifiedUser;

    @Column(name = "status")
    private Byte status;

}