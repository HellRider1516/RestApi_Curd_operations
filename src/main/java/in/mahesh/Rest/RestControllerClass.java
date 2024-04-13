package in.mahesh.Rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.mahesh.customer.Customer;

@RestController
public class RestControllerClass {
	
	@GetMapping(value="/welcome/{name}", produces = "text/plain")
	public ResponseEntity<String> getMsg(@PathVariable String name){
		String msg=name+",Welcome to My world.....";
		return new ResponseEntity<>(msg,HttpStatus.OK);
	}
	
	@GetMapping(value="/customer",produces = "application/json")
	public ResponseEntity<List<Customer>> getCustomer(){
		Customer c1 = new Customer(1, "Rajesh", "Rajesh@gmail.com");
		Customer c2 = new Customer(2, "Kodi", "kodi@gmail.com");
		Customer c3 = new Customer(3, "sathi", "sathi@gmail.com");
		List<Customer> list = Arrays.asList(c1,c2,c3);
		return new ResponseEntity<List<Customer>>(list, HttpStatus.OK);
		
	}
	
	
	
	

}
