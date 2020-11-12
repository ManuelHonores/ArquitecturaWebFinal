package application.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import application.entity.User;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Long> {

    @Query("SELECT SUM(p.val) from Client c JOIN c.products cp JOIN cp.product p WHERE c.id =:id")
    public Long purchasesByClient(Long id);

}
