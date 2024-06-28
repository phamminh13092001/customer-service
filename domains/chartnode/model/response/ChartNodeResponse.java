package vn.fis.spro.customer.domains.chartnode.model.response;

import lombok.Data;
import vn.fis.spro.customer.domains.userinfo.model.response.UserInfoResponse;

import java.util.List;
import java.util.Map;

@Data
public class ChartNodeResponse {
    private Long id;
    private Long nodeId;
    private String image;
    private String role;
    private String roleColor;
    private String avatar;
    private List<UserInfoResponse> name;
    private Integer roleType;
    private Long rootParent;
    private Long parent;
    private UserInfoResponse manager;
    private String title;
    private Integer level;
    private String description;
    private Integer index;
    private String departmentDisplay;
    private Long departmentId;
    private String locationDisplay;
    private Long locationId;
    private Long managerId;
    private List<Map<String, Object>> listAdditional;
    private List<Map<String, Object>> listLocationInfo;
    private Boolean applyRoleColorBelow;
    private String managerDisplay;
    private Map<String, String> styles;
    private Long parentChart;
    private Long totalStaff;
    private Long totalDepartment;


}
