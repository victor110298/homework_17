package spring.impls;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Log4j
@Getter
@Setter
@EqualsAndHashCode
public class SimpleUser implements Lyricist {
    private String name;

    @Override
    public String visit() {
        return "Visited Simple User ";
    }

    @PostConstruct
    public void init() {
        log.info("Bean initialized");
    }

    @PreDestroy
    public void destroy() {
        log.info("Bean will be destroyed now");
    }
}
