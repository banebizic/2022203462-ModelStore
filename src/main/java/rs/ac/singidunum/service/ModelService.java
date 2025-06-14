package rs.ac.singidunum.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rs.ac.singidunum.entity.Model;
import rs.ac.singidunum.repo.ModelRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ModelService {
    private final ModelRepository repository;

    public List<Model> getModels() {
        return repository.findAll();
    }

    public Optional<Model> getModelById(Integer id) {
        return repository.findById(id);
    }

    public Model createModel(Model model) {
        Model m = new Model();
        m.setModelName(model.getModelName());
        m.setManufact(model.getManufact());
        m.setType(model.getType());
        m.setScale(model.getScale());
        m.setModelPrice(model.getModelPrice());
        return repository.save(m);
    }

    public Model updateModel(Integer id, Model model) {
        Model m = getModelById(id).orElseThrow();
        m.setModelName(model.getModelName());
        m.setManufact(model.getManufact());
        m.setType(model.getType());
        m.setScale(model.getScale());
        m.setModelPrice(model.getModelPrice());
        return repository.save(m);
    }

    public void deleteModel(Integer id) {
        Model m = getModelById(id).orElseThrow();
        repository.delete(m);
    }
}
