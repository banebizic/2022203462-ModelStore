package rs.ac.singidunum.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "model")
@NoArgsConstructor
@Getter
@Setter
public class Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "model_id")
    private Integer id;

    @Column(nullable = false)
    private String modelName;

    @Column(nullable = false)
    private String manufacturer;

    @Column(nullable = false)
    private String modelType;

    @Column(nullable = false)
    private String modelScale;

    @Column(nullable = false)
    private Integer modelPrice;

}
