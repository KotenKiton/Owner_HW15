package io.qaguru.owner.сonfig;

import org.aeonbits.owner.Config;

import java.net.URL;

public interface WebDriverConfig extends Config {

    // Реализации Библиотеки Owner в этом файле.
    // В классе LegacyWebDriverConfig устаревшая реализация без библиотеки Owner.


    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    // зачитываем данные из командной строки
    @Key("remoteUrl")
    // обрабатывает дефолтное значение
    @Config.DefaultValue("http://localhost:4444/wd/hub")
    // конвертируем в возращаемый тип
    URL getRemoteUrl();

}