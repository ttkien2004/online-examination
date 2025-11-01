package cnpmnc.demo.entity.academic;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class ClassId implements Serializable {
    private String courseId;
    private String group;
}