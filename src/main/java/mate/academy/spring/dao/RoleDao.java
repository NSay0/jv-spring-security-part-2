package mate.academy.spring.dao;

import mate.academy.spring.model.Role;
import mate.academy.spring.model.Role.RoleName;

public interface RoleDao {
    Role add(Role role);

    Role getByName(RoleName roleName);
}
