package vn.fis.spro.customer.domains.mongo;

import lombok.Data;

import java.util.List;

@Data
public class WorkingTimeSyncRequest {
    private List<WorkingTimeRequest> data;
}
