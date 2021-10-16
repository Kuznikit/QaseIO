package wrappers;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;


public class DropDown {
    String dropdown = "//div[@class='form-group']/label[contains(text(),'%s')]/ancestor::div[@class='form-group']/div[contains(@class, 'container')]";
    String dropdownOption = "//div[contains(@id,'react-select') and contains(text(),'%s')]";
    String label;
    public DropDown (String label){
        this.label = label;
    }
    public void select (String option){
        $(By.xpath(String.format(dropdown, label))).click();
        $(By.xpath(String.format(dropdownOption, option))).click();

    }
}
