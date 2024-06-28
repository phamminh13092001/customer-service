package vn.fis.spro.customer.domains.chartnode.model.response;

import lombok.Data;

@Data
public class ChartNodeLinkResponse {
    private Long chartId;
    private Long chartLinkId;
    private Long nodeLinkId;
    private Integer level;
    private String code;
    private String name;

    private Long id;
}
