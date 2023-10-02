package day1;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.Test;

public class DeleteMethod extends PostMethod {
	
	@Test
	void deleteMethod()
	{
		given()
		.when()
		.delete("https://reqres.in/api/users/"+id)
		.then()
		.log().all();
	}

}
