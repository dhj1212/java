package com.hpi.test.activiti;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.ProcessEngineConfiguration;
import org.activiti.engine.ProcessEngines;
import org.activiti.engine.impl.cfg.StandaloneProcessEngineConfiguration;
import org.junit.Test;

public class TestEngine {

	/**
	 * @param args
	 */
	@Test
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		//ProcessEngine processEngine=ProcessEngines.getDefaultProcessEngine();
		 // 1: 通过资源文件创建 ProcessEngineConfiguration
        //ProcessEngineConfiguration processEngineConfiguration =
        //        ProcessEngineConfiguration.createProcessEngineConfigurationFromResource("activiti.cfg.xml");
        // 2: 通过ProcessEngineConfiguration 构建 ProcessEngine
        //ProcessEngine processEngine = processEngineConfiguration.buildProcessEngine();
       // System.out.println(processEngine);
		//ProcessEngine processEngine = ProcessEngines.getDefaultProcessEngine();
		//必须在配置文件中配置<property name="databaseSchema" value="ACT"/>
//		ProcessEngine processEngine1 = ProcessEngineConfiguration
//	      .createProcessEngineConfigurationFromResourceDefault()
//	      .buildProcessEngine();
		/*ProcessEngine processEngine2 = ProcessEngineConfiguration.createStandaloneInMemProcessEngineConfiguration()
		  .setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_CREATE_DROP)
		  .setJdbcUrl("jdbc:oracle:thin:@localhost:1521:oralin").setJdbcUsername("sboot").setJdbcPassword("sboot").setd
		  .buildProcessEngine();*/
        /**
         * 
         */
       // ProcessEngineConfiguration pec = new StandaloneProcessEngineConfiguration();
        ProcessEngineConfiguration pec = ProcessEngineConfiguration.createStandaloneInMemProcessEngineConfiguration();
        pec.setJdbcDriver("oracle.jdbc.driver.OracleDriver");
        pec.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:oralin");
        pec.setJdbcUsername("sboot");
        pec.setJdbcPassword("sboot");
        pec.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_TRUE);
        
       // pec.setDatabaseSchemaUpdate(ProcessEngineConfiguration.DB_SCHEMA_UPDATE_CREATE_DROP);
        
        pec.setDatabaseTablePrefix("ACT");
        ProcessEngine processEngine=pec.buildProcessEngine();

	}

}
