package cnpmnc.demo.entity.academic;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import cnpmnc.demo.common.constants.EntityConstants;

@Entity
@Table(name = EntityConstants.CLASS_TABLE)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@IdClass(ClassId.class)
public class Class {

    @Id
    @Column(name = "Course_ID", length = 20)
    String courseId;

    @Id
    @Column(name = "`Group`", length = 20)
    String group;

    @ManyToOne
    @JoinColumn(name = "Course_ID", insertable = false, updatable = false)
    Course course;
}