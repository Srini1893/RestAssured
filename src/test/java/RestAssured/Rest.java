package RestAssured;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import POJO.AddPlace;
import POJO.AddPlaceResp;
import POJO.Location;

public class Rest {
	
	public static AddPlace place;

	public static void main(String[] args) {
		
		//RestAssured.baseURI = "https://rahulshettyacademy.com";
		
        RequestSpecBuilder builder = new RequestSpecBuilder();
		
		builder.setBaseUri("https://rahulshettyacademy.com");
		builder.addQueryParam("key", "qaclick123");
		builder.addHeader("Content-Type", "application/json");
		RequestSpecification req = builder.build();
		
		QueryableRequestSpecification queryable = SpecificationQuerier.query(req);
		String headerValue = queryable.getHeaders().getValue("Content-Type");
		String BaseUri = queryable.getBaseUri();
		Map<String, String> param = queryable.getQueryParams();
		System.out.println(headerValue);
		System.out.println(param);
		System.out.println(BaseUri);
		
		place = new AddPlace();
		place.setAccuracy(50);
		place.setName("Frontline house");
		place.setAddress("29, side layout, cohen 09");
		place.setLanguage("Tamil");
		place.setPhone_number("8148726515");
		place.setWebsite("http://google.com");
		
		List<String> list = new ArrayList<String>();
		list.add("shoe park");
		list.add("shop");
		place.setTypes(list);
		
		Location loc = new Location();
		loc.setLat(-38.383494);
		loc.setLng(33.427362);
		
		
		place.setLocation(loc);
			
		AddPlaceResp APresp = given().log().parameters().spec(req).body(place)
		.when().post("maps/api/place/add/json").as(AddPlaceResp.class);
		
		String PlaceId = APresp.getPlace_id();
		System.out.println(PlaceId);
		
		
		
		

		
		
		
		// place = given().log().all().queryParam("place_id", PlaceId).queryParam("key", "qaclick123").header("Content-Type", "application/json")
		//   .when().get("maps/api/place/get/json").as(AddPlace.class);
		
		
		  
		  
		//  System.out.println(place.getAccuracy());
		 
		 
		
		

	}

}
