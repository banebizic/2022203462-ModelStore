package rs.ac.singidunum.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import rs.ac.singidunum.entity.Model;
import rs.ac.singidunum.entity.ModelView;
import rs.ac.singidunum.repo.ModelRepository;
import rs.ac.singidunum.repo.ModelViewRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ModelService {
    private final ModelRepository repository;
    private final ModelViewRepository viewRepository;

    public List<ModelView> getModels() {
        return viewRepository.findAll();
    }

    public Optional<ModelView> getModelViewById(Integer id) {
        return viewRepository.findById(id);
    }

    public Optional<Model> getModelById(Integer id) {
        return repository.findById(id);
    }

    public Model createModel(Model model) {
        Model m = new Model();
        m.setModelName(model.getModelName());
        m.setManufacturer(model.getManufacturer());
        m.setModelType(model.getModelType());
        m.setModelScale(model.getModelScale());
        m.setModelPrice(model.getModelPrice());
        return repository.save(m);
    }

    public Model updateModel(Integer id, Model model) {
        Model m = getModelById(id).orElseThrow();
        m.setModelName(model.getModelName());
        m.setManufacturer(model.getManufacturer());
        m.setModelType(model.getModelType());
        m.setModelScale(model.getModelScale());
        m.setModelPrice(model.getModelPrice());
        return repository.save(m);
    }

    public void deleteModel(Integer id) {
        Model m = getModelById(id).orElseThrow();
        repository.delete(m);
    }
}
