package com.techelevator.fbn.controller;

import java.time.LocalDate;

import javax.servlet.http.HttpSession;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.fbn.model.CheckingAccountApplication;

@Controller
@RequestMapping("/checkingApplication")
public class CheckingApplicationController {

	private static final String APPLICATION_SESSION_KEY = "customerApplication";
	@RequestMapping(path = { "/", "/personalInformationInput" }, method = RequestMethod.GET)
	public String displayPersonalInformationInput() {
		return "checkingApplication/personalInformationInput";
	}
	@RequestMapping(path = { "/", "/personalInformationInput" }, method = RequestMethod.POST)
	public String postPersonalInformationInput(@RequestParam String firstName, @RequestParam String lastName,
											   @DateTimeFormat(pattern = "MM/dd/yyyy") @RequestParam LocalDate dateOfBirth,
											   @RequestParam String stateOfBirth, @RequestParam String emailAddress, @RequestParam String phoneNumber,
											   HttpSession session) {
		CheckingAccountApplication application = new CheckingAccountApplication();
		application.setFirstName(firstName);
		application.setLastName(lastName);
		application.setDateOfBirth(dateOfBirth);
		application.setStateOfBirth(stateOfBirth);
		application.setEmailAddress(emailAddress);
		application.setPhoneNumber(phoneNumber);
		session.setAttribute(APPLICATION_SESSION_KEY,application);
		return "redirect:/checkingApplication/addressInput";
	}

	//addressInput
	@RequestMapping(path = "/addressInput", method = RequestMethod.GET)
	public String getAddressInput() {
		//just get info
		return "checkingApplication/addressInput";
	}
	@RequestMapping(path = "/addressInput", method = RequestMethod.POST)
	public String postAddressInput(@RequestParam String streetAddress, @RequestParam String apartmentNumber,
								   @RequestParam String city, @RequestParam String state, @RequestParam String zipCode,
								   HttpSession session) {
		//save the info to the session and redirect to the summary
		CheckingAccountApplication application = (CheckingAccountApplication)session.getAttribute(APPLICATION_SESSION_KEY);
		application.setAddressStreet(streetAddress);
		application.setAddressApartment(apartmentNumber);
		application.setAddressCity(city);
		application.setAddressState(state);
		application.setAddressZip(zipCode);

		return "redirect:/checkingApplication/summary";
	}

	//summary
	@RequestMapping(path = "/summary", method = RequestMethod.GET)
	public String getSummary() {
		//redirect to get more info
		return "checkingApplication/summary";
	}

	@RequestMapping(path = "/summary", method = RequestMethod.POST)
	public String postSummary() {
		//redirect to get more info
		return "redirect:/checkingApplication/thankYou";
	}
	//thankYou
	@RequestMapping(path = "/thankYou", method = RequestMethod.GET)
	public String getThankYou() {
		//redirect to get more info
		return "checkingApplication/thankYou";
	}

	/* 1) 
	 * - Create a POST mapping to /personalInformationInput
	 * - Account for all the fields on the originating form.
	 * - Bring in a HttpSession object
	 * - Instantiate an object of CheckingAccountApplication with
	 * the incoming form data.
	 * - Add the instance of CheckingAccountApplication to the 
	 * HttpSession object.
	 * - Redirect to /checkingApplication/addressInput
	 */
	
	/*2)
	 * - Send the user to addressInput.jsp
	 */

	/*3)
	 * - Create an a POST mapping to /addressInput
	 * - Account for all the fields on the originating form.
	 * - Instantiate an object of CheckingAccountApplication with
	 * the incoming form data.
	 * - Bring in a HttpSession object
	 * - Extract the existing CheckingAccountApplication session data
	 * - Set the address data into the CheckingAccountApplication object. 
	 * - Redirect to redirect:/checkingApplication/summary
	 */

	/* 4)
	 * Send the user to summary.jsp
	 */

	/* 5)
	 * - Create an a POST mapping to /completeApplication
	 * - Bring in a HttpSession object
	 * - Extract the existing CheckingAccountApplication session data
	 * - Redirect the user to /checkingApplication/thankYou
	 */

	/* 6)
	 * - Send the user to thankYou.jsp
	 */
}
