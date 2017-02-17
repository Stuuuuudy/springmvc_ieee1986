package com.ieee1986.board;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model, User user) {
		logger.info("Welcome home! The client locale is {}.", locale);

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);

		// 문자열
		String formattedDate = dateFormat.format(date);
		model.addAttribute("serverTime", formattedDate);

		// 기본자료형
		int count = 5;
		model.addAttribute("count", count);

		// 리스트
		ArrayList<String> listData = new ArrayList<String>();
		listData.add("a");
		listData.add("b");
		listData.add("c");
		model.addAttribute("listData", listData);

		// 맵
		HashMap<String, String> mapData = new HashMap<String, String>();
		mapData.put("key1", "value1");
		mapData.put("key2", "value2");
		mapData.put("key3", "value3");
		model.addAttribute("mapData", mapData);

		// 오브젝트
		user = new User();
		user.setId("userId");
		user.setName("userName");
		model.addAttribute("userData", user);

		return "home";
	}
}

