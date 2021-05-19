package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Suzuki implements Manufacturer
{

    @Override
    public String name() {
        return "Suzuki";
    }
}
