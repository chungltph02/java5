package java5.sof2021.reposittory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java5.sof2021.entities.Account;

public interface AccountRepository extends JpaRepository<Account, Integer> {
	@Query(value="SELECT acc FROM Account acc WHERE acc.email LIKE %:email% ")
	public Account findByEmail(@Param("email") String email);
	

}
