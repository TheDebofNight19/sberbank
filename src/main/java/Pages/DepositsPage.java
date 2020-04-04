package Pages;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import java.util.List;

import static com.codeborne.selenide.Selectors.byXpath;
import static com.codeborne.selenide.Selenide.$;

public class DepositsPage extends BasePage {

    private SelenideElement depositPageText = $(byXpath("//h2[@class = 't-h2' and text()='Вклады']"));
    private SelenideElement chooseDeposit = $(byXpath("//a[text()='Подобрать вклад']"));
    private SelenideElement iFrame = $(byXpath("//iframe[@sandbox]"));
    private SelenideElement label = $(byXpath("//div[@id='depositSelection']//label"));
    private SelenideElement checkBox = $(byXpath("//div[@id='depositSelection']//input[@type='checkbox']"));

    public SelenideElement getDepositOptions() {
        return depositOptions;
    }

    private SelenideElement depositOptions = $(byXpath("//span[@class='kitt-link__text']"));

    public SelenideElement getLabel() {
        return label;
    }

    public SelenideElement getCheckBox() {
        return checkBox;
    }

    public SelenideElement getiFrame() {
        return iFrame;
    }

    public SelenideElement getDepositPageText() {
        return depositPageText;
    }

    public SelenideElement getChooseDeposit() {
        return chooseDeposit;
    }


}
