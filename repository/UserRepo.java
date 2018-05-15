package home.blackharold.sweater.repository;

import home.blackharold.sweater.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepo extends CrudRepository<User, Long> {
}
