package rc.hc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import rc.hc.model.UserDistrict;

public interface UserDistrictRepository extends JpaRepository<UserDistrict, Integer>{

	@Query(value ="select ud.districtid, ud.districtname, ud.stateid from userdistrict ud where ud.stateid=?1",nativeQuery = true)
	List<UserDistrict> getDistrictsByStateId(Integer stateId);
}
