package cnpmnc.demo.entity.relationships;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import cnpmnc.demo.common.constants.EntityConstants;
import cnpmnc.demo.entity.user.Role;
import cnpmnc.demo.entity.user.User;

import java.io.Serializable;

@Entity
@Table(name = "User_Role")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@IdClass(UserRoleId.class)
public class UserRole {

    @Id
    @Column(name = "User_ID")
    Integer userId;

    @Id
    @Column(name = "Role_ID")
    Integer roleId;

    // Quan hệ với User
    @ManyToOne
    @JoinColumn(name = "User_ID", insertable = false, updatable = false)
    User user;

    // Quan hệ với Role
    @ManyToOne
    @JoinColumn(name = "Role_ID", insertable = false, updatable = false)
    Role role;
}