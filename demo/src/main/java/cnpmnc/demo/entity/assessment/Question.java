package cnpmnc.demo.entity.assessment;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import cnpmnc.demo.common.constants.EntityConstants;
import cnpmnc.demo.entity.user.Teacher;

@Entity
@Table(name = EntityConstants.QUESTION_TABLE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Question_ID")
    Integer questionId;

    @Column(name = "Question_text", columnDefinition = "TEXT", nullable = false)
    String questionText;

    @ManyToOne
    @JoinColumn(name = "Composer_Teacher_ID")
    Teacher composer;
}