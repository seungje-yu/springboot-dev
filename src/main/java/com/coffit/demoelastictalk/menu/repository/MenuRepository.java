package com.coffit.demoelastictalk.menu.repository;

import com.coffit.demoelastictalk.menu.entity.Menu;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuRepository extends JpaRepository<Menu, Long> {
}
