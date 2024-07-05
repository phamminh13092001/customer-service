package vn.fis.spro.customer.domains.userinfo.service;

import vn.fis.spro.common.model.request.ChartRequest;
import vn.fis.spro.customer.domains.chartnode.model.request.ChartNodeDtoRequest;
import vn.fis.spro.customer.domains.userinfo.model.request.NotifyUserRequest;
import vn.fis.spro.customer.domains.userinfo.model.response.ListShareWithResponse;
import vn.fis.spro.customer.domains.userinfo.model.response.UserInfoResponse;

public interface UserInfoService {

    void getUserByUsername(String username);

    void getEmailByUsername(String username);

    void getUserInfoByEmails(NotifyUserRequest request);

    void getUserInfoByUserNames(NotifyUserRequest request);

    void getUserTaskInfoByUserNames(NotifyUserRequest request);

    void getUserInfoByChartIdAndCharNodeIds(ChartNodeDtoRequest request);

    void checkStartPhase(String procDefId,String taskDefKey,String token);

    void getAutoAssign(String value,String token);

    void getUserEmailByTenant();

    void getAllAccount();

    void getAssistantByChartNode(String email,String createUser);

    void getLocationIdByUserName(String userName);

    void getUserMyReportByChartNode(MyReportByChartNodeRequest myReportByChartNodeRequest);

    void getUsernameByChartNode(Long chartNodeId, String chartNodeCode,String chartNodeName, String type );

    void listShareWith(ListShareWithResponse listShareWithResponse);

    void updateListUser(ListUpdateWorkingType data, String uuid);

    void getUserByUserName(String username);

    void getInfoAssignee(String username);

    void getUserDefault(UserInfoResponse userInfoResponse);

    void getUserDefaultByChart(String username, String status);

    void getChartNodeByListUser(String authorizationHeader,Long chartId,String status);

    void getChartNodeByUser(ChartRequest request,String authorizationHeader,String status);

    void getListUsernameActive(NotifyUserRequest request);

    void getInfoAssigneeByListUser(ChartRequest request);

    void getInfoByListUser(ChartRequest request);

}
