package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

/**
 * Created by lvjian on 2017/3/31.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Springboot2Application.class)
@WebAppConfiguration //开启web上下文测试
public class AddressServiceTest {
    @Autowired
    NewClass newClass;

    @Test
    public void testService() {
        System.err.println(newClass.newMethod());
        System.err.println(newClass.newMethod());
    }

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Test
    public void mvcTest() throws Exception {


        /**
         * 创建springMockMVC 不需要真实的serverlet容器就能够对控制器发送http请求
         */
//        MockMvcBuilders.standaloneSetup();
        MockMvc mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        mockMvc.perform(MockMvcRequestBuilders.put("/person"))
                .andExpect(MockMvcResultMatchers.status().isOk())
//        .andExpect(MockMvcResultMatchers.view().name("readingList"))
//                .andExpect(MockMvcResultMatchers.model().attributeExists("books"))
//                .andExpect(MockMvcResultMatchers.model().attribute("books", Matchers.is(Matchers.empty())))
        ;

    }


    @Test
    public void testSingleController() throws Exception {
        MockMvc mockMvc = MockMvcBuilders.standaloneSetup(new MT()).build();
        mockMvc.perform(get("/hiNew")).andExpect(MockMvcResultMatchers.status().isOk());
    }
}
