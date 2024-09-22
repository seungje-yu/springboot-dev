package com.coffit.demoelastictalk.menu.dto;

import com.coffit.demoelastictalk.menu.entity.Menu;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class MenuDto {

    private Long menuCode;

    private String menuName;

    private int menuPrice;

    private int categoryCode;

    private String orderableStatus;

    @Builder
    public MenuDto(Long menuCode, String menuName, int menuPrice, int categoryCode, String orderableStatus) {
        this.menuCode = menuCode;
        this.menuName = menuName;
        this.menuPrice = menuPrice;
        this.categoryCode = categoryCode;
        this.orderableStatus = orderableStatus;
    }

    @Builder
    public MenuDto(Menu menu){
        this.menuCode = menu.getMenuCode();
        this.menuName = menu.getMenuName();
        this.menuPrice = menu.getMenuPrice();
        this.categoryCode = menu.getCategoryCode();
        this.orderableStatus = menu.getOrderableStatus();
    }

    public Menu toMenu(){
        return Menu.builder()
                .menuCode(menuCode)
                .menuName(menuName)
                .menuPrice(menuPrice)
                .categoryCode(categoryCode)
                .orderableStatus(orderableStatus)
                .build();
    }

}
