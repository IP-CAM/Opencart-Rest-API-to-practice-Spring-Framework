package br.ufpe.cin.hcs3.opencartapi.v1.domain.repository;

import br.ufpe.cin.hcs3.opencartapi.v1.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Boolean existsUserByMail(String mail);
}
