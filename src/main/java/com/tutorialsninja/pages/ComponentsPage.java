package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utilities;
import org.openqa.selenium.By;

public class ComponentsPage extends Utilities {
        By components=By.cssSelector("#content h2");
        public String getTextComponents(){
            return getTextFromElement(components);
        }
}
