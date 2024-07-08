package vn.fis.spro.customer.domains.systemconfig.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface SystemConfigRepository extends JpaRepository<SystemConfig, Integer>, JpaSpecificationExecutor<SystemConfig> {
}
