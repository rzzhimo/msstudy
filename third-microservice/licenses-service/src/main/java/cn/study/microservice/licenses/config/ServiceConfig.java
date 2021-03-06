package cn.study.microservice.licenses.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component()
@RefreshScope
public class ServiceConfig {

    @Value("${example.property}")
    private String exampleProperty;

//    @Value("${example.timeoutInMilliseconds}")
//    private String timeoutInMilliseconds;

    public String getExampleProperty() {
        return exampleProperty;
    }

    public String getTimeoutInMilliseconds() {
//        return timeoutInMilliseconds;
        return "temp time out in ms";
    }
}
