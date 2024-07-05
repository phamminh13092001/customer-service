package vn.fis.spro.customer.domains.chart.service.impl;

import org.springframework.stereotype.Service;
import vn.fis.spro.common.model.request.BaseFilterDto;
import vn.fis.spro.common.model.request.ChartRequest;
import vn.fis.spro.customer.domains.chart.model.request.LoadChartFilterRequest;
import vn.fis.spro.customer.domains.chart.service.ChartService;

import java.util.List;
import java.util.Map;

@Service
public class ChartServiceImpl implements ChartService {
    @Override
    public void getChartActiveByAccount(String email) {

    }

    @Override
    public void getUserByEmail(ChartRequest chartRequest) {

    }

    @Override
    public void loadChartFilter(LoadChartFilterRequest request) {

    }

    @Override
    public void findCompanyCodeByUsername(String username) {

    }

    @Override
    public void findChartAndChartNodeCreateTicket(Map<String, Object> params) {

    }

    @Override
    public void getAllChartActive() {

    }

    @Override
    public void getCompanyCodeAndNameByUsername(String username) {

    }

    @Override
    public void getCompanyCodeAndNameByUsernames(List<String> usernames) {

    }

    @Override
    public void getAllSystemGroup(BaseFilterDto req) {

    }
}
