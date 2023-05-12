package Git;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Adduser {
	
	@Test
	public void Post ()
	{
		given()
			.contentType("application/json")
			.body("{\r\n"
					+ "    \"name\": \"boss\",\r\n"
					+ "    \"role\": \"qa\",\r\n"
					+ "    \"age\": 31,\r\n"
					+ "    \"city\": \"hyd\"\r\n"
					+ "}")
			.when()
				.post("http://localhost:3000/posts/")
		.then()
			.log().all();
	}
}
