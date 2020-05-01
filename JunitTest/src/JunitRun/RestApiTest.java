package JunitRun;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class RestApiTest {
	public static void main(String[]args) {
		
		//RestAssured.baseURI = "http://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=439d4b804bc8187953eb36d2a8c26a02";
		RestAssured.baseURI = "http://parabank.parasoft.com/parabank/services/store-01V2?wsdl";
        Response res = RestAssured.request(Method.GET);		
        System.out.println("Response code = " +res.getStatusCode());
        System.out.println("Body = " +res.getBody().asString());
	}

}
