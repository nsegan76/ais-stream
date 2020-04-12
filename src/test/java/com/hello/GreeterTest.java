package com.hello;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.hello.Greeter;

class GreeterTest {

    @Test
    void test() {
        Greeter greeter = new Greeter();
        assertEquals("Hello world!", greeter.sayHello());
    }
}