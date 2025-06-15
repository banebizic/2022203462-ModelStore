package rs.ac.singidunum.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.singidunum.entity.ModelView;

@Repository
public interface ModelViewRepository extends JpaRepository<ModelView, Integer> {

}
