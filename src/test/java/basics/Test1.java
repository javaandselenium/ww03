package basics;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class Test1 {
@Test
public void demo() {
	Response resp = RestAssured.get("http://localhost:3000/posts");
	ValidatableResponse respval = resp.then();
	respval.log().all();
}
}
