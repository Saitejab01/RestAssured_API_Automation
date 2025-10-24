package microWebServices_RequestChaining;

import static io.restassured.RestAssured.*;

import java.util.ArrayList;

import org.json.simple.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class nimbblPaymentAggregator {
		public static void main(String[] args) {
			JSONObject jObj = new JSONObject();
			jObj.put("access_key", "access_key_pKx7rWVgVpbXQvq2");
			jObj.put("access_secret", "access_secret_DX3w55VKAkXbx7aB");
			baseURI="https://api.nimbbl.tech";
			Response resp=given()
			.contentType(ContentType.JSON)
			.body(jObj.toJSONString())
			.when()
			.post(baseURI+"/api/v3/generate-token");
			resp.then().assertThat().statusCode(200).log().all();
			String token=resp.jsonPath().get("token");
			
			  ArrayList<String> serialNumbers = new ArrayList<>();
		        serialNumbers.add("SN1001");
		        serialNumbers.add("SN1002");

		        OrderLineItem orderItem = new OrderLineItem(
		            "SKU-001",
		            "Bluetooth Speaker",
		            "Portable wireless speaker",
		            "https://example.com/images/speaker.jpg",
		            1500,
		            "1",
		            "1500",
		            "270",
		            "1770",
		            serialNumbers
		        );

		        ArrayList<OrderLineItem> orderLineItems = new ArrayList<>();
		        orderLineItems.add(orderItem);

		        CreateOrderPOJO order = new CreateOrderPOJO(
		            1,
		            1500,
		            270,
		            1770,
		            new User(
		                "alice@example.com",
		                "Alice",
		                "Smith",
		                "+1",
		                "1234567890"
		            ),
		            new ShippingAddress(
		                "221B Baker Street",
		                "Sherlock Lane",
		                "Next to Museum",
		                "Marylebone",
		                "London",
		                "Greater London",
		                "NW16XE",
		                "Home",
		                "Shipping Address"
		            ),
		            new BillingAddress(
		                "742 Evergreen Terrace",
		                "Main Street",
		                "Near Springfield Park",
		                "West Springfield",
		                "Springfield",
		                "Illinois",
		                "62704",
		                "Office",
		                "Billing Address"
		            ),
		            "INR",
		            "INV-20251018-001",
		            "android_app",
		            "2.3.4",
		            "203.0.113.45",
		            "store.example.com",
		            true,
		            true,
		            orderLineItems,
		            new BankAccount(
		                "987654321000",
		                "Alice Smith",
		                "SBIN0000456"
		            ),
		            new CustomAttributes(
		                "Alice",
		                "Wonderland",
		                "Rabbit",
		                "Teacup"
		            )
		        );
		        
		        given()
		        .header("Authorization", "Bearer "+token)
		        .contentType(ContentType.JSON)
		        .body(jObj)
		        .when()
		        .post(baseURI+"/api/v3/create-order")
		        .then()
		        .log()
		        .all();
		}
}
