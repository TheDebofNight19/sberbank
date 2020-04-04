package cucumber.StepDefinition;

import Pages.BasePage;
import Pages.DepositsPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.cucumber.java.ru.Допустим;
import io.cucumber.java.ru.Когда;
import io.cucumber.java.ru.Ктомуже;
import io.cucumber.java.ru.Тогда;
import org.testng.Assert;

import java.util.List;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;


public class BaseSteps {

    BasePage basePage = new BasePage();
    DepositsPage depositsPage = new DepositsPage();


    @Допустим("Пользователь переходит по ссылке {string}")
    public void openPage(String string) {
        Selenide.open(string);
    }

    @Когда("Пользователь попадает на страницу sberbank.ru")
    public void assertUserIsOnTargetPage() {
        Assert.assertTrue(basePage.getBasePageLogo().isDisplayed());
    }

    @Тогда("Отображается название страницы {string}")
    public void assertCorrectTitle(String string) {
        Assert.assertEquals(string, Selenide.title());
    }

    @Допустим("Пользователь переходит через верхнее меню во \"Вклады\"")
    public void hoverOverDepositOption() {
        basePage.getDepositTab().hover();
        basePage.getDepositTabSubLink().click();
    }

    @Когда("Осущестляется переход")
    public void getDepositPage() {
        depositsPage.getDepositPageText().isDisplayed();
    }

    @Тогда("Название страницы {string}")
    public void assertUserIsOnDepositPage(String string) {
        Assert.assertEquals(string, Selenide.title());
    }

    @Допустим("Пользователь находится на странице {string}")
    public void checkIfUserIsOnDepositPage(String string) {
        Assert.assertEquals(string, Selenide.title());
    }

    @Когда("Пользователь перешел на вкладку {string}")
    public void getChooseDepositTab(String string) {
        depositsPage.getChooseDeposit().click();

    }

    @Тогда("Отображаются 4 чек-бокса и установлен чек-бокс «Онлайн»")
    public void assertCheckboxesAreAvailable(List<String> dataTable) {

        Selenide.switchTo().frame(depositsPage.getiFrame());
        for (String text : dataTable) {
            Assert.assertTrue($(byText(text)).isDisplayed());
            if (text == "Онлайн") {
                Assert.assertTrue(depositsPage.getLabel()
                        .find(byText(text))
                        .find(byXpath("//div[@id='depositSelection']//input[@type='checkbox']"))
                        .shouldHave(Condition.attribute("aria-checked", "true"))
                        .isDisplayed());
            }
        }
    }

    @Ктомуже("Отображается 3 вклада")
    public void assertDepositOptionsAreAvailable(List<String> dataTable) {
        for (String text : dataTable) {
            Assert.assertTrue($(byText(text)).isDisplayed());
        }
    }


    @Допустим("Пользователь выбирает чек-боксы")
    public void markDepositTypeCheckBoxes(List<String> dataTable) {
        for (String text : dataTable) {
            $(byText(text)).click();
        }

    }
}

//    @Тогда("Исчезли вклады")
//public void checkIfDepositTypesAreNotAvailable(List<String> dataTable) {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//}
//
//    @Тогда("Остался только вклад {string}")
//    public void осталсяТолькоВклад(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
////    @Допустим("Пользователь находится на вкладке {string}")
////    public void пользовательНаходитсяНаВкладке(String string) {
////        // Write code here that turns the phrase above into concrete actions
////        throw new io.cucumber.java.PendingException();
////    }
//
//    @Когда("Пользователь нажимет на кнопку {string} вклада {string}")
//    public void пользовательНажиметНаКнопкуВклада(String string, String string2) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Тогда("В новом окне открывается окно с названием «Сбербанк» -Вклад Управляй")
//    public void вНовомОкнеОткрываетсяОкноСНазваниемСбербанкВкладУправляй() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//
//    @Тогда("На странице отображается надпись \"\"Вклад Управляй\".")
//    public void наСтраницеОтображаетсяНадписьВкладУправляй() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }
//}