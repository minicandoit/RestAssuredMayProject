package com.Nestbridge.day1;

import com.Nestbridge.pojo.Driver;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;

public class formulaoneApiTest {
    @BeforeAll
    public static void init(){

        baseURI = "http://ergast.com";
        basePath = "api/f1" ;

    }

    @AfterAll
    public static void cleanup(){
        reset();
    }


    @DisplayName("GET /drivers.json and save result to pojo")
    @Test
    public void testDrivers() {
        // Get first Driver as Driver POJO
        JsonPath jp = get("/drivers.json").prettyPeek().jsonPath() ;
        Driver d1 = jp.getObject("MRData.DriverTable.Drivers[0]", Driver.class) ;
        System.out.println("d1 = " + d1);




    }


    }
