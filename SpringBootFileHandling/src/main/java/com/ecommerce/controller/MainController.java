package com.ecommerce.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MainController {
	@RequestMapping("/")
	public String index() {
		return "index.html";
	}

	@RequestMapping(value = "/upload", method = RequestMethod.POST, consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String upload(@RequestParam("file") MultipartFile file) {

		try {
			File fileObj = new File("src/main/resources/static/new" + file.getOriginalFilename());
			fileObj.createNewFile();
			FileOutputStream fout = new FileOutputStream(fileObj);
			fout.write(file.getBytes());
			fout.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "result.html";
	}

	@RequestMapping(value = "/download", method = RequestMethod.GET)
	public ResponseEntity<Object> downloadFile() throws IOException {
		Path path = Paths.get("src/main/resources/static/dump.txt");
		System.out.println(path);
		Resource resource = null;
		try {
			resource = new UrlResource(path.toUri());
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return ResponseEntity.ok().contentType(MediaType.asMediaType(MediaType.parseMediaType("application/txt")))
				.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + resource.getFilename() + "\"")
				.body(resource);
	}

}
