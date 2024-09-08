package org.example;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;
import static com.codeborne.selenide.Selenide.open;

public class Steps {

    @Step("Открываем главную страницу сайта Кинопоиск")
    public Steps openMainPageKP() {
        open("https://www.kinopoisk.ru/");
        return this;
    }

    @Step("Переходим в Расширенный поиск")
    public Steps goToFilter() {
        $x("//a[@aria-label=\"Расширенный поиск\"]").should(visible).click();
        $x("//h1[.//text()='Расширенный поиск']").should(visible);
        return this;
    }
}
