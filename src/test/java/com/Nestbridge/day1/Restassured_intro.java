package com.Nestbridge.day1;


import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.*;

@DisplayName("Intro to RestAssured")
public class Restassured_intro {

   @DisplayName("Testing hello endpoint")
    @Test
    public void testHelloPoint(){
      Response response= get("http://3.92.203.41:8000/api/hello");
       System.out.println("response.statusCode() = " + response.statusCode());
       System.out.println("response.getHeader() = " + response.getHeader("Content-Type"));
   }
}
