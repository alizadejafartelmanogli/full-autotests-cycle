package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Epic;
import org.example.BaseTest;
import org.example.Steps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

@Epic("Тесты фильтра Кинопоиск")
public class AutoTests extends BaseTest {

    @DisplayName("Проверка авторизации на сайте ВК")
    @Description("Тест проверяет правильность вывода занчений после фильтрации фильмов на странице расширенного поиска")
    @MethodSource("org.example.TestsData#authorizationTestData")
    @ParameterizedTest(name = "searchTest")
    void searchTest() {
        new Steps()
                .openMainPageKP()
                .goToFilter();
    }
}
