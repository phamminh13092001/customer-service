package vn.fis.spro.customer.domains.systemconfig.service;

public interface SystemConfigService {

    void getAllSystemGroup();

    void findByCodeAndName(String code, String name);

    void findValueByCodeAndInfo(String code, String info, String username);
}
