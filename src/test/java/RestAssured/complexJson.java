package RestAssured;

import io.restassured.RestAssured;


import static io.restassured.RestAssured.*;

public class complexJson {

	public static void main(String[] args) {
		
		RestAssured.baseURI = "https://courses.rahulshettyacademy.com";
		
		String resp =given().log().all().header("Content-Type", "application/json")
		.when().log().all().get("courses")
		.then().extract().response().asString();
		
		System.out.println(resp);

	}

}
