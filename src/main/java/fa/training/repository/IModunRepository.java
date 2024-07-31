package fa.training.repository;

import fa.training.entity.Modun;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IModunRepository extends JpaRepository<Modun, Integer> {
}
