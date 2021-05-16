import org.json.simple.JSONObject;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class ApiUnitTesting {

	@Test
    public void testingpost() {
        JSONObject post = new JSONObject();

        post.put("name", "Kevin");
        post.put("job", "Barista");

        System.out.println(post.toJSONString());

        given().
                body(post.toJSONString()).
        when().
                post ("https://reqres.in/api/users").
        then().
            statusCode(201);
    }
	
	

}
