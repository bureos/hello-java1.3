package controller;  
  
import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import dao.model.User;
import service.IUserService;  
  
@Controller
@RequestMapping("/user")  
public class UserController {  
    @Autowired 
    private IUserService userService;  
    
    @Value("${test.prop}")
    private String testProp;
    
    @Resource
    private TestBean testBean;
      
    @RequestMapping("/showUser")  
    public String toIndex(HttpServletRequest request,Model model){  
        int userId = Integer.parseInt(request.getParameter("id"));  
        User user = this.userService.getUserById(userId);  
        model.addAttribute("user", user);  
        return "showUser";  
    }
    
    @RequestMapping("/test") 
    public void test(HttpServletRequest request, HttpServletResponse response){
    	try {
			response.getWriter().println("test");
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
    
    @RequestMapping("/helloFreeMarker")
    public String helloFreeMarker(Model model) {
        model.addAttribute("name","ITDrago");  
        return "helloFreeMarker";
    }
    
    @RequestMapping("/util-use-bean")
    @ResponseBody
    public String helloutil() {
    	
    	
        return "helloFreeMarker";
    }
} 