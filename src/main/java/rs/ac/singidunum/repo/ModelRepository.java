package rs.ac.singidunum.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rs.ac.singidunum.entity.Model;

@Repository
public interface ModelRepository extends JpaRepository<Model, Integer> {

}
