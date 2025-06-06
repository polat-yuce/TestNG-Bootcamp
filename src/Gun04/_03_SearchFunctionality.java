package Gun04;

/*
      Senaryo ;
      1- Siteyi açınız.
      2- mac kelimeini göndererek aratınız.
      3- Çıkan sonuçlarda mac kelimesinin geçtiğini doğrulayınız.
      4- aynı işlemi samsung için de yapınız
    */

import Utlity.BaseDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

import static Utlity.BaseDriver.driver;

public class _03_SearchFunctionality extends BaseDriver {


    @Test
    @Parameters("searchText")
    public void SearchFunction(String arananKelime)
    {
        WebElement searchInput=driver.findElement(By.name("search"));
        searchInput.sendKeys(arananKelime+ Keys.ENTER);

        List<WebElement> captions=driver.findElements(By.cssSelector("[class='caption']>h4"));

        for(WebElement e : captions)
            Assert.assertTrue(e.getText().toLowerCase().contains(arananKelime.toLowerCase()),
                    "Aranan kelime bulunamadı");

    }
}
