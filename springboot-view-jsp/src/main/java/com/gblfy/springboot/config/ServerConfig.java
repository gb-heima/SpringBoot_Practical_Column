package com.gblfy.springboot.config;

import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.stereotype.Component;

import java.io.File;

/**
 * @author gblfy
 * @ClassNme ServerConfig
 * @Description TODO
 * @Date 2019/2/21 9:17
 * @version1.0
 */
@Component
public class ServerConfig implements WebServerFactoryCustomizer<ConfigurableServletWebServerFactory> {

    @Override
    public void customize(ConfigurableServletWebServerFactory fatory) {
        fatory.setDocumentRoot(new File("E:\\springboot_workspace\\09-springboot-view-jsp\\src\\main\\webapp\\"));
//      factory.setDocumentRoot(new File("你想指定的位置"));
    }
}
