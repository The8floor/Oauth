package cn.hist.sunshine.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;  


import java.awt.print.Printable;  
import java.io.IOException;  
  
import javax.servlet.http.HttpServletResponse;  
  
import org.junit.Before;  
import org.junit.Test;  
import org.junit.runner.RunWith;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.http.MediaType;  
import org.springframework.test.context.ContextConfiguration;  
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;  
import org.springframework.test.context.web.WebAppConfiguration;  
import org.springframework.test.web.servlet.MockMvc;  
import org.springframework.test.web.servlet.ResultHandler;  
import org.springframework.test.web.servlet.ResultMatcher;  
import org.springframework.ui.Model;  
import org.springframework.test.context.transaction.TransactionConfiguration;  
import org.springframework.transaction.annotation.Transactional;  
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;  
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;  
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;  
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.context.WebApplicationContext;  

@RunWith(SpringJUnit4ClassRunner.class)  
@WebAppConfiguration  
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/applicationContext.xml","file:src/main/webapp/WEB-INF/spring-mvc/spring-servlet.xml","file:src/main/webapp/WEB-INF/security/security.xml"})  
public class ControllerTest {  
    @Autowired  
    private WebApplicationContext wac;  
    private MockMvc mockMvc;  
    @Before  
    public void setup() {  
        // webAppContextSetup ע�������static import  
        // webAppContextSetup �����WEB�����������fileter ���ǲ������listenCLASS  
        // WebApplicationContext context =  
        // ContextLoader.getCurrentWebApplicationContext();  
        // ����������������Ϸ��� ��ᱨ��ָ��  
        this.mockMvc = webAppContextSetup(this.wac).build();  
    }  
    @Test  
    public void getAccount() throws Exception {  
        mockMvc.perform((get("/oauth/")))  
                .andExpect(status().isOk()).andDo(print());  
    }

 
}  