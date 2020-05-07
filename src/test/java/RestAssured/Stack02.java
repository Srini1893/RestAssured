package RestAssured;




import java.util.*;

import io.restassured.path.json.JsonPath;

public class Stack02 {

	public static void main(String[] args) {
		
		JsonPath js = new JsonPath(payload());
		String k =js.get("Books.History.find{it.ISBN=='57'}.name");
		System.out.println(k);
		
		
		
		
		ArrayList<ArrayList<String>>  txt =js.get("Books.History.Tags");
		//System.out.println(txt.get(0));
		
		List<String> a =txt.get(0);
		System.out.println(a.get(0));
		System.out.println(a.get(1));
		List<String> b =txt.get(1);
		System.out.println(b.get(0));
		System.out.println(b.get(1));
		System.out.println();
		
		int count =0;
		for(int i=0;i<txt.size();i++) {
			ArrayList<String> ks=txt.get(i);
			for(int j=0;j<ks.size();j++) {
				String value =ks.get(j);
				System.out.println(value);
				if(value.equals("Indian")) {
					count++;
				}
			}
		}
		System.out.println(count);
		
		
		
		
	
	}

	
	
	public static String payload() {
		return "{ \"Books\":{  \r\n" + 
				"      \"History\":[  \r\n" + 
				"         {  \r\n" + 
				"            \"badge\":\"y\",\r\n" + 
				"            \"Tags\":[  \r\n" + 
				"               \"Indian\",\"Culture\"\r\n" + 
				"            ],\r\n" + 
				"            \"ISBN\":\"56\",\r\n" + 
				"            \"id\":1,\r\n" + 
				"            \"name\":\"Cultures in India\"\r\n" + 
				"         },\r\n" + 
				"         {  \r\n" + 
				"            \"badge\":\"y\",\r\n" + 
				"            \"Tags\":[  \r\n" + 
				"               \"Pre-historic\",\"Creatures\"\r\n" + 
				"            ],\r\n" + 
				"            \"ISBN\":\"57\",\r\n" + 
				"            \"id\":1,\r\n" + 
				"            \"name\":\"Pre-historic Ages\"\r\n" + 
				"         }\r\n" + 
				"     ]\r\n" + 
				"  }\r\n" + 
				"}";
	}

}
