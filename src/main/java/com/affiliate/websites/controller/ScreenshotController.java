package com.affiliate.websites.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.affiliate.websites.service.image.ImageService;

@RestController
public class ScreenshotController {

	@Autowired
	private ImageService imageService;

	@RequestMapping(value = "/screenshot", method = RequestMethod.GET)
	public void getScreenshot() throws InterruptedException, IOException {
		List<String> urls = new ArrayList<>();
		urls.add("http://www.gsp.ro");
		urls.add("http://www.prosport.ro");
		urls.add("http://www.hotnews.ro");
		urls.add("http://www.mediafax.ro");
		urls.add("http://www.medlife.ro");

		for (String url : urls) {
			String fileName = createFileNameFrom(url);
			imageService.takeScreenshotOf(url, fileName);
		}
	}

	private String createFileNameFrom(String url) {
		return url.replace("http://www.", "");
	}

}
