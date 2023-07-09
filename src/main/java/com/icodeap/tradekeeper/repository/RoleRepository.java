package com.icodeap.tradekeeper.repository;

import com.icodeap.tradekeeper.model.ERole;
import com.icodeap.tradekeeper.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
