package day1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;

import org.testng.annotations.Test;

public class PutMethod extends PostMethod {
	
	@Test
	void putMethod()
	{
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("name","GoodBoy");
		hm.put("job", "Politician");
	given()
	.contentType("application/json")
	.body(hm)
	.when()
	.put("https://reqres.in/api/users/"+id)
	.then()
	.log().all();
	//System.out.println(id);
	
	}
	
	

}
