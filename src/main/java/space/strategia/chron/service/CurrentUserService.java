package space.strategia.chron.service;

import space.strategia.chron.domain.CurrentUser;

/**
 * Created by satalin on 10/18/16.
 */
public interface CurrentUserService {
    boolean canAccessUser(CurrentUser currentUser, Long userId);
}
