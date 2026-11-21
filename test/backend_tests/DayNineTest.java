package com.edutech.progressive;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.annotation.Annotation;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

public class DayNineTest {

    @Test
    void testBankSafeApplicationHasSpringBootApplicationAnnotation_Day9() {

        Annotation annotation = BankSafeApplication.class.getAnnotation(SpringBootApplication.class);

        assertTrue(annotation != null,
                "BankSafeApplication should have @SpringBootApplication annotation");
    }
}