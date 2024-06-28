package vn.fis.spro.customer.domains.chartnode.model.request;

import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class ChartNodeRequest{
    private String image;
    private String role;
    private String roleColor;
    private String avatar;
//    private List<AssignedInfoRequest> name;
    private Integer roleType;
    private Long rootParent;
    private Long parentChart;
    private Long parent;
    private Long chartId;
    private List<Map<String, Object>> listAdditional;
    private Boolean isAvatar;
    private Boolean isShowName;
    private Boolean applyRoleColorBelow;
    private Long manager;
    private Integer level;
    private String chartName;
    private Long nodeId;
    private String searchKey;
    private List<Map<String, Object>> listChange;
    private String description;
    private Integer indexes;
    private String user;
    private Long location;
    private String email;
    private List<String> listUId;
    private Map<String, String> styles;
    private String address;
    private Long department;
    private String oldParentName;
    private String oldDepartmentName;
    private String oldLocationName;

}
