package vn.fis.spro.customer.application.controllers;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import vn.fis.spro.customer.application.base.model.BaseResponse;
import vn.fis.spro.customer.application.exceptions.BusinessException;
import vn.fis.spro.customer.application.exceptions.ResponseStatus;

@RestControllerAdvice
@AllArgsConstructor
public class ApiHandleExceptionController {

    @ExceptionHandler(BusinessException.class)
    public ResponseEntity<BaseResponse<ResponseStatus>> handleUrlExisted(BusinessException businessException) {
        return new ResponseEntity<>(BaseResponse.fail(businessException), businessException.getResponseStatus().getStatus());
    }
}
