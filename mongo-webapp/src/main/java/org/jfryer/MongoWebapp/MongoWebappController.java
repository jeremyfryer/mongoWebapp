package org.jfryer.MongoWebapp;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jfryer.MongoDAO.MongoDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.util.DBObjectUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mongodb.DBObject;

@Controller
public class MongoWebappController {
	
	static Logger logger = LoggerFactory.getLogger(MongoWebappController.class);
	
	@RequestMapping("/welcome")
	public String welcome(ModelMap model){
		model.addAttribute("message", "Hello Freemarker world!");
		return "index";
	}
	
	@RequestMapping("/mongo")
	public String mongo(ModelMap model) throws UnknownHostException{
		
		DBObject student = MongoDAO.getOneStudent();
		
		model.addAttribute("name",student.get("name"));
		List<DBObject> scores = (List<DBObject>) student.get("scores");
		List<Map> scoresList = new ArrayList<Map>();
		for (DBObject score : scores) {
			scoresList.add(score.toMap());
		}
		model.addAttribute("scores",scoresList);
		
		return "mongo";
	}

}
