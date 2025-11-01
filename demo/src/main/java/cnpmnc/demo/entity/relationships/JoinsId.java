package cnpmnc.demo.entity.relationships;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class JoinsId implements Serializable {
    private Integer studentUserId;
    private String courseId;
    private String group;
}