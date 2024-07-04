package vn.fis.spro.customer.application.controllers;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userTitle")
@Tag(name = "User title Controller", description = "The Customer Service API with description tag annotation")
@Slf4j
public class UserTitleController {

    @GetMapping("/getTitleByUsername")
    public ResponseEntity<?> getTitleByUsername(@RequestParam("username") String username) {
        //TODO
        return null;
    }

    @GetMapping("/getUserTitle")
    public ResponseEntity<?> getUserTitle(@RequestParam("username") String username) {
        //TODO
        return null;
    }

}
