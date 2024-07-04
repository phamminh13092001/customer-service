package vn.fis.spro.customer.domains.approvedbudget.service.impl;


import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import vn.fis.spro.customer.domains.approvedbudget.service.ApprovedBudgetService;

@Service
@Slf4j
@Transactional
@EnableScheduling
public class ApprovedBudgetServiceImpl implements ApprovedBudgetService {

    @Override
    public void getAllSystemGroup() {

    }
}
