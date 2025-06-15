package rs.ac.singidunum.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rs.ac.singidunum.entity.Model;
import rs.ac.singidunum.entity.ModelView;
import rs.ac.singidunum.service.ModelService;

import java.util.List;

@RestController
@RequestMapping(path = "/api/model")
@CrossOrigin
@RequiredArgsConstructor
public class ModelController {

    private final ModelService service;

    @GetMapping("/view")
    public List<ModelView> getModels(){
        return service.getModels();
    }

    @GetMapping(path = "/view/{id}")
    public ResponseEntity<ModelView> getModelViewById(@PathVariable Integer id) {
        return ResponseEntity.of(service.getModelViewById(id));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Model> getModelById(@PathVariable Integer id) {
        return ResponseEntity.of(service.getModelById(id));
    }

    @PostMapping
    public Model saveModel(@RequestBody Model model) {
        return service.createModel(model);
    }

    @PutMapping(path = "/{id}")
    public Model updateModel(@PathVariable Integer id, @RequestBody Model model) {
        return service.updateModel(id, model);
    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteModel(@PathVariable Integer id) {
        service.deleteModel(id);
    }
}
