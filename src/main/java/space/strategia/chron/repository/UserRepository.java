package space.strategia.chron.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import space.strategia.chron.domain.User;

import java.util.Optional;

/**
 * Created by satalin on 10/18/16.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findOneByEmail(String email);
}
