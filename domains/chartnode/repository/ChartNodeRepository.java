package vn.fis.spro.customer.domains.chartnode.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;
import vn.fis.spro.customer.domains.chartnode.model.entity.ChartNode;

@Repository
public interface ChartNodeRepository extends JpaRepository<ChartNode, Long>, JpaSpecificationExecutor<ChartNode> {
}
