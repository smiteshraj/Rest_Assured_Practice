import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

import io.opentelemetry.sdk.metrics.data.Data;
import io.restassured.response.Response;
import static org.hamcrest.Matchers.*;

public class Test_01_get {
	
	@Test
	public void test01() {
		
		
		Response res=get("https://api.restful-api.dev/objects");
		
		System.out.println(res.getStatusCode());
		System.out.println(res.asString());
		System.out.println(res.getStatusLine());
		System.out.println(res.getTime());
		
	}
	@Test
	public void test02() {
		given().get("https://api.restful-api.dev/objects").then().statusCode(200).body("[0].id", equalTo("1"));
		
		given().get("https://api.restful-api.dev/objects").then().body("[0].name", equalTo("Google Pixel 6 Pro"));
		given().get("https://api.restful-api.dev/objects").then().log().all();
	
	
	}
	
	
}
