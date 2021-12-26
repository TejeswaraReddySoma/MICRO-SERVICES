package in.ashokit.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ashokit.client.GreetClient;

@RestController
public class WelcomeRestController {

	@Autowired
	private GreetClient greetClient;

	@GetMapping("/welcome")
	public String welcome() {
		String welcomeMsg = "Welcome to Ashok IT..!!";

		String greetMsg = greetClient.invokeGreetApi();

		return greetMsg + " " + welcomeMsg;
	}
}
