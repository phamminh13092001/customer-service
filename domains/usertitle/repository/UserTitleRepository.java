package vn.fis.spro.customer.domains.usertitle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface UserTitleRepository extends JpaRepository<UserTitle, Long>, JpaSpecificationExecutor<UserTitle> {

}
