package vn.fis.spro.customer.domains.workingtime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import vn.fis.spro.customer.domains.workingtime.model.entity.WorkingTime;

@Repository
public interface WorkingTimeRepository extends JpaRepository<WorkingTime, Long>, JpaSpecificationExecutor<WorkingTime> {
}
