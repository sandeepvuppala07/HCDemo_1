package rc.hc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rc.hc.model.UserState;

@Repository
public interface UserStateRepository extends JpaRepository<UserState, Integer>{

}
