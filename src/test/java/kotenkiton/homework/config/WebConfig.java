package kotenkiton.homework.config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources("classpath:config/${config-test}.properties")
public interface WebConfig extends Config {

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("99.0")
    String getBrowserVersion();

    @Key("remoteWebDriver")
    String getRemoteWebDriver();

    @Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseUrl();

    @Key("remoteUrl")
    URL getRemoteUrl();
}