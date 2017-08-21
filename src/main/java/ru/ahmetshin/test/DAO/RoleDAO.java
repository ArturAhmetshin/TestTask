package ru.ahmetshin.test.DAO;

import ru.ahmetshin.test.domain.Roles;

public interface RoleDAO {
    public Roles getRoleById(long id);
    public void addRole(Roles role);
}
