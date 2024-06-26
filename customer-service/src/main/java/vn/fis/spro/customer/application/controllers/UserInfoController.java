package vn.fis.spro.customer.application.controllers;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.fis.spro.common.model.request.ChartRequest;

import javax.validation.Valid;


@RestController
@RequestMapping("/userInfo")
@AllArgsConstructor
public class UserInfoController extends BaseController {


    @GetMapping("/getByUsername")
    public ResponseEntity<?> getUserByUsername(@RequestParam("username") String username) {
        //TODO
        return null;
    }

    @GetMapping("/getEmailByUsername")
    public ResponseEntity<?> getEmailByUsername(@RequestParam("username") String username) {
        //TODO
        return null;
    }

    @PostMapping("/getByEmails")
    public ResponseEntity<?> getUserInfoByEmails(@RequestBody NotifyUserRequest request) {
        //TODO
        return null;
    }

    @PostMapping("/getByUserNames")
    public ResponseEntity<?> getUserInfoByUserNames(@RequestBody NotifyUserRequest request) {
        //TODO
        return null;
    }

    @PostMapping("/getUserTaskInfoByUserNames")
    public ResponseEntity<?> getUserTaskInfoByUserNames(@RequestBody NotifyUserRequest request) {
        //TODO
        return null;
    }

    @PostMapping("/getUserInfoByChartIdAndCharNodeIds")
    public ResponseEntity<?> getUserInfoByChartIdAndCharNodeIds(@RequestBody ChartNodeDtoRequest request) {
        //TODO
        return null;
    }

    @GetMapping("/checkStartPhase")
    public ResponseEntity<?> checkStartPhase(@RequestParam("procDefId") String procDefId, @RequestParam("taskDefKey") String taskDefKey, @RequestHeader("Authorization") String token) {
        //TODO
        return null;
    }

    @GetMapping("/getAutoAssign/{value}")
    public ResponseEntity<?> getAutoAssign(@PathVariable String value, @RequestHeader("Authorization") String token) {
        //TODO
        return null;
    }

    @GetMapping("/getUserEmailByTenant")
    public ResponseEntity<?> getUserEmailByTenant() {
        //TODO
        return null;
    }

    @GetMapping("/getAllAccount")
    public ResponseEntity<?> getAllAccount() {
        //TODO
        return null;
    }

    @GetMapping("/getAssistantByChartNode")
    public ResponseEntity<?> getAssistantByChartNode(@Valid @RequestParam("email") String email, @RequestParam("createUser") String createUser) {
        //TODO
        return null;
    }

    @GetMapping("/getLocationIdByUserName")
    public ResponseEntity<?> getLocationIdByUserName(@Valid @RequestParam("userName") String userName) {
        //TODO
        return null;
    }

    @PostMapping("/getUserMyReportByChartNode")
    public ResponseEntity<?> getUserMyReportByChartNode(@RequestBody MyReportByChartNodeRequest myReportByChartNodeRequest) {
        //TODO
        return null;
    }

    @GetMapping("/getUsernameByChartNode")
    public ResponseEntity<?> getUsernameByChartNode(@RequestParam(required = false, value = "chartNodeId") Long chartNodeId,
                                                    @RequestParam(required = false, value = "chartNodeCode") String chartNodeCode,
                                                    @RequestParam(required = false, value = "chartNodeName") String chartNodeName,
                                                    @RequestParam(required = false, value = "type") String type) {
        //TODO
        return null;
    }

    @PostMapping("/listShareWith")
    public ResponseEntity<?> listShareWith(@RequestBody ListShareWithResponse listShareWithResponse) {
        //TODO
        return null;
    }

    @PutMapping("/update-working-type")
    public ResponseEntity<?> updateListUser(@RequestBody ListUpdateWorkingType data, @RequestHeader(value = "messageId", required = false) String uuid) {
        //TODO
        return null;
    }

    @GetMapping("/getUserByUserName")
    public ResponseEntity<?> getUserByUserName(@RequestParam("username") String username) {
        //TODO
        return null;
    }

    @GetMapping("/getAssigneeInfo")
    public ResponseEntity<?> getInfoAssignee(@RequestParam("username") String username) {
        //TODO
        return null;
    }

    //FE call
    @PostMapping("/getUserDefault")
    public ResponseEntity<?> getUserDefault(@RequestBody(required = false) UserInfoDto userInfoDto) {
        //TODO
        return null;
    }

    //call internal
    @GetMapping("/getUserDefaultByChart")
    public ResponseEntity<?> getUserDefaultByChart(@RequestParam("username") String username, @RequestParam(required = false, name = "status") String status) {
        //TODO
        return null;
    }

    //FE call
    @PostMapping("/getListChartNodeByUser")
    public ResponseEntity<?> getChartNodeByListUser(@RequestHeader("Authorization") String authorizationHeader, @RequestParam(required = false, value = "chartId") Long chartId, @RequestParam(required = false, value = "status") String status) {
        //TODO
        return null;
    }

    @PostMapping("/getChartNodeByListUser")
    public ResponseEntity<?> getChartNodeByUser(@RequestBody ChartRequest request, @RequestHeader("Authorization") String authorizationHeader, @RequestParam(required = false, value = "status") String status) {
        //TODO
        return null;
    }

    @PostMapping("/getListUsernameActive")
    public ResponseEntity<?> getListUsernameActive(@RequestBody NotifyUserRequest request) {
        //TODO
        return null;
    }

    @PostMapping("/getInfoAssigneeByListUser")
    public ResponseEntity<?> getInfoAssigneeByListUser(@RequestBody ChartRequest request) {
        //TODO
        return null;
    }

    @PostMapping("/getInfoByListUser")
    public ResponseEntity<?> getInfoByListUser(@RequestBody ChartRequest request) {
        //TODO
        return null;
    }

}
