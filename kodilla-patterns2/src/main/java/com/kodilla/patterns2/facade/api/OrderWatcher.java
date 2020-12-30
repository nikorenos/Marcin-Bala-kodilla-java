package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderWatcher {
    private static final Logger LOGGER = LoggerFactory.getLogger(OrderFacade.class);

    @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processorOrder(..))")
    public void logEvent() {
        LOGGER.info("processor Order is executed");
    }

}
