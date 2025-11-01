package cnpmnc.demo.entity.relationships;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class TeachesId implements Serializable {
    private Integer teacherUserId;
    private String courseId;
    private String group;
}