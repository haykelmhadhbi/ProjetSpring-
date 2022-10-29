package tn.esprit.springproject.config;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.springproject.entites.Departement;
import tn.esprit.springproject.services.IDepartmentService;

@Configuration
public class SpringDocConfig {
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(infoAPI());
    }

    public Info infoAPI() {
        return new Info().title("SpringDoc-Demo")
                .description("TP étude de cas")
                .contact(contactAPI());
    }

    public Contact contactAPI() {
        Contact contact = new Contact().name("Equipe ASI II")
                .email("haykel.mhadhbi@esprit.tn")
                .url("https://www.linkedin.com/in/**********/");

        return contact;
    }
   /*@Bean
    public GroupedOpenApi productPublicApi() {
        return GroupedOpenApi.builder()
                .group("Only Product Management API")
                                .pathsToMatch("/product/**")
                                .pathsToExclude("**")
                                .build();
    }*/
   @Tag(name = "Department")
   @RestController
   @RequestMapping("department")
   public class DepartementController {

       @Autowired
       IDepartmentService departmentService;

       @Operation (description = "Retrieve all department")
       @PostMapping ("/get")
       public Departement AfficherAllDeprtrment(Integer id){
               return departmentService.retrieveDepartment(id) ;
               }
   }
}
