package com.ct.contact.controller;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.ct.contact.controller.ViewController;
import com.ct.contact.repository.AddressRepository;
import com.ct.contact.repository.EmployeeRepository;
import com.ct.contact.service.EmployeeService;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

 public class ViewControllerTest {
	 
		@Autowired
	    private MockMvc mockMvc;

	    
	    @InjectMocks
	    private ViewController emc;
	    
	    @Before
	    public void setup()
	    {
	    	MockitoAnnotations.initMocks(this);
	    	mockMvc=MockMvcBuilders.standaloneSetup(emc).build();

	    }
    
    @Test
	public void welcome() throws Exception {
		mockMvc.perform(get("/"))
			.andExpect(status().isOk())
			.andExpect(view().name("index"));
	}
}
