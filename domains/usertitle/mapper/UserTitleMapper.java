package vn.fis.spro.customer.domains.usertitle.mapper;


import vn.fis.spro.customer.application.utils.BeanUtil;
import vn.fis.spro.customer.domains.usertitle.model.response.UserTitleResponse;

public class UserTitleMapper {
    public UserTitleResponse to(UserTitle userTitle) {
        UserTitleResponse response  = new UserTitleResponse();
        BeanUtil.refine(userTitle, response, BeanUtil::copyNonNull);

        return response;
    }
}
