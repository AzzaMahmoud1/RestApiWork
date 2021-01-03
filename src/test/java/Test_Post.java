import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class Test_Post {

	@Test
	public void Tests_post() {

		JSONObject request =new JSONObject();
		request.put("title", "foo");
		request.put("body", "bar");
		request.put("userId", 1);
		System.out.println(request);

		given().
		header("User-Agent","PostmanRuntime/7.26.8").header("Accept","*/*")
		.header("Postman-Token","8e3c38e4-9003-4c53-8a30-329109d7dd78")
		.header("Host","jsonplaceholder.typicode.com")
		.header("Connection","keep-alive")
		.cookie("__cfduid=de909599b9851ce1bacb320cbd37658c61609365564").
		body(request.toString()).
		when().
		post("https://jsonplaceholder.typicode.com/posts").
		then().
		statusCode(201);
	//	.log().all();
	}
}
