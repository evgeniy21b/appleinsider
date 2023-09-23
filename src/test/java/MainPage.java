import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.sun.tools.javac.Main;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта Appleinsider.ru
 */
public class MainPage {
    private final SelenideElement textBoxInput = $x("//input[@type='text']" );

    public MainPage(String url){ // конструктор

        Selenide.open(url);
    }

    /**
     * Выполняется поиск на сайте среди статей и нажимается кнопка ENTER
     * @param searchString поисковая строка
     */
    public void search(String searchString){
        textBoxInput.setValue(searchString);
        textBoxInput.sendKeys(Keys.ENTER);
    }

}
