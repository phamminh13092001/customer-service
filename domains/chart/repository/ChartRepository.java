package vn.fis.spro.customer.domains.chart.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;


@Repository
public interface ChartRepository extends JpaRepository<Chart, Long>, JpaSpecificationExecutor<Chart> {

}
