package vn.fis.spro.customer.domains.chart.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;
import vn.fis.spro.customer.domains.chartnode.model.ChartNode;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "chart")
public class Chart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "code", nullable = true)
    private String code;

    @Column(name = "company_code", nullable = true)
    private String companyCode;

    @Column(name = "name", nullable = true)
    private String name;

    @Column(name = "short_name", nullable = true)
    private String shortName;

    @Column(name = "type", nullable = true)
    private String type;

    @Column(name = "description", nullable = true)
    private String description;

    /**
     * active, inactive, processing, error
     */
    @Column(name = "status", nullable = true)
    private String status;

    @Column(name = "user_total", nullable = true)
    private Integer userTotal;

    @Column(name = "link_total", nullable = true)
    private Integer linkTotal;

    @Column(name = "version", nullable = true)
    private String version;

    @Column(name = "error_message", nullable = true)
    private String errorMessage;

    @Column(name = "created_date", nullable = true)
    private LocalDateTime createdDate;

    @Column(name = "created_user", nullable = true)
    private String createdUser;

    @Column(name = "modified_date", nullable = true)
    private LocalDateTime modifiedDate;

    @Column(name = "modified_user", nullable = true)
    private String modifiedUser;

    @Column(name = "parent_company_code", nullable = true)
    private String parentCompanyCode;

//   parentCompanyCode @OneToMany(mappedBy = "chart", fetch = FetchType.LAZY)
//    private List<ChartSharedUser> chartSharedUsers;

    @OneToMany(mappedBy = "chart", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ChartNode> chartNodes = new ArrayList<>();

    @PrePersist
    private void prePersist() {
        setCreatedDate(LocalDateTime.now());
        setModifiedDate(LocalDateTime.now());
    }

    @PreUpdate
    private void preUpdate() {
        setModifiedDate(LocalDateTime.now());
    }
}