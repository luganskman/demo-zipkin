package com.example;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import zipkin.server.EnableZipkinServer;

import java.util.Properties;

@SpringBootApplication
//@EnableZipkinStreamServer
@EnableZipkinServer
public class DemoZipkinApplication {

	public static void main(String[] args) {

//		final URI rabbitMqUrl;
//		try {
//			rabbitMqUrl = new URI(getEnvOrThrow("CLOUDAMQP_URL"));
//		} catch (URISyntaxException e) {
//			throw new RuntimeException(e);
//		}

		//mysql://tpcnrof9go2i14vu:qs7prn6kb39b6yon@gmgcjwawatv599gq.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/ttrqmcysjjzighx2
		Properties properties = new Properties();
		properties.setProperty("spring.datasource.url","jdbc:mysql://gmgcjwawatv599gq.cbetxkdyhwsb.us-east-1.rds.amazonaws.com:3306/ttrqmcysjjzighx2");
		properties.setProperty("spring.datasource.username","tpcnrof9go2i14vu");
		properties.setProperty("spring.datasource.password","qs7prn6kb39b6yon");
//		properties.setProperty("spring.rabbitmq.host",rabbitMqUrl.getHost());
//		properties.setProperty("spring.rabbitmq.port",String.valueOf(rabbitMqUrl.getPort()));
//		properties.setProperty("spring.rabbitmq.username",rabbitMqUrl.getUserInfo().split(":")[0]);
//		properties.setProperty("spring.rabbitmq.password",rabbitMqUrl.getUserInfo().split(":")[1]);
		new SpringApplicationBuilder(DemoZipkinApplication.class).properties(properties).run(args);
	}
//
//		private static String getEnvOrThrow(String name) {
//		final String env = getenv(name);
//		if (env == null) {
//			throw new IllegalStateException("Environment variable [" + name + "] is not set.");
//		}
//		return env;
//	}
}
