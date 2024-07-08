package vn.fis.spro.customer.domains.userinfo.service.impl;

import org.springframework.stereotype.Service;
import vn.fis.spro.common.model.request.ChartRequest;
import vn.fis.spro.customer.domains.chartnode.model.request.ChartNodeDtoRequest;
import vn.fis.spro.customer.domains.userinfo.model.request.NotifyUserRequest;
import vn.fis.spro.customer.domains.userinfo.model.response.ListShareWithResponse;
import vn.fis.spro.customer.domains.userinfo.service.UserInfoService;

@Service
public class UserInfoImplement implements UserInfoService {

    @Override
    public void getUserByUsername(String username) {

    }

    @Override
    public void getEmailByUsername(String username) {

    }

    @Override
    public void getUserInfoByEmails(NotifyUserRequest request) {

    }

    @Override
    public void getUserInfoByUserNames(NotifyUserRequest request) {

    }

    @Override
    public void getUserTaskInfoByUserNames(NotifyUserRequest request) {

    }

    @Override
    public void getUserInfoByChartIdAndCharNodeIds(ChartNodeDtoRequest request) {

    }

    @Override
    public void checkStartPhase(String procDefId, String taskDefKey, String token) {

    }

    @Override
    public void getAutoAssign(String value, String token) {

    }

    @Override
    public void getUserEmailByTenant() {

    }

    @Override
    public void getAllAccount() {

    }

    @Override
    public void getAssistantByChartNode(String email, String createUser) {

    }

    @Override
    public void getLocationIdByUserName(String userName) {

    }

    @Override
    public void getUserMyReportByChartNode(MyReportByChartNodeRequest myReportByChartNodeRequest) {

    }

    @Override
    public void getUsernameByChartNode(Long chartNodeId, String chartNodeCode, String chartNodeName, String type) {

    }

    @Override
    public void listShareWith(ListShareWithResponse listShareWithResponse) {

    }

    @Override
    public void updateListUser(ListUpdateWorkingType data, String uuid) {

    }

    @Override
    public void getUserByUserName(String username) {

    }

    @Override
    public void getInfoAssignee(String username) {

    }

    @Override
    public void getUserDefault(UserInfoDto userInfoDto) {

    }

    @Override
    public void getUserDefaultByChart(String username, String status) {

    }

    @Override
    public void getChartNodeByListUser(String authorizationHeader, Long chartId, String status) {

    }

    @Override
    public void getChartNodeByUser(ChartRequest request, String authorizationHeader, String status) {

    }

    @Override
    public void getListUsernameActive(NotifyUserRequest request) {

    }

    @Override
    public void getInfoAssigneeByListUser(ChartRequest request) {

    }

    @Override
    public void getInfoByListUser(ChartRequest request) {

    }
}
