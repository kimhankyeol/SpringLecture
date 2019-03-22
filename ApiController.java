package poly.controller;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.apache.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApiController {
	private Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping(value="/jsonparse/api")
	public String api() throws Exception{
		log.info("api start"+this.getClass());
		BufferedReader br = null;
		try {
			String urlStr ="http://apis.data.go.kr/B553077/api/open/sdsc/storeZoneOne?type=json&key=573&ServiceKey=서비스 인증키";
			URL url = new URL(urlStr);
			HttpURLConnection urlconnection = (HttpURLConnection) url.openConnection();
			urlconnection.setRequestMethod("GET");
			br = new BufferedReader(new InputStreamReader(urlconnection.getInputStream(),"UTF-8"));
			String result = "";
			String line;
			while((line = br.readLine()) !=null){
				result = result+line+"\n";
			}
			System.out.println(result);
			//String 을 Json 으로 
			JSONParser parser = new JSONParser();
			Object obj = parser.parse(result);
			log.info("object");
			log.info(obj);
			JSONObject jsonObj = (JSONObject) obj;
			log.info("jsonobject");
			log.info(jsonObj);
			//결과값 확인 
			log.info("body");
			log.info(jsonObj.get("body"));
			//이런식으로 계층으로 내려가면서 찾아주면됨
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		log.info("api end"+this.getClass());
		return null;
	}
	
}
