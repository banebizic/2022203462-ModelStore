package rs.ac.singidunum.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "vw_model")
@NoArgsConstructor
@Getter
public class ModelView {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "model_id")
    private Integer id;

    @Column(nullable = false)
    private String modelName;

    @Column(nullable = false)
    private String manufact;

    @Column(nullable = false)
    private String type;

    @Column(nullable = false)
    private String scale;

    @Column(nullable = false)
    private Integer modelPrice;

}
