package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utilities;
import org.openqa.selenium.By;

public class HomePage extends Utilities {

    By desktopTab=By.xpath("//a[text()='Desktops']");
    By laptopsAndNotebooks=By.xpath("//a[text()='Laptops & Notebooks']");
    By components=By.xpath("//a[text()='Components']");

    public void hoverOnDesktopsTabAndClick(){
        mouseHoverToElementAndClick(desktopTab);
    }
    public void callSelectMenuMethodAndClick(String menu){
        selectMenu(menu);
    }
    public void hoverOnlaptopsAndNotebooksAndClick(){
        mouseHoverToElementAndClick(laptopsAndNotebooks);
    }
    public void hoverOnComponentsAndClick(){
        mouseHoverToElementAndClick(components);
    }

}
