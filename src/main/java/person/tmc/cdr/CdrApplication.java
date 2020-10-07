package person.tmc.cdr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("person.tmc.cdr.dao")
public class CdrApplication {

    public static void main(String[] args) {
        SpringApplication.run(CdrApplication.class, args);
    }

}
