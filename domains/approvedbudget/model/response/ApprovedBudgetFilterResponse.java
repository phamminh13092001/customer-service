package vn.fis.spro.customer.domains.approvedbudget.model.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ApprovedBudgetFilterResponse {
    private String username;
    private Long chartId;
    private Long chartNodeId;
    private String position;
    private String jobTitle;
    private String chartName;
    private String chartNodeName;
    private String firstname;
    private String lastname;
    private String titleName;
}
