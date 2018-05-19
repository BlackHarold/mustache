package home.blackharold.sweater.repository;

import home.blackharold.sweater.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
