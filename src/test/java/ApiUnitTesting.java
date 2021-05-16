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
	
	@Test
    public void testingpatch() {
        JSONObject post = new JSONObject();

        post.put("name", "Keeva");
        post.put("job", "Barista");

        System.out.println(post.toJSONString());

        given().
                body(post.toJSONString()).
        when().
                patch ("https://reqres.in/api/users/2").
        then().
            statusCode(200);
    }
	
	@Test
    public void testingget() {

        when().
                get ("https://reqres.in/api/users/2").
        then().
            statusCode(200).log().all();
    }

}
