package RestAssured;

import java.util.List;

import io.restassured.RestAssured;


import static io.restassured.RestAssured.*;

import POJO.CreateIssue;
import POJO.Issuetype;
import POJO.fieldss;
import POJO.project;
import Payload.payload;
import io.restassured.path.json.JsonPath;

public class Stack01 {

	public static void main(String[] args) {
		
		
		CreateIssue CI = new CreateIssue();
		
			fieldss flds = new fieldss();
		
				project prjct = new project();
				prjct.setKey("RA");
			flds.setProject(prjct);	
				
				
			
			flds.setSummary("Main order flow broken");
			flds.setDescription("Creating my fist bug");
				Issuetype istp = new Issuetype();
				istp.setName("Bug");
			flds.setIssuetype(istp);
		
	CI.setFields(flds);
	
		given().log().all().body(CI)
		.when().get("")
		.then().assertThat().statusCode(200);
	
		
	
		
		
		
		
		

	}

}
