package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class TopMenuPage extends Utility {

public void selectMenu(String menu){
    clickOnElement(By.linkText(menu));
}


}
