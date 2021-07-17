package com.toulatek.assime.cucumber;

import com.toulatek.assime.AssimeApp;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.web.WebAppConfiguration;

@CucumberContextConfiguration
@SpringBootTest(classes = AssimeApp.class)
@WebAppConfiguration
public class CucumberTestContextConfiguration {}
