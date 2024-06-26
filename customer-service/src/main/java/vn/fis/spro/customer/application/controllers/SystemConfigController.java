package vn.fis.spro.customer.application.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


public class SystemConfigController {
    @GetMapping("/getAllSystemGroup")
    public ResponseEntity<?> getAllSystemGroup() {
        //TODO
        return null;
    }

    @GetMapping("/findByCodeAndName")
    public ResponseEntity<?> findByCodeAndName(@RequestParam(required = false) String code, @RequestParam(required = false) String name) {
        //TODO
        return null;
    }

    @GetMapping("/findValueByCodeAndInfo")
    public ResponseEntity<?> findValueByCodeAndInfo(@RequestParam(required = false) String code,
                                                    @RequestParam(required = false) String info,
                                                    @RequestParam("username") String username) {
        //TODO
        return null;
    }
}
