package vn.fis.spro.customer.application.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


public class WorkingTimeController {
    @PostMapping("/getListTimeResponse")
    public ResponseEntity<?> getListTime(@RequestBody List<ListTimeExpectRequest> listTimeExpectRequests) {
        //TODO
        return null;
    }

    @PostMapping("/getListTimeResponse")
    public ResponseEntity<?> getListTime(@RequestBody List<ListTimeExpectRequest> listTimeExpectRequests) {
        //TODO
        return null;
    }

    @PostMapping("/getListTimeExpect")
    public ResponseEntity<?> getListTimeExpect(@RequestBody List<ListTimeExpectRequest> listTimeExpectRequests) {
        //TODO
        return null;
    }

}
