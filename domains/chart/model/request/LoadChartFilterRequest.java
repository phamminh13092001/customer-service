package vn.fis.spro.customer.domains.chart.model.request;

import lombok.Data;

import java.util.List;

@Data
public class LoadChartFilterRequest {
    private List<Long> chartIdNotIn ;
    private List<String> listType ;
}
