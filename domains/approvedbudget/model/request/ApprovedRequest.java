package vn.fis.spro.customer.domains.approvedbudget.model.request;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
public class ApprovedRequest {
    private Long id;
    private Integer type;
    private List<Long> chartId;
    private List<Long> chartNodeId;
    private Integer level;
    private String name;
    private String position;
    private String title;
    private List<String> username;
    private List<Long> serviceId;
    private BigDecimal budgetFrom;
    private BigDecimal budgetTo;
    private String effectiveDate;
    private String expiredDate;
    private List<String> applyFor;
    private String approvedBudgetName;
}
