package RestAssured;

import static io.restassured.RestAssured.given;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import POJO.amount;
import POJO.transactions;
import POJO.transactionsList;

public class wilfredjson {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		
		transactions trans = new transactions();
		trans.setTransactionIds(123456);
		trans.setTest(3000);
			amount am = new amount();
			am.setCurrency("USD");
			am.setValue(10);
		trans.setAmount(am); 
		
		
		transactionsList tl = new transactionsList();
		tl.getTransactions().add(trans);
	
		
		
		
		given().log().all().body(tl)
		.when().get("")
		.then().assertThat().statusCode(200);
		
	
	}
	
	

}
