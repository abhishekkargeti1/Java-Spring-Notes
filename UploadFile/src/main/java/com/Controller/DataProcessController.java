package com.Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller

public class DataProcessController {

	@RequestMapping(path = "/uploadImage", method = RequestMethod.POST)
	public String getPicture(@RequestParam("uploaded_File") CommonsMultipartFile file, HttpSession session,Model model) {
		System.out.println("Hello I am Picture Handler");
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getStorageDescription());
		byte[] data = file.getBytes();
		String path = session.getServletContext().getRealPath("/") + "WEB-INF" + File.separator + "resources"
				+ File.separator + "images"+File.separator+file.getOriginalFilename();
		System.out.println(path);

		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			System.out.println("File Uploaded Successfully");
			model.addAttribute("Msg","File Uploaded Successfully ");
			model.addAttribute("filename", file.getOriginalFilename());
			} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("ERROR");
			model.addAttribute("Msg","File Not Uploaded Successfully ");
			e.printStackTrace();
		}

		return "success";
	}
}
