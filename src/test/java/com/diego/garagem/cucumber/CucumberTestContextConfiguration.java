package com.diego.garagem.cucumber;

import com.diego.garagem.GaragemApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = GaragemApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
