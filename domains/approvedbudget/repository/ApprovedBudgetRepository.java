package vn.fis.spro.customer.domains.approvedbudget.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApprovedBudgetRepository extends JpaRepository<ApprovedBudget, Long> {

}