package com.coffit.demoelastictalk.menu.service;

import com.coffit.demoelastictalk.menu.dto.MenuDto;
import com.coffit.demoelastictalk.menu.entity.Menu;
import com.coffit.demoelastictalk.menu.repository.MenuRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
@RequiredArgsConstructor
public class MenuService {

    private final MenuRepository menuRepository;

    public List<MenuDto> getAllMenus() {

        List<Menu> menus = menuRepository.findAll();

        List<MenuDto> menuDtos = menus.stream().map(MenuDto::new).collect(Collectors.toList());

        log.info("[MenuService] getAllMenus : {}", menuDtos);

        return menuDtos;
    }
}
