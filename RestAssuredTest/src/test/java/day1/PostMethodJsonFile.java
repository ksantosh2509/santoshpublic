package day1;

import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;
import org.testng.annotations.Test;



public class PostMethodJsonFile {
	
	@Test
	void postMethodJsonfile() throws FileNotFoundException
	{
		File f = new File(".//DD.json");
		FileReader fr = new FileReader(f);
		JSONTokener jt = new JSONTokener(fr);
		JSONObject jo = new JSONObject(jt);
		
		given()
		.contentType("application/json")
		.body(jo.toString())
		.when()
		.post("http://10.109.26.146:6300/api/telenet/cbm/mandate/989927643/create")
		.then()
		.log().all();
	}

}
