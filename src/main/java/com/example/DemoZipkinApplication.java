package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import zipkin.server.EnableZipkinServer;

import java.util.Properties;

@SpringBootApplication
@EnableZipkinServer
public class DemoZipkinApplication {

	public static void main(String[] args) {

		//mysql://tpcnrof9go2i14vu:qs7prn6kb39b6yon@gmgcjwawatv599gq.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/ttrqmcysjjzighx2
		Properties properties = new Properties();
		properties.setProperty("spring.datasource.url","jdbc:mysql://gmgcjwawatv599gq.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/ttrqmcysjjzighx2");
		properties.setProperty("spring.datasource.username","tpcnrof9go2i14vu");
		properties.setProperty("spring.datasource.password","qs7prn6kb39b6yon");
		new SpringApplicationBuilder(DemoZipkinApplication.class).properties(properties).run(args);
	}
}
