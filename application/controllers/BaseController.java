package vn.fis.spro.customer.application.controllers;

import org.springframework.http.ResponseEntity;
import vn.fis.spro.customer.application.base.model.BaseResponse;

public abstract class BaseController {

//    protected UserDetail getUserDetail() {
//        UserAuthentication userAuthentication = (UserAuthentication) SecurityContextHolder.getContext().getAuthentication();
//        UserDetail userDetails = (UserDetail) userAuthentication.getDetails();
//
//        return userDetails;
//    }

    public ResponseEntity success() {
        return ResponseEntity.ok(BaseResponse.success());
    }

    public <T> ResponseEntity<BaseResponse<T>> success(T data) {
        return ResponseEntity.ok(BaseResponse.success(data));
    }
}
