package vn.fis.spro.customer.application.controllers;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.fis.spro.common.model.request.ChartRequest;
import vn.fis.spro.customer.domains.chartnode.model.request.ChartNodeDtoRequest;
import vn.fis.spro.customer.domains.userinfo.model.request.NotifyUserRequest;
import vn.fis.spro.customer.domains.userinfo.model.response.ListShareWithResponse;
import vn.fis.spro.customer.domains.userinfo.service.UserInfoService;

import javax.validation.Valid;


@RestController
@RequestMapping("/userInfo")
@AllArgsConstructor
public class UserInfoController extends BaseController {

    private  UserInfoService userInfoService;

    @GetMapping("/getByUsername")
    public ResponseEntity<?> getUserByUsername(@RequestParam("username") String username) {
        userInfoService.getUserByUsername(username);
        return success("");
    }

    @GetMapping("/getEmailByUsername")
    public ResponseEntity<?> getEmailByUsername(@RequestParam("username") String username) {
       userInfoService.getEmailByUsername(username);
       return success("");
    }

    @PostMapping("/getByEmails")
    public ResponseEntity<?> getUserInfoByEmails(@RequestBody NotifyUserRequest request) {
        userInfoService.getUserInfoByEmails(request);
        return success("");
    }

    @PostMapping("/getByUserNames")
    public ResponseEntity<?> getUserInfoByUserNames(@RequestBody NotifyUserRequest request) {
        userInfoService.getUserInfoByUserNames(request);
        return success("");
    }

    @PostMapping("/getUserTaskInfoByUserNames")
    public ResponseEntity<?> getUserTaskInfoByUserNames(@RequestBody NotifyUserRequest request) {
        userInfoService.getUserTaskInfoByUserNames(request);
        return success("");
    }

    @PostMapping("/getUserInfoByChartIdAndCharNodeIds")
    public ResponseEntity<?> getUserInfoByChartIdAndCharNodeIds(@RequestBody ChartNodeDtoRequest request) {
        userInfoService.getUserInfoByChartIdAndCharNodeIds(request);
        return success("");
    }

    @GetMapping("/checkStartPhase")
    public ResponseEntity<?> checkStartPhase(@RequestParam("procDefId") String procDefId, @RequestParam("taskDefKey") String taskDefKey, @RequestHeader("Authorization") String token) {
        userInfoService.checkStartPhase(procDefId,taskDefKey,token);
        return success("");
    }

    @GetMapping("/getAutoAssign/{value}")
    public ResponseEntity<?> getAutoAssign(@PathVariable String value, @RequestHeader("Authorization") String token) {
        userInfoService.getAutoAssign(value,token);
        return success("");
    }

    @GetMapping("/getUserEmailByTenant")
    public ResponseEntity<?> getUserEmailByTenant() {
        userInfoService.getUserEmailByTenant();
        return success("");
    }

    @GetMapping("/getAllAccount")
    public ResponseEntity<?> getAllAccount() {
        userInfoService.getAllAccount();
        return success("");
    }

    @GetMapping("/getAssistantByChartNode")
    public ResponseEntity<?> getAssistantByChartNode(@Valid @RequestParam("email") String email, @RequestParam("createUser") String createUser) {
        userInfoService.getAssistantByChartNode(email,createUser);
        return success("");
    }

    @GetMapping("/getLocationIdByUserName")
    public ResponseEntity<?> getLocationIdByUserName(@Valid @RequestParam("userName") String userName) {
        userInfoService.getLocationIdByUserName(userName);
        return success("");
    }

    @PostMapping("/getUserMyReportByChartNode")
    public ResponseEntity<?> getUserMyReportByChartNode(@RequestBody MyReportByChartNodeRequest myReportByChartNodeRequest) {
        userInfoService.getUserMyReportByChartNode(myReportByChartNodeRequest);
        return success("");
    }

    @GetMapping("/getUsernameByChartNode")
    public ResponseEntity<?> getUsernameByChartNode(@RequestParam(required = false, value = "chartNodeId") Long chartNodeId,
                                                    @RequestParam(required = false, value = "chartNodeCode") String chartNodeCode,
                                                    @RequestParam(required = false, value = "chartNodeName") String chartNodeName,
                                                    @RequestParam(required = false, value = "type") String type) {
        userInfoService.getUsernameByChartNode(chartNodeId,chartNodeCode,chartNodeName,type);
        return success("");
    }

    @PostMapping("/listShareWith")
    public ResponseEntity<?> listShareWith(@RequestBody ListShareWithResponse listShareWithResponse) {
        userInfoService.listShareWith(listShareWithResponse);
        return success("");
    }

    @PutMapping("/update-working-type")
    public ResponseEntity<?> updateListUser(@RequestBody ListUpdateWorkingType data, @RequestHeader(value = "messageId", required = false) String uuid) {
        userInfoService.updateListUser(data,uuid);
        return success("");
    }

    @GetMapping("/getUserByUserName")
    public ResponseEntity<?> getUserByUserName(@RequestParam("username") String username) {
        userInfoService.getUserByUserName(username);
        return success("");
    }

    @GetMapping("/getAssigneeInfo")
    public ResponseEntity<?> getInfoAssignee(@RequestParam("username") String username) {
        userInfoService.getInfoAssignee(username);
        return success("");
    }

    //FE call
    @PostMapping("/getUserDefault")
    public ResponseEntity<?> getUserDefault(@RequestBody(required = false) UserInfoDto userInfoDto) {
        userInfoService.getUserDefault(userInfoDto);
        return success("");
    }

    //call internal
    @GetMapping("/getUserDefaultByChart")
    public ResponseEntity<?> getUserDefaultByChart(@RequestParam("username") String username, @RequestParam(required = false, name = "status") String status) {
        userInfoService.getUserDefaultByChart(username,status);
        return success("");
    }

    //FE call
    @PostMapping("/getListChartNodeByUser")
    public ResponseEntity<?> getChartNodeByListUser(@RequestHeader("Authorization") String authorizationHeader, @RequestParam(required = false, value = "chartId") Long chartId, @RequestParam(required = false, value = "status") String status) {
        userInfoService.getChartNodeByListUser(authorizationHeader,chartId,status);
        return success("");
    }

    @PostMapping("/getChartNodeByListUser")
    public ResponseEntity<?> getChartNodeByUser(@RequestBody ChartRequest request, @RequestHeader("Authorization") String authorizationHeader, @RequestParam(required = false, value = "status") String status) {
        userInfoService.getChartNodeByUser(request,authorizationHeader,status);
        return success("");
    }

    @PostMapping("/getListUsernameActive")
    public ResponseEntity<?> getListUsernameActive(@RequestBody NotifyUserRequest request) {
        userInfoService.getListUsernameActive(request);
        return success("");
    }

    @PostMapping("/getInfoAssigneeByListUser")
    public ResponseEntity<?> getInfoAssigneeByListUser(@RequestBody ChartRequest request) {
        userInfoService.getInfoAssigneeByListUser(request);
        return success("");
    }

    @PostMapping("/getInfoByListUser")
    public ResponseEntity<?> getInfoByListUser(@RequestBody ChartRequest request) {
        userInfoService.getInfoByListUser(request);
        return success("");
    }

}
