package validation;
import static io.restassured.RestAssured.*;

public class ReadArepro {
	@Test
	public void getRepro() {
		when()
		.get("https://api.github.com/repos/javaandselenium/wsao1advance")
		.then().log().all();
	}

}
