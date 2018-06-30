package io.amecodelabs.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import io.amecodelabs.repository.DataRepository;

@WebListener
public class ConfigureApplication implements ServletContextListener {

    public ConfigureApplication() {
        
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce)  { 
         
    }
    
    @Override
    public void contextInitialized(ServletContextEvent sce)  { 
    	System.out.println("Inicializando Application...");
    	DataRepository dataRepository = DataRepository.getRepository();
        sce.getServletContext().setAttribute("dataRepository", dataRepository);
    }
	
}
