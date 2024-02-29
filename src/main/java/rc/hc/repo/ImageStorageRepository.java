package rc.hc.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rc.hc.model.ImageStorage;
@Repository
public interface ImageStorageRepository extends JpaRepository<ImageStorage, Long> {

	Optional<ImageStorage> findByName(String fileName);
}
