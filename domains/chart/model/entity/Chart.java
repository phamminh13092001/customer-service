package vn.fis.spro.customer.domains.chart.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "chart", schema = "customer")
public class Chart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 255)
    @NotNull
    @Column(name = "code", nullable = false)
    private String code;

    @Size(max = 10)
    @Column(name = "company_code", length = 10)
    private String companyCode;

    @Size(max = 100)
    @Column(name = "name", length = 100)
    private String name;

    @Size(max = 100)
    @Column(name = "short_name", length = 100)
    private String shortName;

    @Size(max = 10)
    @Column(name = "type", length = 10)
    private String type;

    @Size(max = 200)
    @Column(name = "description", length = 200)
    private String description;

    @Size(max = 30)
    @Column(name = "status", length = 30)
    private String status;

    @Column(name = "user_total")
    private Integer userTotal;

    @Column(name = "link_total")
    private Integer linkTotal;

    @Size(max = 10)
    @Column(name = "version", length = 10)
    private String version;

    @Size(max = 100)
    @Column(name = "error_message", length = 100)
    private String errorMessage;

    @Column(name = "created_date")
    private Instant createdDate;

    @Size(max = 50)
    @Column(name = "created_user", length = 50)
    private String createdUser;

    @Column(name = "modified_date")
    private Instant modifiedDate;

    @Size(max = 50)
    @Column(name = "modified_user", length = 50)
    private String modifiedUser;

    @Size(max = 50)
    @Column(name = "parent_company_code", length = 50)
    private String parentCompanyCode;

}