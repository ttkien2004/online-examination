package cnpmnc.demo.entity.relationships;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class UserRoleId implements Serializable {
    private Integer userId;
    private Integer roleId;
}