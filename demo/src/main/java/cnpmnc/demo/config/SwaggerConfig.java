package cnpmnc.demo.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("📘 Online Exam Platform API")
                        .description("API mô tả hệ thống làm bài thi trực tuyến: quản lý người dùng, bài thi, và kết quả.")
                        .version("1.0.0")
                        .contact(new Contact()
                                .name("Team OnlineExam")
                                .email("support@onlineexam.com")
                                .url("https://onlineexam.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")));
    }
}
