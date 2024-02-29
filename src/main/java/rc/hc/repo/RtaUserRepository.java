package rc.hc.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import rc.hc.model.RtaUserdetails;
@Repository
public interface RtaUserRepository extends CrudRepository<RtaUserdetails, Integer>{

}
