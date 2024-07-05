package vn.fis.spro.customer.application.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.fis.spro.customer.domains.workingtime.service.WorkingTimeService;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/working-time")
public class WorkingTimeController extends BaseController {
    private WorkingTimeService workingTimeService;

    @PostMapping("/getListTimeResponse")
    public ResponseEntity<?> getListTime(@RequestBody List<ListTimeExpectRequest> listTimeExpectRequests) {
        workingTimeService.getListTime(listTimeExpectRequests);
        return success("");
    }

    @GetMapping("/timeResponse")
    public ResponseEntity<?> caculTime(@RequestParam("timeCreate") Long startDateTicket, @RequestParam("timeRes") long timeRes, @RequestParam(required = false, value = "emailAssignee") String emailAssignee) {
        workingTimeService.caculTime(startDateTicket,timeRes,emailAssignee);
        return success("");
    }

    @PostMapping("/getListTimeExpect")
    public ResponseEntity<?> getListTimeExpect(@RequestBody List<ListTimeExpectRequest> listTimeExpectRequests) {
        workingTimeService.getListTimeExpect(listTimeExpectRequests);
        return success("");
    }

}
