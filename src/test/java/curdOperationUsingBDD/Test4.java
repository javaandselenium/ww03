package curdOperationUsingBDD;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class Test4 {
	@Test
	public void deleteRequest() {
		when()
		.delete("http://localhost:3000/posts/9000000")
		.then().log().all();
		
	}

}
