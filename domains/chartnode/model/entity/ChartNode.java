package vn.fis.spro.customer.domains.chartnode.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "chart_node", schema = "customer")
public class ChartNode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "chart_id", nullable = false)
    private Long chartId;

    @Size(max = 255)
    @Column(name = "code")
    private String code;

    @Size(max = 200)
    @Column(name = "name", length = 200)
    private String name;

    @Column(name = "level")
    private Integer level;

    @Size(max = 30)
    @Column(name = "status", length = 30)
    private String status;

    @Column(name = "node_parent_id")
    private Long nodeParentId;

    @Size(max = 200)
    @Column(name = "description", length = 200)
    private String description;

    @Size(max = 20)
    @Column(name = "color", length = 20)
    private String color;

    @Column(name = "color_applied")
    private Boolean colorApplied;

    @Column(name = "chart_link_id")
    private Long chartLinkId;

    @Column(name = "node_link_id")
    private Long nodeLinkId;

    @Column(name = "created_date")
    private LocalDate createdDate;

    @Size(max = 50)
    @Column(name = "created_user", length = 50)
    private String createdUser;

    @Column(name = "modified_date")
    private LocalDate modifiedDate;

    @Size(max = 50)
    @Column(name = "modified_user", length = 50)
    private String modifiedUser;

    @Size(max = 45)
    @Column(name = "short_name", length = 45)
    private String shortName;

    @Size(max = 50)
    @Column(name = "cost_center", length = 50)
    private String costCenter;

    @Size(max = 50)
    @Column(name = "cost_center_name", length = 50)
    private String costCenterName;

    @Size(max = 255)
    @Column(name = "parent_code")
    private String parentCode;

}