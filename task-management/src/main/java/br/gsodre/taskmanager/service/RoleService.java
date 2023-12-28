package br.gsodre.taskmanager.service;

import org.springframework.beans.PropertyValues;
import br.gsodre.taskmanager.model.Role;

import java.util.List;

public interface RoleService {
    Role createRole(Role role);

    List<Role> findAll();
}
