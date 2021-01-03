import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.Assert;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
public class GetPost {
	@Test
	public void test() {
		given().
		header("User-Agent","PostmanRuntime/7.26.8").header("Accept","*/*")
		.header("Postman-Token","01838691-da9f-4493-8f6d-9f46b9981945")
		.header("Host","jsonplaceholder.typicode.com")
		.header("Connection","keep-alive")
		.cookie("__cfduid=de909599b9851ce1bacb320cbd37658c61609365564").get("https://jsonplaceholder.typicode.com/posts/1")
		.then().
		statusCode(200)
		.body("userId", equalTo(1))
		.body("id", equalTo(1))
		.body("title", equalToCompressingWhiteSpace("sunt aut facere repellat provident occaecati excepturi optio reprehenderit"))
		
		.log().all();
	}

}






