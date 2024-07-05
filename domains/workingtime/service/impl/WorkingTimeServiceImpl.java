package vn.fis.spro.customer.domains.workingtime.service.impl;

import org.springframework.stereotype.Service;
import vn.fis.spro.customer.domains.workingtime.model.request.ListTimeExpectRequest;
import vn.fis.spro.customer.domains.workingtime.service.WorkingTimeService;

import java.util.List;

@Service
public class WorkingTimeServiceImpl implements WorkingTimeService {

    @Override
    public void getListTime(List<ListTimeExpectRequest> listTimeExpectRequests) {

    }

    @Override
    public void caculTime(Long startDateTicket, long timeRes, String emailAssignee) {

    }

    @Override
    public void getListTimeExpect(List<ListTimeExpectRequest> listTimeExpectRequests) {

    }
}
