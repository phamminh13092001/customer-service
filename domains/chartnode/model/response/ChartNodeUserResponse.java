package vn.fis.spro.customer.domains.chartnode.model.response;

import lombok.Data;

@Data
public class ChartNodeUserResponse {

    private Long id;
    private String userId;
    private String email;
    private String firstname;
    private String lastname;
    private String username;
    private String title;
    private Long chartId;
    private Long nodeId;
    private Long departmentId;
    private String departmentDisplay;
    private Long locationId;
    private Long managerId;
    private String avatar;
    private Integer totalItem;
    private Integer roleType;
}
