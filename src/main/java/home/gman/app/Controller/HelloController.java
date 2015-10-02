package home.gman.app.Controller;

import home.gman.app.Service.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	private Test objTest;

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		objTest.print();
		logger.info("setting");
		return "hello";
	}

	@RequestMapping(value="/test", method = RequestMethod.GET)
	public String testPage(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		objTest.print();
		return "test";
	}
}