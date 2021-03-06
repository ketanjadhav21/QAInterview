package AssignmentNBC.tests;

import static com.jayway.restassured.RestAssured.given;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hamcrest.Matchers;
import org.json.JSONArray;
	import org.json.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.gson.JsonArray;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.path.json.JsonPath;
import com.jayway.restassured.response.Response;

public class NBCTest  {
	
	final static String ROOT_URI = "https://reqres.in";

	@Test(description="This returns single user")
	public void getSingleUser(){
		Response res=given().
				contentType("application/json").header("Accept","application/json").
				when().then().statusCode(200).
				get(ROOT_URI+ "/api/users/2");
				System.out.println(res.getBody().asString());
				System.out.println(res.getStatusCode());
				
				String str = res.getBody().asString();
				JSONObject json = new JSONObject(str);
				String data = json.get("data").toString();
				JSONObject firstName = new JSONObject(data);
				String fname = firstName.get("first_name").toString();
				Assert.assertEquals(fname, "Janet");
				System.out.println(fname);
	}
	
	@Test(description="This returns multiple users")
	public void getMultipleUsers(){
		Response res=given().
				contentType("application/json").header("Accept","application/json").
				when().then().statusCode(200).
				get(ROOT_URI+ "/api/unknown");
				String output = res.getBody().asString();
				JSONObject jObj = new JSONObject(output);
				String total = jObj.get("total").toString();
//				List<String> dataSet = new ArrayList<String>();
//				List<String> dataSet = new ArrayList<String>();
//				dataSet = jObj.get(data).toString();
				String data = jObj.get("data").toString();
				JsonPath jsonPath = new JsonPath(data);	
				String second = jsonPath.getString("year[2]");
				List<String> dataSet = res.jsonPath().getList("data");
			

				

				
//				String total = res

				System.out.println(output);
				System.out.println(total);
				System.out.println(data);
				System.out.println(second);
//				System.out.println(dataSet.get(0).toString());
//				JSONObject jsonObj = new JSONObject(data);
//				String total = jsonObj.get("data").toString();
//				System.out.println(total);
//			
				
				
	}
	
	@Test(description="This test verifies that even if the limit is more than the maximum count, the response returns only the available objects")
	public void testNBC_maxcount(){
		int maxlimitval = 100 ;
		Response res=given().
				param("api_key", "DEMO_KEY").
				param("limit",maxlimitval).
				contentType("application/json").header("Accept","application/json").
				when().then().statusCode(200).
				get("https://api.nasa.gov/planetary/sounds");
				System.out.println(res.getBody().asString());
				System.out.println(res.getStatusCode());
				
				String str = res.getBody().asString();
				JSONObject json = new JSONObject(str);
				int count = json.getInt("count");
				Assert.assertEquals(count, 64);
				System.out.println(count);
	}
	
	@Test(description="Verify that if the no value is passed to the limit parameter then it throws 500 - Internal Server Error")
	public void testNBC_nullLimit(){
		//int maxlimitval = (Integer) null ;
		Response res=given().
				param("api_key", "DEMO_KEY").
				param("limit", "").
				contentType("application/json").header("Accept","application/json").
				when().then().statusCode(500).
				get("https://api.nasa.gov/planetary/sounds");
				System.out.println(res.getBody().asString());
				System.out.println(res.getStatusCode());
				
				//No need of parsing since we are not getting json response because status code is 500
	}
	
	
	@Test(description="Verify that if the garbage value is passed to the limit parameter then it throws 500 - Internal Server Error")
	public void testNBC_garbageLimitVal(){
		String maxlimitval = "abc" ;
		Response res=given().
				param("api_key", "DEMO_KEY").
				param("limit", maxlimitval).
				contentType("application/json").header("Accept","application/json").
				when().then().statusCode(500).
				get("https://api.nasa.gov/planetary/sounds");
				System.out.println(res.getBody().asString());
				System.out.println(res.getStatusCode());
				
				//No need of parsing since we are not getting json response because status code is 500
	}
	
	@Test(description="This test verifies that when no api key is passed, we get 403 status code")
	public void testNBC_no_apikey(){
		int maxlimitval = 10 ;		//String apikey = "";
		Response res=given().
				param("api_key", "").
				param("limit", maxlimitval).
				contentType("application/json").header("Accept","application/json").
				when().then().statusCode(403).
				get("https://api.nasa.gov/planetary/sounds");
				System.out.println(res.getBody().asString());
				System.out.println(res.getStatusCode());
				
				
				JsonPath js = new JsonPath(res.asString());
				
				String code = js.getString("error.code");
				
				Assert.assertEquals(code, "API_KEY_MISSING");
	}
	
	@Test(description="This test verifies that when invalid api key is passed, we get 403 status code with invalid key message")
	public void testNBC_invalid_apikey(){
		int maxlimitval = 10 ;		//String apikey = "";
		Response res=given().
				param("api_key", "demo").
				param("limit", maxlimitval).
				contentType("application/json").header("Accept","application/json").
				when().then().statusCode(403).
				get("https://api.nasa.gov/planetary/sounds");
				System.out.println(res.getBody().asString());
				System.out.println(res.getStatusCode());
				
				JsonPath js = new JsonPath(res.asString());
				
				String code = js.getString("error.code");
				
				Assert.assertEquals(code, "API_KEY_INVALID");
	}
	
	@Test(description="This test verifies that when wron URI is provided, we get response status code as 404(Removing 'sounds' from the url)")
	public void testNBC_wrongUrl(){
		int maxlimitval = 10;
		Response res=given().
				param("api_key", "DEMO_KEY").
				param("limit",maxlimitval).
				contentType("application/json").header("Accept","application/json").
				when().then().statusCode(404).
				get("https://api.nasa.gov/planetary");
				System.out.println(res.getBody().asString());
				System.out.println(res.getStatusCode());
				
				//We do not need since we are getting 404
	}
	
	@Test(description="This test verifies that value of the field member from any object is as expected")
	public void testNBC_verifyResponseFields(){
		int maxlimitval = 20;
		Response res=given().
				param("api_key", "DEMO_KEY").
				param("limit",maxlimitval).
				contentType("application/json").header("Accept","application/json").
				when().then().statusCode(200).
				get("https://api.nasa.gov/planetary/sounds");
				System.out.println(res.getBody().asString());
				System.out.println(res.getStatusCode());
				
				String str = res.getBody().asString();
				JSONObject json = new JSONObject(str);
				JSONArray results = json.getJSONArray("results");
				String title = results.getJSONObject(1).getString("description");
				Assert.assertEquals(title, "Courtesy of United Launch Alliance");

				
	}
	
	@Test(description="This test verifies that when query q is passed with value of any field member, it returns object for that field")
	public void testNBC_queryVerification(){
		int maxlimitval = 20;
		Response res=given().
				param("api_key", "DEMO_KEY").
				param("limit",maxlimitval).
				param("q","Delta IV: Launch").
				contentType("application/json").header("Accept","application/json").
				when().then().statusCode(200).
				get("https://api.nasa.gov/planetary/sounds");
				System.out.println(res.getBody().asString());
				System.out.println(res.getStatusCode());
				
				//Here, response should return the object which contains 'Delta IV: Launch' as field member. 
				// But, we get the full body as response, which is the bug in this API.
	}
	
	
	@Test(description="This test verifies that when query q is passed with value of any field member, it returns object for that field")
	public void testNBC_POST(){
		int maxlimitval = 20;
		Map<String,String> car = new HashMap<>();
		car.put("plateNumber", "xyx1111");
		car.put("brand", "audi");
		car.put("colour", "red");
		Response res= given().
				param("api_key", "DEMO_KEY").
				param("limit",maxlimitval).
				param("q","Delta IV: Launch").
				contentType("application/json").header("Accept","application/json").body(car).
				when().then().statusCode(200).post
				("https://api.nasa.gov/planetary/sounds");
				System.out.println(res.getBody().asString());
				System.out.println(res.getStatusCode());
	}
				
				//Here, response should return the object which contains 'Delta IV: Launch' as field member. 
				// But, we get the full body as response, which is the bug in this API.

				
				//POST Call
	@Test
	public void post_test() {
		Response response = given().
				contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body("{\"name\": \"Lisa\",\"salary\": \"2000\"}")
				.when()
				.post(ROOT_URI + "/create");
		System.out.println("POST Response\n" + response.asString());
		// tests
		response.then().body("id", Matchers.any(Integer.class));
		response.then().body("name", Matchers.is("Lisa"));
	}


	//PUT Call
	@Test
	public void put_test() {
		Response response = given()
				.contentType(ContentType.JSON)
				.accept(ContentType.JSON)
				.body("{\"name\": \"Lisa Tamaki\",\"salary\": \"20000\"}")
				.when()
				.put(ROOT_URI + "/update/3");
		System.out.println("PUT Response\n" + response.asString());
		// tests
		response.then().body("id", Matchers.is(3));
		response.then().body("name", Matchers.is("Lisa Tamaki"));
		response.then().body("salary", Matchers.is("20000"));
	}
	
	//DELETE Call
	@Test
	public void delete_test() {
		Response response = given().delete(ROOT_URI + "/delete/3");
		System.out.println(response.asString());
		System.out.println(response.getStatusCode());
		// check if id=3 is deleted
		response = given().get(ROOT_URI + "/list");
		System.out.println(response.asString());
		response.then().body("id", Matchers.not(3));
	}

}
