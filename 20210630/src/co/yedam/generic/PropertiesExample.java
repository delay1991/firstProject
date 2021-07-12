package co.yedam.generic; 

import java.io.FileReader;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) { // 상대경로
		String path = PropertiesExample.class.getResource("../../db.properties").getPath();
		Properties prop = new Properties();
		try {//db에 url,id,pass를 외부파일 지정하고 쓰기때문에(노출X), 프로그램소스안에 넣으면 환경변수가 바뀌면 불편하니깐...안넣음...
			prop.load(new FileReader(path));
			String id = prop.getProperty("id");
			String name = prop.getProperty("name");
			String pass= prop.getProperty("password"); 
			
			System.out.println(id+","+name+","+pass);
		} catch (Exception e) { // 최상위 예외. 두개를 한번의 예외로처리.
			e.printStackTrace();
		}
	}
}
