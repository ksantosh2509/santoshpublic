package day1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;


public class PostMethod {
	
	int id;
	
	@Test
	void postMethod()
	{
		 HashMap<String, String> hm = new HashMap<String, String>();
		 hm.put("name", "santosh");
		 hm.put("job", "Player");
		 
		id=given()
		.contentType("application/json")
		.body(hm)
		.when()
		.post("https://reqres.in/api/users")
		.jsonPath().getInt("id");
		//System.out.println(id);
		
	}

}
