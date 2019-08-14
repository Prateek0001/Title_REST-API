package org.tact.base.rest;

import java.util.LinkedHashMap;
import java.util.Map;
import java.io.IOException;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class BaseController {
	
    @RequestMapping(value = "", method = RequestMethod.GET)
    public <T> T listUsers()throws IOException {
    	
    	
    	Document doc = Jsoup.connect("http://kavita-ganesan.com").get();  
        String title = doc.title();  
          
		
        Map<String, Object> map = new LinkedHashMap<String, Object>();
        map.put("title",title);
       
        
        return (T) map;
    }
}
