package com.green;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Java 메인 메소드에서 Spring 애플리케이션을 부트스트랩(사물의 초기 단계에서 단순 요소로부터 복잡한 체계를 구축하는 과정)하고 실행하는 데 사용할 수 있는 클래스입니다. 
//기본적으로 클래스는 애플리케이션을 부트스트랩하기 위해 다음 단계를 수행합니다.
//• 적절한 ApplicationContext 인스턴스를 생성합니다(클래스 경로에 따라 다름).
//•CommandLinePropertySource를 등록하여 명령줄 인수를 Spring 속성으로 노출합니다.
//•애플리케이션 컨텍스트를 새로 고치고 모든 싱글톤 Bean을 로드합니다.
//• CommandLineRunner 빈을 트리거합니다.
//대부분의 경우 정적 run(Class, String []) 메서드를 기본 메서드에서 직접 호출하여 애플리케이션을 부트스트랩할 수 있습니다.

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.AutoConfigurationExcludeFilter;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.TypeExcludeFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.ComponentScan.Filter;



//@Target(ElementType.TYPE)
//@Retention(RetentionPolicy.RUNTIME)
//@Documented
//@Inherited

//@SpringBootConfiguration
//클래스가 Spring Boot 애플리케이션 @Configuration을 제공함을 나타냅니다. 구성을 자동으로(예: 테스트에서) 찾을 수 있도록 Spring의 표준 
//@Configuration 주석에 대한 대안으로 사용할 수 있습니다.


//@EnableAutoConfiguration
//Spring 애플리케이션 컨텍스트의 자동 구성을 활성화하여 필요할 것 같은 Bean을 추측하고 구성합니다. 
//자동 구성 클래스는 일반적으로 클래스 경로와 정의한 Bean을 기반으로 적용됩니다. 


//@ComponentScan(excludeFilters = { @Filter(type = FilterType.CUSTOM, classes = TypeExcludeFilter.class),
//		@Filter(type = FilterType.CUSTOM, classes = AutoConfigurationExcludeFilter.class) })

@SpringBootApplication
//@ComponentScan( basePackages = {"com.green", "com.hi"})
public class Chapter01Application {

	public static void main(String[] args) {
		SpringApplication.run(Chapter01Application.class, args);
		
//		SpringApplication application=new SpringApplication(Chapter01Application.class);
//		
//		application.setWebApplicationType(WebApplicationType.NONE);
//		application.run(args);
		
	}

}
