package zhangww.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/spring")
public class SpringTest {
	
	@RequestMapping(value="/beybey")
	public String toBey(){
		System.out.println("zhangwenwen");
		return "/resources/beybey.jsp" ;
	}
	
}
