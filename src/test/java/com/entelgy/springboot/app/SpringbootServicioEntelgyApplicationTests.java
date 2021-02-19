package com.entelgy.springboot.app;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootServicioEntelgyApplicationTests {

	@Autowired
	private TestRestTemplate restTemplate;
	
	
		private String getRootUrl() {
			return "http://localhost:8080";
		}
		
		@Test
		public void test() {
			
			HttpHeaders headers = new HttpHeaders();
			HttpEntity<String> entity = new HttpEntity<String>(null, headers);

			ResponseEntity<String> response = restTemplate.exchange(getRootUrl() + "/entelgy/listar",
					HttpMethod.GET, entity, String.class);
			
			assertNotNull(response.getBody());
		}
 
	

}
