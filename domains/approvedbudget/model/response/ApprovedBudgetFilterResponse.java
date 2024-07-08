package vn.fis.spro.customer.domains.approvedbudget.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Data
public class ApprovedBudgetFilterResponse {
    private Long id;
    private String approvedBudgetName;
    private Integer level;
    private Integer type;
    private String position;
    private String title;
    private String username;
    private BigDecimal budgetFrom;
    private BigDecimal budgetTo;
    private LocalDate effectiveDate;
    private LocalDate expiredDate;
    private Instant createdDate;
    private String createdUser;
    private Instant modifiedDate;
    private String modifiedUser;
    private Byte status;

}
