package com.shaliniUdemy.learnspringframework.examples.c1;

import com.shaliniUdemy.learnspringframework.examples.c1.DataService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
@Component
public class BusinessCalculationService {
    private DataService dataService;

    public BusinessCalculationService(DataService dataService)
    {
        super();
        this.dataService=dataService;
    }
    public int findMAx()
    {
        return Arrays.stream(dataService.retrieveData()).max().orElse(0);
    }

}
