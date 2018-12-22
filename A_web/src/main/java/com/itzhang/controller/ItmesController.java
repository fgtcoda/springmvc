package com.itzhang.controller;

import com.itzhang.domian.Items;
import com.itzhang.service.ItemsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("itmes")
public class ItmesController {

    @RequestMapping("findAll")
    public String findAll(String id, HttpServletRequest request){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        ItemsService service = (ItemsService) context.getBean("ItemsServiceImpl");
        Items items = service.findById(Integer.parseInt(id));
        request.getSession().setAttribute("item",items);
        return "itemDetail";
    }
}
