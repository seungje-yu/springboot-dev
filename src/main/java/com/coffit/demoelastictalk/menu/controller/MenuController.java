package com.coffit.demoelastictalk.menu.controller;

import com.coffit.demoelastictalk.menu.dto.MenuDto;
import com.coffit.demoelastictalk.menu.service.MenuService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
@RequiredArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @GetMapping("/list")
    public List<MenuDto> getAllMenus() {

        return menuService.getAllMenus();
    }

}
