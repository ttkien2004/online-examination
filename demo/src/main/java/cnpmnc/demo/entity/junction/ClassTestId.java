package cnpmnc.demo.entity.junction;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ClassTestId implements Serializable {
    private String courseId;
    private String group;
    private Integer testId;
}