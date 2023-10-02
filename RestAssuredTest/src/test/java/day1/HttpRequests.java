package day1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


public class HttpRequests {
	
	
	@Test
	void getUser()
	{
		/* Get Method for Sales Order Summary using TBAPI */		
		given()
        	.header("Content-type", "application/json;charset=UTF-8")
        	.header("Authorization", "Trusted application=\"eSales\", username=\"9167301470313052414\"")
        .when()
        	.get("http://10.109.27.39:28080/api/v1/orderManagement/salesOrder/9167322639413211723/summary")
        .then()
             .log().all();
		
	}

}
