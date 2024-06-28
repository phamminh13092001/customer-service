package vn.fis.spro.customer.domains.chartnode.model.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties
public class ChartNodeDtoRequest {
    List<String> lstCodes;
    List<Long> lstIds;
    List<Long> lstNodeIds;
    Boolean isGetChildren;
}
