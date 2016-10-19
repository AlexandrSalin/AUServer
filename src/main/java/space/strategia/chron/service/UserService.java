package space.strategia.chron.service;

import space.strategia.chron.domain.User;
import space.strategia.chron.dto.UserCreateForm;

import java.util.Collection;
import java.util.Optional;

/**
 * Created by satalin on 10/18/16.
 */
public interface UserService {
    Optional<User> getUserById(long id);

    Optional<User> getUserByEmail(String email);

    Collection<User> getAllUsers();

    User create(UserCreateForm form);
}
