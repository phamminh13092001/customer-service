package vn.fis.spro.customer.domains.userinfo.mapper;


import org.keycloak.representations.UserInfo;
import org.springframework.stereotype.Component;
import vn.fis.spro.customer.application.utils.BeanUtil;
import vn.fis.spro.customer.domains.userinfo.model.request.UserInfoRequest;
import vn.fis.spro.customer.domains.userinfo.model.response.UserInfoResponse;

@Component
public class UserInfoMapper {

    public UserInfoResponse to(UserInfo userInfo) {
        UserInfoResponse response  = new UserInfoResponse();
        BeanUtil.refine(userInfo, response, BeanUtil::copyNonNull);

        return response;
    }

    public UserInfo to(UserInfoRequest request) {
        UserInfo userInfo = new UserInfo();
        BeanUtil.refine(request, userInfo, BeanUtil::copyNonNull);

        return userInfo;
    }
}
