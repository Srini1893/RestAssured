package RestAssured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;

import static io.restassured.RestAssured.*;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import Payload.payload;

public class StringToJsonConvert {

	public static void main(String[] args) {
		
		JsonPath js = new JsonPath(payload.postpayload());
		List<String> packageid=js.get("id");
		System.out.println(packageid.get(5));
		
		JSONArray jsarr = new JSONArray(payload.postpayload());
		
		
		for(int i=0;i<jsarr.length();i++) {
			
			JSONObject jsObj=jsarr.getJSONObject(i);
			System.out.println(jsObj);
		}

	}

}
