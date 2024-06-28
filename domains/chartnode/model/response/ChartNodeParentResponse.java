package vn.fis.spro.customer.domains.chartnode.model.response;

import lombok.Data;

@Data
public class ChartNodeParentResponse {

    private String id;
    private String code;
    private String name;
    private String level;
    private String nodeParentId;
}
