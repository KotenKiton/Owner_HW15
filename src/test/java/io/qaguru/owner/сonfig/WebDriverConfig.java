package io.qaguru.owner.сonfig;


public class WebDriverConfig {

    public String getBaseUrl() {
        return "https://github.com";
    }

    public Browser getBrowser(){
        String browser = System.getProperty("browser");
        return Browser.valueOf(browser);
    }

}
