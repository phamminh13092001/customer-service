package vn.fis.spro.customer.domains.approvedbudget.model.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "approved_budget")
@Data
public class ApprovedBudget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

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
    private LocalDateTime createDate;

    @Column(name = "created_user")
    private String createUser;

    @Column(name = "modified_date")
    private LocalDateTime modifiedDate;

    @Column(name = "modified_user")
    private String modifiedUser;

    @Column(name = "status")
    private Integer status;

    @Column(name = "approved_budget_name", length = 50)
    private String approvedBudgetName;

}