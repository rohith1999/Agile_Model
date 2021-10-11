[15:12] Mythili G (Guest)
<form action="/SampleSpringMVC/GreetPage" method = "post">

 <B>Enter UserName </B><input type = "text" name = "name" /><br>

 <B>Enter Password </B><input type = "password" name = "pass" /><br> <input type = "submit" value = "submit"/>

</form>

[15:15] Mythili G (Guest)
<% String name = (String) request.getAttribute("name"); %> <%out.println(name); %><br>

${​​​​name}​​​​

${​​​​pass}​​​​

[15:17] Mythili G (Guest)
package controller; import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.servlet.ModelAndView; @Controller

public class Customercontroller {​​​​

    @RequestMapping(value="/LoginForm", method=RequestMethod.GET)

    public  ModelAndView getLoginForm()

    {​​​​

        ModelAndView model = new ModelAndView("loginform");

        return model;

    }​​​​     /*@RequestMapping(value="/GreetPage", method=RequestMethod.POST)

    public ModelAndView submitLoginForm(@RequestParam("name") String name,@RequestParam("pass") String pass)

    {​​​​

        ModelAndView model = new ModelAndView("greetpage");

        System.out.println(name);

        String msg = "Welcome "+name;

        model.addObject("msg",msg);

        return model;

    }​​​​*/

    @RequestMapping(value="/GreetPage", method=RequestMethod.POST)

    public String submitLoginForm1(@RequestParam("name") String name,@RequestParam("pass") String pass,ModelMap map)

    {​​​​

        map.addAttribute("name",name);

        map.addAttribute("pass",pass);

        return "greetpage";

    }​​​​ }​​​​

