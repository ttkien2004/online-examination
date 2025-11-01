package cnpmnc.demo.entity.assessment;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class TestQuestionId implements Serializable {
    private Integer testId;
    private Integer questionId;
}