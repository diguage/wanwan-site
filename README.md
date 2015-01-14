# Wanwan Site

用于调试错误的项目。

## 遇到的错误

### 开始遇到的错误在这里：

[Spring+MyBATIS循环依赖问题，求指点](https://github.com/springside/springside4/issues/437)

### 现在的错误

```java
/Library/Java/JavaVirtualMachines/jdk1.7.0_72.jdk/Contents/Home/bin/java -agentlib:jdwp=transport=dt_socket,address=127.0.0.1:53164,suspend=y,server=n -Dmaven.home=/Users/diguage/develop/tools/apache-maven-3.2.3 -Dclassworlds.conf=/Users/diguage/develop/tools/apache-maven-3.2.3/bin/m2.conf -Dfile.encoding=UTF-8 -classpath "/Users/diguage/develop/tools/apache-maven-3.2.3/boot/plexus-classworlds-2.5.1.jar:/Applications/IntelliJ IDEA 14.app/Contents/lib/idea_rt.jar" org.codehaus.classworlds.Launcher -Didea.version=14.0.2 jetty:run
Connected to the target VM, address: '127.0.0.1:53164', transport: 'socket'
[INFO] Scanning for projects...
[INFO]                                                                         
[INFO] ------------------------------------------------------------------------
[INFO] Building Wanwan Site 1.0-SNAPSHOT
[INFO] ------------------------------------------------------------------------
[INFO] 
[INFO] >>> jetty-maven-plugin:7.6.16.v20140903:run (default-cli) > test-compile @ wanwan-site >>>
[INFO] 
[INFO] --- maven-enforcer-plugin:1.3.1:enforce (enforce-banned-dependencies) @ wanwan-site ---
[INFO] 
[INFO] --- build-helper-maven-plugin:1.8:add-test-source (add-functional-source) @ wanwan-site ---
[INFO] Test Source directory: /Users/diguage/develop/java/Projects/wanwan-site/src/test/functional added.
[INFO] 
[INFO] --- build-helper-maven-plugin:1.8:add-source (add-dao-source) @ wanwan-site ---
[INFO] Source directory: /Users/diguage/develop/java/Projects/wanwan-site/src/main/dao added.
[INFO] 
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ wanwan-site ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 11 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ wanwan-site ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 25 source files to /Users/diguage/develop/java/Projects/wanwan-site/target/classes
[WARNING] 未与 -source 1.6 一起设置引导类路径
[INFO] 
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ wanwan-site ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] Copying 8 resources
[INFO] 
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ wanwan-site ---
[INFO] No sources to compile
[INFO] 
[INFO] <<< jetty-maven-plugin:7.6.16.v20140903:run (default-cli) < test-compile @ wanwan-site <<<
[INFO] 
[INFO] --- jetty-maven-plugin:7.6.16.v20140903:run (default-cli) @ wanwan-site ---
[INFO] Configuring Jetty for project: Wanwan Site
[INFO] webAppSourceDirectory not set. Defaulting to /Users/diguage/develop/java/Projects/wanwan-site/src/main/webapp
[INFO] Reload Mechanic: automatic
[INFO] Classes = /Users/diguage/develop/java/Projects/wanwan-site/target/classes
[INFO] Context path = /wanwan-site
[INFO] Tmp directory = /Users/diguage/develop/java/Projects/wanwan-site/target/tmp
[INFO] Web defaults = org/eclipse/jetty/webapp/webdefault.xml
[INFO] Web overrides =  none
[INFO] web.xml file = file:/Users/diguage/develop/java/Projects/wanwan-site/src/main/webapp/WEB-INF/web.xml
[INFO] Webapp directory = /Users/diguage/develop/java/Projects/wanwan-site/src/main/webapp
2015-01-14 08:19:31.016:INFO:oejs.Server:jetty-7.6.16.v20140903
2015-01-14 08:19:31.717:INFO:oejpw.PlusConfiguration:No Transaction manager found - if your webapp requires one, please configure one.
2015-01-14 08:19:32.258:INFO:/wanwan-site:Initializing Spring root WebApplicationContext
08:19:32.259 [main] INFO  org.springframework.web.context.ContextLoader - Root WebApplicationContext: initialization started
08:19:32.322 [main] DEBUG org.springframework.web.context.support.StandardServletEnvironment - Adding [servletConfigInitParams] PropertySource with lowest search precedence
08:19:32.322 [main] DEBUG org.springframework.web.context.support.StandardServletEnvironment - Adding [servletContextInitParams] PropertySource with lowest search precedence
08:19:32.324 [main] DEBUG org.springframework.web.context.support.StandardServletEnvironment - Adding [jndiProperties] PropertySource with lowest search precedence
08:19:32.325 [main] DEBUG org.springframework.web.context.support.StandardServletEnvironment - Adding [systemProperties] PropertySource with lowest search precedence
08:19:32.326 [main] DEBUG org.springframework.web.context.support.StandardServletEnvironment - Adding [systemEnvironment] PropertySource with lowest search precedence
08:19:32.326 [main] DEBUG org.springframework.web.context.support.StandardServletEnvironment - Initialized StandardServletEnvironment with PropertySources [servletConfigInitParams,servletContextInitParams,jndiProperties,systemProperties,systemEnvironment]
08:19:32.331 [main] DEBUG org.springframework.web.context.support.StandardServletEnvironment - Replacing [servletContextInitParams] PropertySource with [servletContextInitParams]
08:19:32.331 [main] INFO  org.springframework.web.context.support.XmlWebApplicationContext - Refreshing Root WebApplicationContext: startup date [Wed Jan 14 08:19:32 CST 2015]; root of context hierarchy
08:19:32.365 [main] DEBUG org.springframework.core.env.StandardEnvironment - Adding [systemProperties] PropertySource with lowest search precedence
08:19:32.365 [main] DEBUG org.springframework.core.env.StandardEnvironment - Adding [systemEnvironment] PropertySource with lowest search precedence
08:19:32.365 [main] DEBUG org.springframework.core.env.StandardEnvironment - Initialized StandardEnvironment with PropertySources [systemProperties,systemEnvironment]
08:19:32.373 [main] INFO  org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loading XML bean definitions from URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]
08:19:32.377 [main] DEBUG org.springframework.beans.factory.xml.DefaultDocumentLoader - Using JAXP provider [com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl]
08:19:32.410 [main] DEBUG org.springframework.beans.factory.xml.PluggableSchemaResolver - Loading schema mappings from [META-INF/spring.schemas]
08:19:32.412 [main] DEBUG org.springframework.beans.factory.xml.PluggableSchemaResolver - Loaded schema mappings: {http://www.springframework.org/schema/tx/spring-tx-2.5.xsd=org/springframework/transaction/config/spring-tx-2.5.xsd, http://www.springframework.org/schema/context/spring-context-3.1.xsd=org/springframework/context/config/spring-context-3.1.xsd, http://www.springframework.org/schema/util/spring-util-3.0.xsd=org/springframework/beans/factory/xml/spring-util-3.0.xsd, http://www.springframework.org/schema/aop/spring-aop-3.2.xsd=org/springframework/aop/config/spring-aop-3.2.xsd, http://www.springframework.org/schema/tool/spring-tool.xsd=org/springframework/beans/factory/xml/spring-tool-4.0.xsd, http://mybatis.org/schema/mybatis-spring-1.2.xsd=org/mybatis/spring/config/mybatis-spring-1.2.xsd, http://www.springframework.org/schema/context/spring-context-4.0.xsd=org/springframework/context/config/spring-context-4.0.xsd, http://www.springframework.org/schema/mvc/spring-mvc-3.2.xsd=org/springframework/web/servlet/config/spring-mvc-3.2.xsd, http://www.springframework.org/schema/lang/spring-lang-3.2.xsd=org/springframework/scripting/config/spring-lang-3.2.xsd, http://www.springframework.org/schema/cache/spring-cache-3.2.xsd=org/springframework/cache/config/spring-cache-3.2.xsd, http://www.springframework.org/schema/jdbc/spring-jdbc-3.1.xsd=org/springframework/jdbc/config/spring-jdbc-3.1.xsd, http://www.springframework.org/schema/util/spring-util-2.0.xsd=org/springframework/beans/factory/xml/spring-util-2.0.xsd, http://www.springframework.org/schema/tool/spring-tool-3.2.xsd=org/springframework/beans/factory/xml/spring-tool-3.2.xsd, http://www.springframework.org/schema/context/spring-context.xsd=org/springframework/context/config/spring-context-4.0.xsd, http://www.springframework.org/schema/aop/spring-aop-4.0.xsd=org/springframework/aop/config/spring-aop-4.0.xsd, http://www.springframework.org/schema/jee/spring-jee-3.2.xsd=org/springframework/ejb/config/spring-jee-3.2.xsd, http://www.springframework.org/schema/context/spring-context-3.0.xsd=org/springframework/context/config/spring-context-3.0.xsd, http://www.springframework.org/schema/jdbc/spring-jdbc-4.0.xsd=org/springframework/jdbc/config/spring-jdbc-4.0.xsd, http://www.springframework.org/schema/util/spring-util-2.5.xsd=org/springframework/beans/factory/xml/spring-util-2.5.xsd, http://www.springframework.org/schema/mvc/spring-mvc-4.0.xsd=org/springframework/web/servlet/config/spring-mvc-4.0.xsd, http://www.springframework.org/schema/beans/spring-beans-3.2.xsd=org/springframework/beans/factory/xml/spring-beans-3.2.xsd, http://www.springframework.org/schema/aop/spring-aop-3.1.xsd=org/springframework/aop/config/spring-aop-3.1.xsd, http://www.springframework.org/schema/lang/spring-lang-4.0.xsd=org/springframework/scripting/config/spring-lang-4.0.xsd, http://www.springframework.org/schema/mvc/spring-mvc.xsd=org/springframework/web/servlet/config/spring-mvc-4.0.xsd, http://www.springframework.org/schema/mvc/spring-mvc-3.1.xsd=org/springframework/web/servlet/config/spring-mvc-3.1.xsd, http://www.springframework.org/schema/tool/spring-tool-4.0.xsd=org/springframework/beans/factory/xml/spring-tool-4.0.xsd, http://www.springframework.org/schema/lang/spring-lang-3.1.xsd=org/springframework/scripting/config/spring-lang-3.1.xsd, http://www.springframework.org/schema/tx/spring-tx-3.2.xsd=org/springframework/transaction/config/spring-tx-3.2.xsd, http://www.springframework.org/schema/cache/spring-cache-3.1.xsd=org/springframework/cache/config/spring-cache-3.1.xsd, http://www.springframework.org/schema/jee/spring-jee-4.0.xsd=org/springframework/ejb/config/spring-jee-4.0.xsd, http://www.springframework.org/schema/jdbc/spring-jdbc-3.0.xsd=org/springframework/jdbc/config/spring-jdbc-3.0.xsd, http://www.springframework.org/schema/jdbc/spring-jdbc.xsd=org/springframework/jdbc/config/spring-jdbc-4.0.xsd, http://www.springframework.org/schema/tool/spring-tool-3.1.xsd=org/springframework/beans/factory/xml/spring-tool-3.1.xsd, http://www.springframework.org/schema/cache/spring-cache-4.0.xsd=org/springframework/cache/config/spring-cache-4.0.xsd, http://www.springframework.org/schema/jee/spring-jee-3.1.xsd=org/springframework/ejb/config/spring-jee-3.1.xsd, http://www.springframework.org/schema/task/spring-task-3.2.xsd=org/springframework/scheduling/config/spring-task-3.2.xsd, http://www.springframework.org/schema/beans/spring-beans-3.1.xsd=org/springframework/beans/factory/xml/spring-beans-3.1.xsd, http://www.springframework.org/schema/util/spring-util.xsd=org/springframework/beans/factory/xml/spring-util-4.0.xsd, http://www.springframework.org/schema/aop/spring-aop-3.0.xsd=org/springframework/aop/config/spring-aop-3.0.xsd, http://www.springframework.org/schema/mvc/spring-mvc-3.0.xsd=org/springframework/web/servlet/config/spring-mvc-3.0.xsd, http://www.springframework.org/schema/beans/spring-beans-4.0.xsd=org/springframework/beans/factory/xml/spring-beans-4.0.xsd, http://www.springframework.org/schema/beans/spring-beans.xsd=org/springframework/beans/factory/xml/spring-beans-4.0.xsd, http://www.springframework.org/schema/lang/spring-lang-3.0.xsd=org/springframework/scripting/config/spring-lang-3.0.xsd, http://www.springframework.org/schema/tx/spring-tx-3.1.xsd=org/springframework/transaction/config/spring-tx-3.1.xsd, http://mybatis.org/schema/mybatis-spring.xsd=org/mybatis/spring/config/mybatis-spring-1.2.xsd, http://www.springframework.org/schema/context/spring-context-2.5.xsd=org/springframework/context/config/spring-context-2.5.xsd, http://www.springframework.org/schema/task/spring-task-4.0.xsd=org/springframework/scheduling/config/spring-task-4.0.xsd, http://www.springframework.org/schema/tool/spring-tool-3.0.xsd=org/springframework/beans/factory/xml/spring-tool-3.0.xsd, http://www.springframework.org/schema/tx/spring-tx-4.0.xsd=org/springframework/transaction/config/spring-tx-4.0.xsd, http://www.springframework.org/schema/aop/spring-aop-2.0.xsd=org/springframework/aop/config/spring-aop-2.0.xsd, http://www.springframework.org/schema/jee/spring-jee-3.0.xsd=org/springframework/ejb/config/spring-jee-3.0.xsd, http://www.springframework.org/schema/task/spring-task-3.1.xsd=org/springframework/scheduling/config/spring-task-3.1.xsd, http://www.springframework.org/schema/beans/spring-beans-3.0.xsd=org/springframework/beans/factory/xml/spring-beans-3.0.xsd, http://www.springframework.org/schema/jee/spring-jee.xsd=org/springframework/ejb/config/spring-jee-4.0.xsd, http://www.springframework.org/schema/aop/spring-aop-2.5.xsd=org/springframework/aop/config/spring-aop-2.5.xsd, http://www.springframework.org/schema/lang/spring-lang-2.0.xsd=org/springframework/scripting/config/spring-lang-2.0.xsd, http://www.springframework.org/schema/util/spring-util-3.2.xsd=org/springframework/beans/factory/xml/spring-util-3.2.xsd, http://www.springframework.org/schema/task/spring-task.xsd=org/springframework/scheduling/config/spring-task-4.0.xsd, http://www.springframework.org/schema/tool/spring-tool-2.0.xsd=org/springframework/beans/factory/xml/spring-tool-2.0.xsd, http://www.springframework.org/schema/tx/spring-tx-3.0.xsd=org/springframework/transaction/config/spring-tx-3.0.xsd, http://www.springframework.org/schema/lang/spring-lang-2.5.xsd=org/springframework/scripting/config/spring-lang-2.5.xsd, http://www.springframework.org/schema/jee/spring-jee-2.0.xsd=org/springframework/ejb/config/spring-jee-2.0.xsd, http://www.springframework.org/schema/tool/spring-tool-2.5.xsd=org/springframework/beans/factory/xml/spring-tool-2.5.xsd, http://www.springframework.org/schema/jee/spring-jee-2.5.xsd=org/springframework/ejb/config/spring-jee-2.5.xsd, http://www.springframework.org/schema/util/spring-util-4.0.xsd=org/springframework/beans/factory/xml/spring-util-4.0.xsd, http://www.springframework.org/schema/task/spring-task-3.0.xsd=org/springframework/scheduling/config/spring-task-3.0.xsd, http://www.springframework.org/schema/lang/spring-lang.xsd=org/springframework/scripting/config/spring-lang-4.0.xsd, http://www.springframework.org/schema/context/spring-context-3.2.xsd=org/springframework/context/config/spring-context-3.2.xsd, http://www.springframework.org/schema/util/spring-util-3.1.xsd=org/springframework/beans/factory/xml/spring-util-3.1.xsd, http://www.springframework.org/schema/beans/spring-beans-2.0.xsd=org/springframework/beans/factory/xml/spring-beans-2.0.xsd, http://www.springframework.org/schema/cache/spring-cache.xsd=org/springframework/cache/config/spring-cache-4.0.xsd, http://www.springframework.org/schema/tx/spring-tx.xsd=org/springframework/transaction/config/spring-tx-4.0.xsd, http://www.springframework.org/schema/beans/spring-beans-2.5.xsd=org/springframework/beans/factory/xml/spring-beans-2.5.xsd, http://www.springframework.org/schema/tx/spring-tx-2.0.xsd=org/springframework/transaction/config/spring-tx-2.0.xsd, http://www.springframework.org/schema/jdbc/spring-jdbc-3.2.xsd=org/springframework/jdbc/config/spring-jdbc-3.2.xsd, http://www.springframework.org/schema/aop/spring-aop.xsd=org/springframework/aop/config/spring-aop-4.0.xsd}
08:19:32.412 [main] DEBUG org.springframework.beans.factory.xml.PluggableSchemaResolver - Found XML schema [http://www.springframework.org/schema/beans/spring-beans-4.0.xsd] in classpath: org/springframework/beans/factory/xml/spring-beans-4.0.xsd
08:19:32.444 [main] DEBUG org.springframework.beans.factory.xml.PluggableSchemaResolver - Found XML schema [http://www.springframework.org/schema/context/spring-context-4.0.xsd] in classpath: org/springframework/context/config/spring-context-4.0.xsd
08:19:32.449 [main] DEBUG org.springframework.beans.factory.xml.PluggableSchemaResolver - Found XML schema [http://www.springframework.org/schema/tool/spring-tool-4.0.xsd] in classpath: org/springframework/beans/factory/xml/spring-tool-4.0.xsd
08:19:32.457 [main] DEBUG org.springframework.beans.factory.xml.PluggableSchemaResolver - Found XML schema [http://www.springframework.org/schema/tx/spring-tx-4.0.xsd] in classpath: org/springframework/transaction/config/spring-tx-4.0.xsd
08:19:32.466 [main] DEBUG org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader - Loading bean definitions
08:19:32.476 [main] DEBUG org.springframework.beans.factory.xml.DefaultNamespaceHandlerResolver - Loaded NamespaceHandler mappings: {http://www.springframework.org/schema/p=org.springframework.beans.factory.xml.SimplePropertyNamespaceHandler, http://www.springframework.org/schema/mvc=org.springframework.web.servlet.config.MvcNamespaceHandler, http://www.springframework.org/schema/util=org.springframework.beans.factory.xml.UtilNamespaceHandler, http://www.springframework.org/schema/jee=org.springframework.ejb.config.JeeNamespaceHandler, http://www.springframework.org/schema/aop=org.springframework.aop.config.AopNamespaceHandler, http://www.springframework.org/schema/jdbc=org.springframework.jdbc.config.JdbcNamespaceHandler, http://www.springframework.org/schema/cache=org.springframework.cache.config.CacheNamespaceHandler, http://mybatis.org/schema/mybatis-spring=org.mybatis.spring.config.NamespaceHandler, http://www.springframework.org/schema/c=org.springframework.beans.factory.xml.SimpleConstructorNamespaceHandler, http://www.springframework.org/schema/tx=org.springframework.transaction.config.TxNamespaceHandler, http://www.springframework.org/schema/task=org.springframework.scheduling.config.TaskNamespaceHandler, http://www.springframework.org/schema/lang=org.springframework.scripting.config.LangNamespaceHandler, http://www.springframework.org/schema/context=org.springframework.context.config.ContextNamespaceHandler}
08:19:32.487 [main] DEBUG org.springframework.core.env.StandardEnvironment - Adding [systemProperties] PropertySource with lowest search precedence
08:19:32.487 [main] DEBUG org.springframework.core.env.StandardEnvironment - Adding [systemEnvironment] PropertySource with lowest search precedence
08:19:32.487 [main] DEBUG org.springframework.core.env.StandardEnvironment - Initialized StandardEnvironment with PropertySources [systemProperties,systemEnvironment]
08:19:32.492 [main] DEBUG org.springframework.context.annotation.ClassPathBeanDefinitionScanner - JSR-250 'javax.annotation.ManagedBean' found and supported for component scanning
08:19:32.492 [main] DEBUG org.springframework.context.annotation.ClassPathBeanDefinitionScanner - JSR-330 'javax.inject.Named' annotation found and supported for component scanning
08:19:32.497 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan]
08:19:32.497 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.499 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.499 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.499 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.499 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/account] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.500 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/task] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.500 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.500 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/data] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.500 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.500 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/account] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.500 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/api] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.501 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/task] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.502 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath*:com/diguage/wanwan/**/*.class] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/account/AccountService.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/account/ShiroDbRealm$ShiroUser.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/account/ShiroDbRealm.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/CityService.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/ServiceException.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/task/TaskService.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/Constants.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/data/Page.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/data/PageRequest.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/data/Sort$Direction.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/data/Sort$Order.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/data/Sort.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/MyBatisRepository.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/account/LoginController.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/account/ProfileController.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/account/RegisterController.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/account/UserAdminController.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/api/ApiListController.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/task/TaskController.class]]
08:19:32.518 [main] DEBUG org.springframework.context.annotation.ClassPathBeanDefinitionScanner - Ignored because not a concrete top-level class: file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]
08:19:32.518 [main] DEBUG org.springframework.context.annotation.ClassPathBeanDefinitionScanner - Ignored because not a concrete top-level class: file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]
08:19:32.518 [main] DEBUG org.springframework.context.annotation.ClassPathBeanDefinitionScanner - Ignored because not a concrete top-level class: file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]
08:19:32.541 [main] DEBUG org.springframework.context.annotation.ClassPathBeanDefinitionScanner - Identified candidate component class: file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/account/AccountService.class]
08:19:32.542 [main] DEBUG org.springframework.context.annotation.ClassPathBeanDefinitionScanner - Identified candidate component class: file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/CityService.class]
08:19:32.543 [main] DEBUG org.springframework.context.annotation.ClassPathBeanDefinitionScanner - Identified candidate component class: file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/task/TaskService.class]
08:19:32.546 [main] DEBUG org.springframework.context.annotation.ClassPathBeanDefinitionScanner - Ignored because not a concrete top-level class: file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/MyBatisRepository.class]
08:19:32.574 [main] DEBUG org.springframework.beans.factory.xml.BeanDefinitionParserDelegate - Neither XML 'id' nor 'name' specified - using generated bean name [org.mybatis.spring.mapper.MapperScannerConfigurer#0]
08:19:32.586 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'spring.profiles.active' in [servletConfigInitParams]
08:19:32.586 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'spring.profiles.active' in [servletContextInitParams]
08:19:32.586 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'spring.profiles.active' in [jndiProperties]
08:19:32.586 [main] DEBUG org.springframework.jndi.JndiTemplate - Looking up JNDI object with name [java:comp/env/spring.profiles.active]
08:19:32.587 [main] DEBUG org.springframework.jndi.JndiLocatorDelegate - Converted JNDI name [java:comp/env/spring.profiles.active] not found - trying original name [spring.profiles.active]. javax.naming.NameNotFoundException; remaining name 'spring.profiles.active'
08:19:32.587 [main] DEBUG org.springframework.jndi.JndiTemplate - Looking up JNDI object with name [spring.profiles.active]
08:19:32.587 [main] DEBUG org.springframework.jndi.JndiPropertySource - JNDI lookup for name [spring.profiles.active] threw NamingException with message: null. Returning null.
08:19:32.587 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'spring.profiles.active' in [systemProperties]
08:19:32.588 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Found key 'spring.profiles.active' in [systemProperties] with type [String] and value 'production'
08:19:32.592 [main] DEBUG org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loaded 17 bean definitions from location pattern [classpath*:/applicationContext.xml]
08:19:32.592 [main] INFO  org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loading XML bean definitions from URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext-shiro.xml]
08:19:32.594 [main] DEBUG org.springframework.beans.factory.xml.DefaultDocumentLoader - Using JAXP provider [com.sun.org.apache.xerces.internal.jaxp.DocumentBuilderFactoryImpl]
08:19:32.596 [main] DEBUG org.springframework.beans.factory.xml.PluggableSchemaResolver - Found XML schema [http://www.springframework.org/schema/beans/spring-beans-4.0.xsd] in classpath: org/springframework/beans/factory/xml/spring-beans-4.0.xsd
08:19:32.612 [main] DEBUG org.springframework.beans.factory.xml.DefaultBeanDefinitionDocumentReader - Loading bean definitions
08:19:32.614 [main] DEBUG org.springframework.beans.factory.xml.XmlBeanDefinitionReader - Loaded 5 bean definitions from location pattern [classpath*:/applicationContext-shiro.xml]
08:19:32.614 [main] DEBUG org.springframework.web.context.support.XmlWebApplicationContext - Bean factory for Root WebApplicationContext: org.springframework.beans.factory.support.DefaultListableBeanFactory@6c9657d4: defining beans [accountService,cityService,taskService,org.springframework.context.annotation.internalConfigurationAnnotationProcessor,org.springframework.context.annotation.internalAutowiredAnnotationProcessor,org.springframework.context.annotation.internalRequiredAnnotationProcessor,org.springframework.context.annotation.internalCommonAnnotationProcessor,sqlSessionFactory,org.mybatis.spring.mapper.MapperScannerConfigurer#0,transactionManager,org.springframework.aop.config.internalAutoProxyCreator,org.springframework.transaction.annotation.AnnotationTransactionAttributeSource#0,org.springframework.transaction.interceptor.TransactionInterceptor#0,org.springframework.transaction.config.internalTransactionAdvisor,validator,org.springframework.context.support.PropertySourcesPlaceholderConfigurer#0,dataSource,securityManager,shiroDbRealm,shiroFilter,shiroEhcacheManager,lifecycleBeanPostProcessor]; root of factory hierarchy
08:19:32.646 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor'
08:19:32.647 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor'
08:19:32.657 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor' to allow for resolving potential circular references
08:19:32.658 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Finished creating instance of bean 'org.springframework.context.annotation.internalConfigurationAnnotationProcessor'
08:19:32.691 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.mybatis.spring.mapper.MapperScannerConfigurer#0'
08:19:32.691 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'org.mybatis.spring.mapper.MapperScannerConfigurer#0'
08:19:32.691 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'org.mybatis.spring.mapper.MapperScannerConfigurer#0' to allow for resolving potential circular references
08:19:32.711 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'org.mybatis.spring.mapper.MapperScannerConfigurer#0'
08:19:32.711 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Finished creating instance of bean 'org.mybatis.spring.mapper.MapperScannerConfigurer#0'
08:19:32.713 [main] DEBUG org.springframework.core.env.StandardEnvironment - Adding [systemProperties] PropertySource with lowest search precedence
08:19:32.713 [main] DEBUG org.springframework.core.env.StandardEnvironment - Adding [systemEnvironment] PropertySource with lowest search precedence
08:19:32.714 [main] DEBUG org.springframework.core.env.StandardEnvironment - Initialized StandardEnvironment with PropertySources [systemProperties,systemEnvironment]
08:19:32.715 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan]
08:19:32.715 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.715 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.715 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.716 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.716 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/account] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.716 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/task] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.716 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.716 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/data] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.717 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.717 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/account] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.717 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/api] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.717 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/task] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/**/*.class]
08:19:32.718 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath*:com/diguage/wanwan/**/*.class] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/account/AccountService.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/account/ShiroDbRealm$ShiroUser.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/account/ShiroDbRealm.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/CityService.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/ServiceException.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/service/task/TaskService.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/Constants.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/data/Page.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/data/PageRequest.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/data/Sort$Direction.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/data/Sort$Order.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/data/Sort.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/utils/MyBatisRepository.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/account/LoginController.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/account/ProfileController.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/account/RegisterController.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/account/UserAdminController.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/api/ApiListController.class], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/web/task/TaskController.class]]
08:19:32.719 [main] DEBUG org.mybatis.spring.mapper.ClassPathMapperScanner - Identified candidate component class: file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]
08:19:32.720 [main] DEBUG org.mybatis.spring.mapper.ClassPathMapperScanner - Identified candidate component class: file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]
08:19:32.720 [main] DEBUG org.mybatis.spring.mapper.ClassPathMapperScanner - Identified candidate component class: file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]
08:19:32.736 [main] DEBUG org.mybatis.spring.mapper.ClassPathMapperScanner - Creating MapperFactoryBean with name 'cityMapper' and 'com.diguage.wanwan.dao.CityMapper' mapperInterface
08:19:32.737 [main] DEBUG org.mybatis.spring.mapper.ClassPathMapperScanner - Enabling autowire by type for MapperFactoryBean with name 'cityMapper'.
08:19:32.737 [main] DEBUG org.mybatis.spring.mapper.ClassPathMapperScanner - Creating MapperFactoryBean with name 'taskMapper' and 'com.diguage.wanwan.dao.TaskMapper' mapperInterface
08:19:32.737 [main] DEBUG org.mybatis.spring.mapper.ClassPathMapperScanner - Enabling autowire by type for MapperFactoryBean with name 'taskMapper'.
08:19:32.737 [main] DEBUG org.mybatis.spring.mapper.ClassPathMapperScanner - Creating MapperFactoryBean with name 'userMapper' and 'com.diguage.wanwan.dao.UserMapper' mapperInterface
08:19:32.737 [main] DEBUG org.mybatis.spring.mapper.ClassPathMapperScanner - Enabling autowire by type for MapperFactoryBean with name 'userMapper'.
08:19:32.740 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.support.PropertySourcesPlaceholderConfigurer#0'
08:19:32.740 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'org.springframework.context.support.PropertySourcesPlaceholderConfigurer#0'
08:19:32.741 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'org.springframework.context.support.PropertySourcesPlaceholderConfigurer#0' to allow for resolving potential circular references
08:19:32.750 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Finished creating instance of bean 'org.springframework.context.support.PropertySourcesPlaceholderConfigurer#0'
08:19:32.750 [main] DEBUG org.springframework.core.env.MutablePropertySources - Adding [environmentProperties] PropertySource with lowest search precedence
08:19:32.750 [main] INFO  org.springframework.context.support.PropertySourcesPlaceholderConfigurer - Loading properties file from URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/application.properties]
08:19:32.751 [main] INFO  org.springframework.context.support.PropertySourcesPlaceholderConfigurer - Loading properties file from URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/test-classes/application.development.properties]
08:19:32.751 [main] INFO  org.springframework.context.support.PropertySourcesPlaceholderConfigurer - Loading properties file from URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/application.development.properties]
08:19:32.752 [main] DEBUG org.springframework.core.env.MutablePropertySources - Adding [localProperties] PropertySource with lowest search precedence
08:19:32.754 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.driver' in [environmentProperties]
08:19:32.754 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.driver' in [servletConfigInitParams]
08:19:32.754 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.driver' in [servletContextInitParams]
08:19:32.754 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.driver' in [jndiProperties]
08:19:32.754 [main] DEBUG org.springframework.jndi.JndiTemplate - Looking up JNDI object with name [java:comp/env/jdbc.driver]
08:19:32.754 [main] DEBUG org.springframework.jndi.JndiLocatorDelegate - Converted JNDI name [java:comp/env/jdbc.driver] not found - trying original name [jdbc.driver]. javax.naming.NameNotFoundException; remaining name 'jdbc.driver'
08:19:32.754 [main] DEBUG org.springframework.jndi.JndiTemplate - Looking up JNDI object with name [jdbc.driver]
08:19:32.754 [main] DEBUG org.springframework.jndi.JndiPropertySource - JNDI lookup for name [jdbc.driver] threw NamingException with message: null. Returning null.
08:19:32.754 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.driver' in [systemProperties]
08:19:32.755 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.driver' in [systemEnvironment]
08:19:32.755 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Could not find key 'jdbc.driver' in any property source. Returning [null]
08:19:32.755 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.driver' in [localProperties]
08:19:32.755 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Found key 'jdbc.driver' in [localProperties] with type [String] and value 'com.mysql.jdbc.Driver'
08:19:32.755 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.url' in [environmentProperties]
08:19:32.755 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.url' in [servletConfigInitParams]
08:19:32.755 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.url' in [servletContextInitParams]
08:19:32.755 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.url' in [jndiProperties]
08:19:32.755 [main] DEBUG org.springframework.jndi.JndiTemplate - Looking up JNDI object with name [java:comp/env/jdbc.url]
08:19:32.756 [main] DEBUG org.springframework.jndi.JndiLocatorDelegate - Converted JNDI name [java:comp/env/jdbc.url] not found - trying original name [jdbc.url]. javax.naming.NameNotFoundException; remaining name 'jdbc.url'
08:19:32.756 [main] DEBUG org.springframework.jndi.JndiTemplate - Looking up JNDI object with name [jdbc.url]
08:19:32.756 [main] DEBUG org.springframework.jndi.JndiPropertySource - JNDI lookup for name [jdbc.url] threw NamingException with message: null. Returning null.
08:19:32.756 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.url' in [systemProperties]
08:19:32.756 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.url' in [systemEnvironment]
08:19:32.756 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Could not find key 'jdbc.url' in any property source. Returning [null]
08:19:32.756 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.url' in [localProperties]
08:19:32.756 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Found key 'jdbc.url' in [localProperties] with type [String] and value 'jdbc:mysql://192.168.11.11:3306/huaba?useUnicode=true&characterEncoding=utf-8'
08:19:32.756 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.username' in [environmentProperties]
08:19:32.756 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.username' in [servletConfigInitParams]
08:19:32.756 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.username' in [servletContextInitParams]
08:19:32.756 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.username' in [jndiProperties]
08:19:32.756 [main] DEBUG org.springframework.jndi.JndiTemplate - Looking up JNDI object with name [java:comp/env/jdbc.username]
08:19:32.757 [main] DEBUG org.springframework.jndi.JndiLocatorDelegate - Converted JNDI name [java:comp/env/jdbc.username] not found - trying original name [jdbc.username]. javax.naming.NameNotFoundException; remaining name 'jdbc.username'
08:19:32.757 [main] DEBUG org.springframework.jndi.JndiTemplate - Looking up JNDI object with name [jdbc.username]
08:19:32.757 [main] DEBUG org.springframework.jndi.JndiPropertySource - JNDI lookup for name [jdbc.username] threw NamingException with message: null. Returning null.
08:19:32.757 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.username' in [systemProperties]
08:19:32.757 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.username' in [systemEnvironment]
08:19:32.757 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Could not find key 'jdbc.username' in any property source. Returning [null]
08:19:32.758 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.username' in [localProperties]
08:19:32.758 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Found key 'jdbc.username' in [localProperties] with type [String] and value 'root'
08:19:32.758 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.password' in [environmentProperties]
08:19:32.758 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.password' in [servletConfigInitParams]
08:19:32.758 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.password' in [servletContextInitParams]
08:19:32.758 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.password' in [jndiProperties]
08:19:32.758 [main] DEBUG org.springframework.jndi.JndiTemplate - Looking up JNDI object with name [java:comp/env/jdbc.password]
08:19:32.758 [main] DEBUG org.springframework.jndi.JndiLocatorDelegate - Converted JNDI name [java:comp/env/jdbc.password] not found - trying original name [jdbc.password]. javax.naming.NameNotFoundException; remaining name 'jdbc.password'
08:19:32.758 [main] DEBUG org.springframework.jndi.JndiTemplate - Looking up JNDI object with name [jdbc.password]
08:19:32.758 [main] DEBUG org.springframework.jndi.JndiPropertySource - JNDI lookup for name [jdbc.password] threw NamingException with message: null. Returning null.
08:19:32.758 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.password' in [systemProperties]
08:19:32.758 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.password' in [systemEnvironment]
08:19:32.759 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Could not find key 'jdbc.password' in any property source. Returning [null]
08:19:32.759 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.password' in [localProperties]
08:19:32.759 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Found key 'jdbc.password' in [localProperties] with type [String] and value '123456'
08:19:32.759 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.pool.maxActive' in [environmentProperties]
08:19:32.759 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.pool.maxActive' in [servletConfigInitParams]
08:19:32.759 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.pool.maxActive' in [servletContextInitParams]
08:19:32.759 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.pool.maxActive' in [jndiProperties]
08:19:32.759 [main] DEBUG org.springframework.jndi.JndiTemplate - Looking up JNDI object with name [java:comp/env/jdbc.pool.maxActive]
08:19:32.759 [main] DEBUG org.springframework.jndi.JndiLocatorDelegate - Converted JNDI name [java:comp/env/jdbc.pool.maxActive] not found - trying original name [jdbc.pool.maxActive]. javax.naming.NameNotFoundException; remaining name 'jdbc.pool.maxActive'
08:19:32.759 [main] DEBUG org.springframework.jndi.JndiTemplate - Looking up JNDI object with name [jdbc.pool.maxActive]
08:19:32.760 [main] DEBUG org.springframework.jndi.JndiPropertySource - JNDI lookup for name [jdbc.pool.maxActive] threw NamingException with message: null. Returning null.
08:19:32.760 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.pool.maxActive' in [systemProperties]
08:19:32.760 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.pool.maxActive' in [systemEnvironment]
08:19:32.760 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Could not find key 'jdbc.pool.maxActive' in any property source. Returning [null]
08:19:32.760 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.pool.maxActive' in [localProperties]
08:19:32.760 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Found key 'jdbc.pool.maxActive' in [localProperties] with type [String] and value '50'
08:19:32.760 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.pool.maxIdle' in [environmentProperties]
08:19:32.760 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.pool.maxIdle' in [servletConfigInitParams]
08:19:32.760 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.pool.maxIdle' in [servletContextInitParams]
08:19:32.760 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.pool.maxIdle' in [jndiProperties]
08:19:32.760 [main] DEBUG org.springframework.jndi.JndiTemplate - Looking up JNDI object with name [java:comp/env/jdbc.pool.maxIdle]
08:19:32.761 [main] DEBUG org.springframework.jndi.JndiLocatorDelegate - Converted JNDI name [java:comp/env/jdbc.pool.maxIdle] not found - trying original name [jdbc.pool.maxIdle]. javax.naming.NameNotFoundException; remaining name 'jdbc.pool.maxIdle'
08:19:32.761 [main] DEBUG org.springframework.jndi.JndiTemplate - Looking up JNDI object with name [jdbc.pool.maxIdle]
08:19:32.761 [main] DEBUG org.springframework.jndi.JndiPropertySource - JNDI lookup for name [jdbc.pool.maxIdle] threw NamingException with message: null. Returning null.
08:19:32.761 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.pool.maxIdle' in [systemProperties]
08:19:32.761 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.pool.maxIdle' in [systemEnvironment]
08:19:32.761 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Could not find key 'jdbc.pool.maxIdle' in any property source. Returning [null]
08:19:32.761 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Searching for key 'jdbc.pool.maxIdle' in [localProperties]
08:19:32.761 [main] DEBUG org.springframework.core.env.PropertySourcesPropertyResolver - Found key 'jdbc.pool.maxIdle' in [localProperties] with type [String] and value '10'
08:19:32.764 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor'
08:19:32.764 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor'
08:19:32.764 [main] INFO  org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor - JSR-330 'javax.inject.Inject' annotation found and supported for autowiring
08:19:32.764 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor' to allow for resolving potential circular references
08:19:32.764 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Finished creating instance of bean 'org.springframework.context.annotation.internalAutowiredAnnotationProcessor'
08:19:32.764 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalRequiredAnnotationProcessor'
08:19:32.764 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'org.springframework.context.annotation.internalRequiredAnnotationProcessor'
08:19:32.765 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'org.springframework.context.annotation.internalRequiredAnnotationProcessor' to allow for resolving potential circular references
08:19:32.765 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Finished creating instance of bean 'org.springframework.context.annotation.internalRequiredAnnotationProcessor'
08:19:32.765 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
08:19:32.765 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
08:19:32.766 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'org.springframework.context.annotation.internalCommonAnnotationProcessor' to allow for resolving potential circular references
08:19:32.766 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Finished creating instance of bean 'org.springframework.context.annotation.internalCommonAnnotationProcessor'
08:19:32.767 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'lifecycleBeanPostProcessor'
08:19:32.767 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'lifecycleBeanPostProcessor'
08:19:32.767 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'lifecycleBeanPostProcessor' to allow for resolving potential circular references
08:19:32.767 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Finished creating instance of bean 'lifecycleBeanPostProcessor'
08:19:32.767 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.ConfigurationClassPostProcessor.importAwareProcessor'
08:19:32.767 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'org.springframework.context.annotation.ConfigurationClassPostProcessor.importAwareProcessor'
08:19:32.767 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'org.springframework.context.annotation.ConfigurationClassPostProcessor.importAwareProcessor' to allow for resolving potential circular references
08:19:32.767 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Finished creating instance of bean 'org.springframework.context.annotation.ConfigurationClassPostProcessor.importAwareProcessor'
08:19:32.767 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.context.annotation.ConfigurationClassPostProcessor.enhancedConfigurationProcessor'
08:19:32.767 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'org.springframework.context.annotation.ConfigurationClassPostProcessor.enhancedConfigurationProcessor'
08:19:32.767 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'org.springframework.context.annotation.ConfigurationClassPostProcessor.enhancedConfigurationProcessor' to allow for resolving potential circular references
08:19:32.767 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Finished creating instance of bean 'org.springframework.context.annotation.ConfigurationClassPostProcessor.enhancedConfigurationProcessor'
08:19:32.768 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.aop.config.internalAutoProxyCreator'
08:19:32.768 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'org.springframework.aop.config.internalAutoProxyCreator'
08:19:32.774 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'org.springframework.aop.config.internalAutoProxyCreator' to allow for resolving potential circular references
08:19:32.810 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Finished creating instance of bean 'org.springframework.aop.config.internalAutoProxyCreator'
08:19:32.810 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'shiroFilter'
08:19:32.810 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'shiroFilter'
08:19:32.813 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'shiroFilter' to allow for resolving potential circular references
08:19:32.816 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'securityManager'
08:19:32.816 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'securityManager'
08:19:32.845 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'securityManager' to allow for resolving potential circular references
08:19:32.861 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'shiroDbRealm'
08:19:32.861 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'shiroDbRealm'
08:19:32.868 [main] DEBUG org.springframework.context.annotation.CommonAnnotationBeanPostProcessor - Found init method on class [com.diguage.wanwan.service.account.ShiroDbRealm]: public void com.diguage.wanwan.service.account.ShiroDbRealm.initCredentialsMatcher()
08:19:32.869 [main] DEBUG org.springframework.context.annotation.CommonAnnotationBeanPostProcessor - Registered init method on class [com.diguage.wanwan.service.account.ShiroDbRealm]: org.springframework.beans.factory.annotation.InitDestroyAnnotationBeanPostProcessor$LifecycleElement@c287e7c6
08:19:32.873 [main] DEBUG org.springframework.beans.factory.annotation.InjectionMetadata - Registered injected element on class [com.diguage.wanwan.service.account.ShiroDbRealm]: AutowiredFieldElement for protected com.diguage.wanwan.service.account.AccountService com.diguage.wanwan.service.account.ShiroDbRealm.accountService
08:19:32.873 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'shiroDbRealm' to allow for resolving potential circular references
08:19:32.883 [main] DEBUG org.springframework.beans.factory.annotation.InjectionMetadata - Processing injected element of bean 'shiroDbRealm': AutowiredFieldElement for protected com.diguage.wanwan.service.account.AccountService com.diguage.wanwan.service.account.ShiroDbRealm.accountService
08:19:32.889 [main] DEBUG org.apache.ibatis.logging.LogFactory - Logging initialized using 'class org.apache.ibatis.logging.slf4j.Slf4jImpl' adapter.
08:19:32.892 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.transaction.config.internalTransactionAdvisor'
08:19:32.892 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'org.springframework.transaction.config.internalTransactionAdvisor'
08:19:32.893 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'org.springframework.transaction.config.internalTransactionAdvisor' to allow for resolving potential circular references
08:19:32.899 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'org.springframework.transaction.annotation.AnnotationTransactionAttributeSource#0'
08:19:32.900 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'org.springframework.transaction.annotation.AnnotationTransactionAttributeSource#0'
08:19:32.907 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'org.springframework.transaction.annotation.AnnotationTransactionAttributeSource#0' to allow for resolving potential circular references
08:19:32.913 [main] INFO  org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker - Bean 'org.springframework.transaction.annotation.AnnotationTransactionAttributeSource#0' of type [class org.springframework.transaction.annotation.AnnotationTransactionAttributeSource] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
08:19:32.913 [main] DEBUG org.springframework.aop.framework.autoproxy.BeanFactoryAdvisorRetrievalHelper - Skipping currently created advisor 'org.springframework.transaction.config.internalTransactionAdvisor'
08:19:32.915 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Finished creating instance of bean 'org.springframework.transaction.annotation.AnnotationTransactionAttributeSource#0'
08:19:32.915 [main] INFO  org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker - Bean 'org.springframework.transaction.config.internalTransactionAdvisor' of type [class org.springframework.transaction.interceptor.BeanFactoryTransactionAttributeSourceAdvisor] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
08:19:32.915 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Finished creating instance of bean 'org.springframework.transaction.config.internalTransactionAdvisor'
08:19:32.917 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'shiroFilter' that is not fully initialized yet - a consequence of a circular reference
08:19:32.918 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'cityMapper'
08:19:32.918 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'cityMapper'
08:19:32.919 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'cityMapper' to allow for resolving potential circular references
08:19:32.926 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'org.springframework.transaction.config.internalTransactionAdvisor'
08:19:32.926 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'cityMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:32.927 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'taskMapper'
08:19:32.927 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'taskMapper'
08:19:32.927 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'taskMapper' to allow for resolving potential circular references
08:19:32.928 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'org.springframework.transaction.config.internalTransactionAdvisor'
08:19:32.928 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'taskMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:32.928 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'userMapper'
08:19:32.928 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'userMapper'
08:19:32.928 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'userMapper' to allow for resolving potential circular references
08:19:32.929 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'org.springframework.transaction.config.internalTransactionAdvisor'
08:19:32.929 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'userMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:32.930 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:32.930 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:32.934 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:32.939 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'dataSource'
08:19:32.939 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'dataSource'
08:19:32.951 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'dataSource' to allow for resolving potential circular references
08:19:32.971 [main] INFO  org.springframework.context.support.PostProcessorRegistrationDelegate$BeanPostProcessorChecker - Bean 'dataSource' of type [class org.apache.tomcat.jdbc.pool.DataSource] is not eligible for getting processed by all BeanPostProcessors (for example: not eligible for auto-proxying)
08:19:32.971 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'org.springframework.transaction.config.internalTransactionAdvisor'
08:19:32.976 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Finished creating instance of bean 'dataSource'
08:19:32.976 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:32.976 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:32.977 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:32.977 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:32.977 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:33.002 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Class not found: org.jboss.vfs.VFS
08:19:33.002 [main] DEBUG org.apache.ibatis.io.ResolverUtil - JBoss 6 VFS API is not available in this environment.
08:19:33.003 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Class not found: org.jboss.vfs.VirtualFile
08:19:33.003 [main] DEBUG org.apache.ibatis.io.ResolverUtil - VFS implementation org.apache.ibatis.io.JBoss6VFS is not valid in this environment.
08:19:33.004 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Using VFS adapter org.apache.ibatis.io.DefaultVFS
08:19:33.004 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.004 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.070 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:33.071 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:33.071 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:33.071 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:33.071 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:33.072 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:33.072 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:33.072 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:33.072 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:33.073 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:33.073 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:33.073 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:33.073 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:33.073 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:33.074 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:33.074 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.074 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.074 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.074 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:33.075 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.075 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.075 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.075 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.075 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.077 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.077 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.077 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.077 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.078 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.078 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.078 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.079 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.079 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.079 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:33.079 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.079 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.080 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.080 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.080 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.080 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.081 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.081 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.081 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.081 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.082 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.082 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.083 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.083 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.083 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.084 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.084 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.084 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.084 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.084 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.085 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:33.085 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.085 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.085 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.085 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.086 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.086 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.086 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:33.087 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:33.087 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:33.088 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:33.089 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.089 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:33.089 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:33.089 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:33.090 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:33.090 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.090 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:33.090 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:33.090 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:33.093 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:33.093 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.093 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:33.214 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:33.282 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:33.282 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:33.282 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:33.283 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:33.283 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:33.283 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:33.283 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:33.283 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:33.283 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:33.283 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:33.284 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.284 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.287 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:33.287 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:33.287 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:33.288 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:33.288 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:33.288 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:33.288 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:33.288 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:33.289 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:33.289 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:33.289 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:33.289 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:33.289 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:33.290 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:33.290 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:33.290 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.290 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.290 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.291 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:33.291 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.291 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.291 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.291 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.291 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.294 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.294 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.294 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.295 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.295 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.295 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.296 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.296 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.296 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.297 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:33.297 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.298 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.298 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.298 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.299 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.299 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.300 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.300 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.300 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.301 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.301 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.302 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.302 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.302 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.303 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.304 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.304 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.304 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.304 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.304 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.305 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:33.305 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.305 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.306 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.306 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.306 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.307 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.307 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:33.307 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:33.307 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:33.307 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:33.307 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.308 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:33.308 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:33.308 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:33.308 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:33.308 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.308 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:33.308 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:33.308 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:33.308 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:33.308 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.308 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:33.350 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:33.400 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:33.400 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'userMapper'
08:19:33.400 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'userMapper'
08:19:33.400 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'userMapper' to allow for resolving potential circular references
08:19:33.401 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'taskMapper'
08:19:33.401 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'taskMapper'
08:19:33.401 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'taskMapper' to allow for resolving potential circular references
08:19:33.402 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'taskMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:33.402 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'userMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:33.402 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:33.402 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:33.402 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:33.403 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:33.403 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:33.403 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:33.403 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:33.403 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:33.403 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:33.404 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.404 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.408 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:33.408 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:33.408 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:33.408 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:33.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:33.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:33.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:33.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:33.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:33.410 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:33.410 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:33.410 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:33.410 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:33.410 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:33.410 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:33.411 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.411 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.411 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.412 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:33.413 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.413 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.413 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.413 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.413 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.415 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.415 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.415 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.415 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.415 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.415 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.416 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.416 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.416 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.416 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:33.417 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.417 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.417 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.417 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.417 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.418 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.418 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.418 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.419 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.419 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.419 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.420 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.420 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.420 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.421 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.421 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.421 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.421 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.421 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.421 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.422 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:33.422 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.422 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.422 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.422 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.422 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.423 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.423 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:33.423 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:33.423 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:33.423 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:33.423 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.423 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:33.423 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:33.423 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:33.423 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:33.423 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.423 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:33.423 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:33.424 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:33.424 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:33.424 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.424 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:33.460 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:33.498 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:33.498 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:33.498 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:33.498 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:33.499 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:33.499 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:33.499 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:33.499 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:33.499 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:33.499 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:33.500 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.500 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.503 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:33.503 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:33.504 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:33.504 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:33.504 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:33.504 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:33.504 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:33.504 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:33.505 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:33.505 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:33.505 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:33.505 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:33.505 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:33.506 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:33.506 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:33.506 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.506 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.506 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.506 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:33.507 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.507 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.507 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.507 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.507 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.509 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.509 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.509 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.509 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.509 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.509 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.510 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.510 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.510 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.510 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:33.510 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.511 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.511 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.511 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.511 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.511 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.511 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.512 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.512 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.512 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.512 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.513 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.513 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.513 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.514 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.514 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.514 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.514 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.515 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.515 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.515 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:33.515 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.515 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.516 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.516 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.516 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.516 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.516 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:33.516 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:33.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:33.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:33.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:33.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:33.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:33.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:33.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:33.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:33.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:33.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:33.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.517 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:33.546 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:33.580 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:33.580 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:33.580 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:33.580 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:33.580 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:33.580 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:33.581 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:33.581 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:33.581 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:33.581 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:33.582 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.582 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.585 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:33.585 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:33.585 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:33.586 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:33.586 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:33.586 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:33.586 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:33.586 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:33.587 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:33.587 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:33.587 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:33.587 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:33.587 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:33.587 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:33.588 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:33.588 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.588 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.588 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.588 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:33.588 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.588 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.589 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.589 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.589 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.589 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.589 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.589 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.589 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.590 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.590 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.590 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.590 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.590 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.590 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:33.590 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.591 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.591 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.591 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.591 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.591 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.591 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.591 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.592 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.592 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.592 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.592 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.592 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.593 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.593 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.593 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.594 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.594 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.595 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.595 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.595 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:33.595 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.595 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.596 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.596 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.596 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:33.597 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.598 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:33.627 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:33.652 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:33.653 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'taskMapper'
08:19:33.653 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'taskMapper'
08:19:33.653 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'taskMapper' to allow for resolving potential circular references
08:19:33.654 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'cityMapper'
08:19:33.654 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'cityMapper'
08:19:33.654 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'cityMapper' to allow for resolving potential circular references
08:19:33.655 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'cityMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:33.655 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'taskMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:33.655 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'userMapper'
08:19:33.655 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'userMapper'
08:19:33.655 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'userMapper' to allow for resolving potential circular references
08:19:33.656 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'userMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:33.656 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:33.656 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:33.656 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:33.656 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:33.656 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:33.657 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:33.657 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:33.657 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:33.657 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:33.657 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.660 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:33.660 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:33.661 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:33.661 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:33.661 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:33.661 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:33.662 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:33.662 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:33.662 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:33.662 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:33.663 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:33.663 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:33.663 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:33.663 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:33.664 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:33.664 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.664 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.664 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.664 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:33.664 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.665 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.665 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.665 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.665 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.665 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.665 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.665 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.666 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.666 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.666 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.666 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.666 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.667 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.667 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:33.667 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.667 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.668 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.668 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.668 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.668 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.669 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.669 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.669 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.669 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.669 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.669 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.670 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.670 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.670 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.670 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.671 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.671 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.671 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.671 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.671 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:33.672 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.672 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.672 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.673 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.673 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.673 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.673 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:33.673 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:33.673 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:33.674 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:33.674 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.674 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:33.674 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:33.674 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:33.674 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:33.674 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.674 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:33.674 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:33.674 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:33.674 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:33.674 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.674 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:33.702 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:33.726 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:33.727 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:33.727 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:33.727 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:33.727 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:33.727 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:33.727 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:33.727 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:33.728 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:33.728 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:33.728 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.728 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.732 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:33.732 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:33.732 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:33.732 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:33.733 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:33.733 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:33.733 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:33.733 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:33.734 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:33.734 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:33.734 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:33.734 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:33.735 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:33.735 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:33.735 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:33.735 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.735 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.735 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.736 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:33.736 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.736 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.736 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.736 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.736 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.737 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.737 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.737 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.737 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.737 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.737 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.738 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.738 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.738 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.738 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:33.738 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.738 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.738 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.739 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.739 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.739 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.739 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.739 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.739 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.740 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.740 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.740 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.740 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.740 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.740 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.741 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.741 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.741 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.741 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.741 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.741 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:33.742 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.742 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.742 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.742 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.742 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:33.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.743 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:33.768 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:33.814 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:33.815 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'userMapper'
08:19:33.815 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'userMapper'
08:19:33.815 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'userMapper' to allow for resolving potential circular references
08:19:33.817 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'cityMapper'
08:19:33.817 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'cityMapper'
08:19:33.817 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'cityMapper' to allow for resolving potential circular references
08:19:33.818 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'cityMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:33.818 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'userMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:33.818 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:33.818 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:33.818 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:33.818 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:33.818 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:33.818 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:33.819 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:33.819 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:33.819 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:33.819 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.819 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.822 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:33.823 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:33.823 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:33.823 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:33.823 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:33.824 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:33.824 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:33.824 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:33.824 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:33.824 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:33.824 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:33.824 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:33.825 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:33.825 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:33.825 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:33.825 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.825 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.825 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.826 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:33.826 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.826 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.826 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.826 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.826 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.827 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.827 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.827 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.827 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.827 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.828 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.828 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.828 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.828 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.828 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:33.828 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.828 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.829 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.829 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.829 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.829 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.829 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.829 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.829 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.830 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.830 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.830 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.830 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.830 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.830 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.831 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.831 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.831 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.831 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.831 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.831 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:33.831 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:33.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:33.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:33.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:33.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:33.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:33.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:33.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:33.833 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.833 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:33.833 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:33.833 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:33.833 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:33.833 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.833 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:33.856 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:33.885 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:33.885 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:33.885 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:33.885 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:33.885 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:33.886 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:33.886 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:33.886 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:33.886 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:33.886 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:33.887 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.887 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.889 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:33.890 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:33.890 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:33.890 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:33.890 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:33.891 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:33.891 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:33.891 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:33.891 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:33.891 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:33.891 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:33.891 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:33.892 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:33.892 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:33.892 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:33.892 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.892 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.892 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.892 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:33.892 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.893 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.893 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.893 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.893 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.893 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.894 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.894 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.894 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.894 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.894 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.894 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.894 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.894 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.894 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:33.895 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.895 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.895 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.895 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.895 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.895 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.895 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.896 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.896 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.896 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.896 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.896 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.897 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.897 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.897 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.897 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.897 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.897 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.898 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.898 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.898 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:33.898 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.898 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.898 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.898 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.898 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:33.899 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.899 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:33.919 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:33.934 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:33.934 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:33.934 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:33.934 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:33.934 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:33.935 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:33.935 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:33.935 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:33.935 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:33.935 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:33.935 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.935 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.938 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:33.939 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:33.939 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:33.939 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:33.939 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:33.940 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:33.940 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:33.940 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:33.940 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:33.940 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:33.941 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:33.941 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:33.941 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:33.942 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:33.942 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:33.942 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.942 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.942 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.942 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:33.943 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.943 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.943 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.943 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.943 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.943 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.943 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.943 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.944 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.944 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.944 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.944 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.944 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.944 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:33.944 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:33.945 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.945 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:33.945 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.945 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.945 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:33.945 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.945 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.945 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:33.946 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.946 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.946 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:33.946 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:33.946 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.946 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:33.946 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:33.947 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.947 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:33.947 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.947 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.947 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:33.947 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:33.947 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.948 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:33.948 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.948 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.948 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:33.948 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.949 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:33.949 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:33.949 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:33.949 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:33.949 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.949 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:33.949 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:33.949 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:33.949 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:33.949 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.949 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:33.949 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:33.949 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:33.949 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:33.949 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:33.949 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:33.971 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:33.987 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:33.987 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'userMapper'
08:19:33.987 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'userMapper'
08:19:33.988 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'userMapper' to allow for resolving potential circular references
08:19:33.988 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'cityMapper'
08:19:33.988 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'cityMapper'
08:19:33.988 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'cityMapper' to allow for resolving potential circular references
08:19:33.989 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'cityMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:33.990 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'taskMapper'
08:19:33.990 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'taskMapper'
08:19:33.990 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'taskMapper' to allow for resolving potential circular references
08:19:33.991 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'taskMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:33.991 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'userMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:33.991 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:33.991 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:33.991 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:33.991 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:33.992 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:33.992 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:33.992 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:33.992 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:33.992 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:33.993 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.993 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.995 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:33.995 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:33.995 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:33.995 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:33.996 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:33.996 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:33.996 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:33.996 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:33.996 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:33.997 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:33.997 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:33.997 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:33.997 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:33.997 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:33.998 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:33.998 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:33.998 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.998 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:33.998 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:33.998 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.998 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:33.998 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:33.999 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.999 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:33.999 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:33.999 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.999 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:33.999 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:33.999 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:33.999 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.000 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.000 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.000 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.000 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.000 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.000 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.000 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.000 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.000 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.001 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.001 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.001 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.001 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.001 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.001 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.001 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.002 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.002 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.002 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.002 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.002 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.002 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.002 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.002 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.002 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.003 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.003 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.003 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.003 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.003 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.003 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.003 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.003 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.003 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.003 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.003 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.003 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.004 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.004 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.004 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.004 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.004 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.004 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.004 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.004 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.004 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.004 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.026 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.042 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.043 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.043 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.043 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.043 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.043 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.043 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.044 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.044 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.044 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.044 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.044 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.047 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.047 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.048 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.048 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.048 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.048 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.048 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.049 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.049 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.049 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.049 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.049 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.050 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.050 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.050 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.050 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.050 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.050 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.050 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.051 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.051 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.051 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.051 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.051 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.051 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.052 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.052 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.052 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.052 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.052 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.052 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.052 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.053 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.053 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.053 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.053 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.053 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.053 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.053 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.053 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.054 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.054 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.054 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.054 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.054 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.054 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.054 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.054 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.055 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.055 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.055 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.055 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.055 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.055 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.056 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.056 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.056 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.056 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.056 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.056 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.056 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.056 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.057 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.057 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.057 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.057 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.057 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.057 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.057 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.057 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.057 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.057 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.057 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.057 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.057 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.057 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.057 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.075 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.088 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.088 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'taskMapper'
08:19:34.088 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'taskMapper'
08:19:34.088 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'taskMapper' to allow for resolving potential circular references
08:19:34.089 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'cityMapper'
08:19:34.089 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'cityMapper'
08:19:34.089 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'cityMapper' to allow for resolving potential circular references
08:19:34.090 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'cityMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.090 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'taskMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.090 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.090 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.090 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.090 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.090 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.091 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.091 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.091 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.091 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.091 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.091 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.092 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.092 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.092 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.093 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.093 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.093 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.093 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.093 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.093 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.094 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.094 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.094 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.094 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.094 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.095 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.095 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.095 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.095 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.095 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.095 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.095 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.095 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.096 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.096 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.096 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.096 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.096 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.096 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.096 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.097 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.097 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.097 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.097 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.097 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.098 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.098 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.098 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.098 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.099 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.099 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.099 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.099 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.099 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.100 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.100 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.100 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.100 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.100 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.100 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.100 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.101 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.101 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.101 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.101 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.101 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.101 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.101 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.101 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.102 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.103 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.103 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.103 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.122 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.134 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.135 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.135 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.135 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.135 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.135 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.135 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.135 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.136 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.136 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.136 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.136 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.137 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.137 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.137 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.137 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.137 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.138 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.138 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.138 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.138 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.138 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.139 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.139 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.139 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.139 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.140 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.140 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.140 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.140 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.140 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.141 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.141 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.141 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.141 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.141 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.141 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.142 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.142 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.142 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.142 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.142 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.142 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.142 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.142 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.143 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.143 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.143 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.143 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.143 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.143 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.143 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.144 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.144 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.144 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.144 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.144 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.144 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.144 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.145 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.145 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.145 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.145 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.145 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.145 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.145 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.145 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.146 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.146 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.146 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.146 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.146 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.146 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.146 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.146 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.146 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.146 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.147 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.147 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.147 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.147 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.147 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.147 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.147 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.147 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.147 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.147 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.147 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.147 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.167 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.179 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.180 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.180 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.180 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.180 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.180 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.180 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.181 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.181 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.181 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.181 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.181 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.182 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.182 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.182 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.182 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.183 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.183 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.183 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.183 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.184 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.184 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.184 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.184 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.184 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.184 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.185 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.185 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.185 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.185 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.185 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.185 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.185 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.185 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.186 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.186 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.186 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.186 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.186 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.186 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.186 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.187 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.187 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.187 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.187 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.187 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.187 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.187 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.187 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.188 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.188 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.188 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.188 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.188 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.188 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.189 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.189 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.189 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.189 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.189 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.189 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.189 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.189 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.189 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.190 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.190 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.190 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.190 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.190 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.190 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.191 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.191 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.191 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.191 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.191 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.191 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.191 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.191 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.191 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.192 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.192 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.192 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.192 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.192 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.192 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.192 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.192 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.192 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.192 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.220 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.231 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.232 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'accountService'
08:19:34.232 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'accountService'
08:19:34.234 [main] DEBUG org.springframework.beans.factory.annotation.InjectionMetadata - Registered injected element on class [com.diguage.wanwan.service.account.AccountService]: AutowiredFieldElement for private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao
08:19:34.234 [main] DEBUG org.springframework.beans.factory.annotation.InjectionMetadata - Registered injected element on class [com.diguage.wanwan.service.account.AccountService]: AutowiredFieldElement for private com.diguage.wanwan.dao.TaskMapper com.diguage.wanwan.service.account.AccountService.taskDao
08:19:34.234 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'accountService' to allow for resolving potential circular references
08:19:34.237 [main] DEBUG org.springframework.beans.factory.annotation.InjectionMetadata - Processing injected element of bean 'accountService': AutowiredFieldElement for private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao
08:19:34.238 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'cityMapper'
08:19:34.238 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'cityMapper'
08:19:34.238 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'cityMapper' to allow for resolving potential circular references
08:19:34.239 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'cityMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.239 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'taskMapper'
08:19:34.239 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'taskMapper'
08:19:34.239 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'taskMapper' to allow for resolving potential circular references
08:19:34.240 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'taskMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.240 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'userMapper'
08:19:34.240 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'userMapper'
08:19:34.240 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'userMapper' to allow for resolving potential circular references
08:19:34.241 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'userMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.241 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.241 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.241 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.241 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.242 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.242 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.242 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.244 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.244 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.245 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.245 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.246 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.246 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.246 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.246 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.247 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.247 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.247 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.247 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.248 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.248 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.248 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.248 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.249 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.249 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.249 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.249 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.249 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.249 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.249 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.250 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.250 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.250 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.250 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.250 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.250 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.250 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.251 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.251 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.251 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.251 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.251 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.251 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.251 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.252 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.252 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.252 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.252 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.252 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.252 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.252 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.253 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.253 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.253 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.253 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.253 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.253 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.253 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.254 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.254 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.254 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.254 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.254 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.254 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.254 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.254 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.255 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.255 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.255 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.255 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.255 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.268 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.268 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.269 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.269 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.269 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.269 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.269 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.269 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.269 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.269 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.269 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.269 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.269 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.269 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.269 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.269 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.269 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.292 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.308 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.308 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.308 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.308 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.308 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.309 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.309 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.309 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.309 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.309 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.310 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.310 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.310 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.310 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.311 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.311 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.311 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.311 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.311 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.312 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.312 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.312 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.312 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.312 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.313 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.313 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.313 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.313 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.313 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.313 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.313 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.314 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.314 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.314 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.314 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.314 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.315 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.315 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.315 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.315 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.316 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.316 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.316 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.316 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.316 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.316 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.317 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.317 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.317 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.317 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.317 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.317 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.318 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.318 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.318 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.318 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.318 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.318 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.319 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.319 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.319 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.319 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.319 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.319 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.320 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.320 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.320 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.320 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.320 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.320 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.321 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.321 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.321 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.322 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.322 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.322 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.322 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.322 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.322 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.322 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.322 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.322 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.322 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.322 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.322 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.322 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.322 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.322 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.322 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.344 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.357 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.357 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'userMapper'
08:19:34.357 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'userMapper'
08:19:34.357 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'userMapper' to allow for resolving potential circular references
08:19:34.358 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'taskMapper'
08:19:34.358 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'taskMapper'
08:19:34.358 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'taskMapper' to allow for resolving potential circular references
08:19:34.359 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'taskMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.359 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'userMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.359 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.359 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.359 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.359 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.360 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.360 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.360 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.360 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.360 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.361 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.361 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.361 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.361 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.362 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.362 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.362 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.362 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.362 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.362 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.362 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.363 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.363 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.363 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.363 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.363 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.363 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.364 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.364 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.364 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.364 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.364 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.364 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.364 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.364 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.364 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.365 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.365 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.365 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.365 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.365 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.365 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.365 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.366 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.366 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.366 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.366 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.366 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.366 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.367 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.367 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.367 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.367 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.367 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.367 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.368 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.368 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.368 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.368 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.369 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.369 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.369 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.369 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.369 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.369 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.369 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.369 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.370 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.370 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.370 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.370 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.370 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.370 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.370 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.370 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.370 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.370 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.370 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.371 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.371 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.371 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.371 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.371 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.371 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.371 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.371 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.371 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.371 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.371 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.387 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.396 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.396 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.396 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.396 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.396 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.397 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.397 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.397 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.397 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.397 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.398 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.398 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.399 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.399 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.399 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.400 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.400 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.400 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.400 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.400 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.401 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.401 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.401 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.401 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.402 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.402 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.402 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.402 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.402 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.402 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.403 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.403 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.403 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.403 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.403 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.404 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.404 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.404 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.404 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.404 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.405 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.405 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.405 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.405 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.405 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.405 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.405 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.405 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.406 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.406 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.406 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.406 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.406 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.406 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.406 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.407 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.407 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.407 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.407 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.407 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.407 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.407 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.408 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.408 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.408 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.408 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.408 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.408 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.408 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.408 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.409 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.410 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.428 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.437 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.437 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.437 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.438 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.438 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.438 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.438 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.438 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.438 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.438 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.439 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.439 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.439 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.439 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.439 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.440 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.440 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.440 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.440 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.440 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.440 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.441 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.441 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.441 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.441 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.441 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.441 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.441 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.442 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.442 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.442 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.442 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.442 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.442 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.442 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.442 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.442 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.443 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.443 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.443 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.443 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.443 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.443 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.443 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.443 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.444 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.444 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.444 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.444 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.444 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.444 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.444 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.444 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.444 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.445 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.445 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.445 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.445 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.445 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.445 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.445 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.445 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.446 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.446 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.446 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.446 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.446 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.446 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.446 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.446 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.446 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.447 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.447 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.462 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.471 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.471 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'taskMapper'
08:19:34.471 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'taskMapper'
08:19:34.471 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'taskMapper' to allow for resolving potential circular references
08:19:34.472 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'cityMapper'
08:19:34.472 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'cityMapper'
08:19:34.472 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'cityMapper' to allow for resolving potential circular references
08:19:34.473 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'cityMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.473 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'taskMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.473 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'userMapper'
08:19:34.473 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'userMapper'
08:19:34.473 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'userMapper' to allow for resolving potential circular references
08:19:34.473 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'userMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.474 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.474 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.474 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.474 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.474 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.474 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.474 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.474 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.474 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.475 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.475 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.475 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.475 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.476 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.476 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.476 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.476 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.476 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.476 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.477 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.477 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.477 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.477 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.477 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.477 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.478 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.478 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.478 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.478 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.478 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.478 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.478 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.478 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.479 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.479 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.479 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.480 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.480 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.480 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.480 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.480 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.481 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.481 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.481 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.481 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.481 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.481 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.481 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.481 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.482 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.482 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.482 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.482 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.482 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.482 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.482 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.482 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.483 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.483 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.483 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.483 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.483 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.483 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.483 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.483 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.483 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.484 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.484 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.484 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.484 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.484 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.484 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.484 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.484 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.484 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.484 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.484 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.484 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.485 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.485 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.485 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.485 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.485 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.485 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.485 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.485 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.485 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.485 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.500 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.508 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.508 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.508 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.508 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.508 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.508 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.509 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.509 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.509 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.509 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.509 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.509 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.510 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.510 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.510 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.510 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.510 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.511 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.511 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.511 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.511 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.511 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.511 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.511 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.512 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.512 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.512 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.512 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.512 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.512 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.512 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.512 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.512 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.513 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.513 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.513 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.513 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.513 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.513 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.513 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.513 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.514 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.514 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.514 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.514 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.514 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.514 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.514 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.514 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.514 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.515 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.515 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.515 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.515 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.515 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.515 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.515 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.515 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.515 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.516 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.516 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.516 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.516 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.516 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.516 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.516 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.516 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.516 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.517 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.518 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.518 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.518 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.532 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.540 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.540 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'userMapper'
08:19:34.540 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'userMapper'
08:19:34.540 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'userMapper' to allow for resolving potential circular references
08:19:34.541 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'cityMapper'
08:19:34.541 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'cityMapper'
08:19:34.541 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'cityMapper' to allow for resolving potential circular references
08:19:34.542 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'cityMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.542 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'userMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.542 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.542 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.542 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.542 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.542 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.542 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.542 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.542 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.542 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.543 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.543 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.543 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.543 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.543 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.544 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.544 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.544 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.544 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.544 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.544 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.544 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.545 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.545 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.545 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.545 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.545 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.545 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.545 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.545 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.546 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.546 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.546 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.546 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.546 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.546 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.546 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.546 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.546 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.546 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.547 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.547 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.547 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.547 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.547 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.547 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.547 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.547 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.547 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.548 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.548 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.548 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.548 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.548 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.548 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.548 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.548 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.548 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.549 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.549 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.549 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.549 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.549 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.549 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.549 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.549 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.550 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.550 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.550 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.550 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.550 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.550 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.550 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.551 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.551 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.551 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.551 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.551 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.551 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.551 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.551 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.551 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.551 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.551 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.551 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.551 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.551 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.551 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.551 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.565 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.573 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.573 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.573 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.573 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.573 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.574 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.574 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.574 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.574 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.574 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.574 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.575 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.575 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.575 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.575 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.575 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.576 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.576 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.576 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.576 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.576 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.576 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.577 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.577 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.577 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.577 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.577 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.577 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.577 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.577 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.577 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.578 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.578 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.578 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.578 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.578 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.578 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.578 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.578 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.578 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.579 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.579 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.579 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.579 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.579 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.579 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.579 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.579 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.579 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.580 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.580 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.580 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.580 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.580 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.580 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.580 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.581 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.581 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.581 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.581 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.581 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.581 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.581 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.581 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.582 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.582 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.582 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.582 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.582 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.582 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.582 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.582 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.582 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.583 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.583 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.583 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.583 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.583 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.583 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.583 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.583 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.583 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.583 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.583 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.583 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.583 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.583 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.583 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.583 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.598 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.606 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.606 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.606 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.606 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.606 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.606 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.606 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.607 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.607 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.607 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.607 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.607 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.607 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.608 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.608 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.608 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.608 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.608 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.608 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.609 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.609 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.609 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.609 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.609 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.609 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.609 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.610 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.610 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.610 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.610 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.610 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.610 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.610 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.610 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.610 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.610 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.611 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.611 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.611 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.611 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.611 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.611 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.611 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.611 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.612 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.612 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.612 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.612 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.612 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.612 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.612 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.612 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.613 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.613 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.613 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.613 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.614 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.614 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.614 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.614 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.614 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.615 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.615 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.615 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.615 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.615 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.615 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.616 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.617 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.617 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.617 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.617 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.635 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.645 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.646 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'userMapper'
08:19:34.646 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'userMapper'
08:19:34.646 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'userMapper' to allow for resolving potential circular references
08:19:34.647 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'cityMapper'
08:19:34.647 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'cityMapper'
08:19:34.647 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'cityMapper' to allow for resolving potential circular references
08:19:34.648 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'cityMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.648 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'taskMapper'
08:19:34.648 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'taskMapper'
08:19:34.648 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'taskMapper' to allow for resolving potential circular references
08:19:34.649 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'taskMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.649 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'userMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.649 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.649 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.649 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.649 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.649 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.649 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.650 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.650 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.650 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.650 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.650 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.651 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.651 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.651 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.651 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.651 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.651 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.652 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.652 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.652 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.652 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.652 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.652 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.653 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.653 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.653 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.653 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.653 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.653 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.653 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.653 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.653 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.653 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.654 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.654 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.654 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.654 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.654 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.654 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.654 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.654 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.655 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.655 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.655 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.655 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.655 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.655 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.655 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.655 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.655 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.656 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.656 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.656 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.656 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.656 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.656 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.656 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.656 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.657 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.657 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.657 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.657 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.657 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.657 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.657 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.657 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.658 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.659 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.659 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.659 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.659 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.674 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.686 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.686 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.686 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.686 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.686 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.687 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.687 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.687 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.687 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.687 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.688 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.688 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.688 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.688 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.688 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.688 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.689 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.689 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.689 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.689 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.689 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.689 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.690 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.690 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.690 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.690 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.690 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.691 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.691 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.691 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.691 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.691 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.691 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.691 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.692 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.692 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.692 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.692 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.692 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.693 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.693 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.693 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.693 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.693 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.693 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.694 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.694 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.694 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.694 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.695 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.695 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.695 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.695 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.695 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.695 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.696 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.696 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.696 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.696 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.696 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.696 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.697 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.697 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.697 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.697 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.697 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.698 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.698 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.698 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.698 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.698 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.698 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.698 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.699 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.699 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.699 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.699 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.699 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.699 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.699 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.699 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.699 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.699 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.699 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.699 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.699 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.699 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.699 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.699 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.718 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.733 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.734 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'taskMapper'
08:19:34.734 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'taskMapper'
08:19:34.734 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'taskMapper' to allow for resolving potential circular references
08:19:34.735 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'cityMapper'
08:19:34.735 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'cityMapper'
08:19:34.735 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'cityMapper' to allow for resolving potential circular references
08:19:34.735 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'cityMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.735 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning eagerly cached instance of singleton bean 'taskMapper' that is not fully initialized yet - a consequence of a circular reference
08:19:34.736 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.736 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.736 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.736 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.736 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.736 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.736 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.736 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.736 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.737 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.737 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.737 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.737 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.738 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.738 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.738 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.738 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.738 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.739 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.739 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.739 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.739 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.739 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.740 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.740 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.740 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.740 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.740 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.740 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.740 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.741 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.741 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.741 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.741 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.741 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.741 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.742 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.742 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.742 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.742 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.742 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.742 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.742 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.742 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.743 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.744 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.744 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.744 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.744 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.744 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.745 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.745 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.745 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.745 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.745 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.745 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.746 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.746 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.746 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.746 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.746 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.746 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.747 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.747 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.747 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.747 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.747 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.747 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.748 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.748 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.748 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.748 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.748 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.748 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.748 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.748 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.748 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.748 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.748 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.748 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.748 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.748 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.748 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.748 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.771 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.781 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.782 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.782 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.782 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.782 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.783 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.783 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.783 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.783 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.783 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.783 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.784 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.784 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.784 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.784 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.784 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.785 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.785 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.785 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.785 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.785 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.786 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.786 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.786 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.786 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.786 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.786 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.787 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.787 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.787 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.787 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.787 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.787 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.787 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.788 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.788 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.788 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.788 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.788 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.789 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.789 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.789 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.789 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.789 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.790 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.790 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.790 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.790 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.790 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.791 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.791 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.791 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.791 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.791 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.791 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.792 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.792 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.792 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.792 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.792 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.793 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.793 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.793 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.793 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.793 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.794 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.794 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.794 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.794 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.794 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.794 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.794 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.795 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.795 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.813 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.823 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.824 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating shared instance of singleton bean 'sqlSessionFactory'
08:19:34.824 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Creating instance of bean 'sqlSessionFactory'
08:19:34.824 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Eagerly caching bean 'sqlSessionFactory' to allow for resolving potential circular references
08:19:34.825 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Returning cached instance of singleton bean 'dataSource'
08:19:34.825 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Looking for matching resources in directory tree [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis]
08:19:34.825 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Searching directory [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis] for files matching pattern [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/*Mapper.xml]
08:19:34.825 [main] DEBUG org.springframework.core.io.support.PathMatchingResourcePatternResolver - Resolved location pattern [classpath:/mybatis/*Mapper.xml] to resources [file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml], file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/UserMapper.xml]]
08:19:34.825 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Invoking afterPropertiesSet() on bean with name 'sqlSessionFactory'
08:19:34.825 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Property 'configLocation' not specified, using default MyBatis Configuration
08:19:34.826 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.826 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.826 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: City.class
08:19:34.827 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample.class
08:19:34.827 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criteria.class
08:19:34.827 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$Criterion.class
08:19:34.827 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: CityExample$GeneratedCriteria.class
08:19:34.827 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: Task.class
08:19:34.828 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample.class
08:19:34.828 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criteria.class
08:19:34.828 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$Criterion.class
08:19:34.828 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: TaskExample$GeneratedCriteria.class
08:19:34.829 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: User.class
08:19:34.829 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample.class
08:19:34.829 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criteria.class
08:19:34.829 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$Criterion.class
08:19:34.829 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: UserExample$GeneratedCriteria.class
08:19:34.829 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Listing file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity
08:19:34.830 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.830 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/City.class
08:19:34.830 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 Q
08:19:34.830 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.830 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample.class
08:19:34.830 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.830 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.830 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criteria.class
08:19:34.831 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.831 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.831 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$Criterion.class
08:19:34.831 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.831 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.831 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/CityExample$GeneratedCriteria.class
08:19:34.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/Task.class
08:19:34.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 3
08:19:34.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample.class
08:19:34.832 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.833 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.833 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criteria.class
08:19:34.833 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.833 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.833 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$Criterion.class
08:19:34.833 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.833 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.834 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/TaskExample$GeneratedCriteria.class
08:19:34.834 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2
08:19:34.834 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.834 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/User.class
08:19:34.834 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 �
08:19:34.834 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.834 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample.class
08:19:34.835 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 O
08:19:34.835 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.835 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criteria.class
08:19:34.835 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2^
08:19:34.835 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.835 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$Criterion.class
08:19:34.835 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2 J	 
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Find JAR URL: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Not a JAR: file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/entity/UserExample$GeneratedCriteria.class
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Reader entry: ����   2�
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.City matches criteria [is assignable to Object]
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample matches criteria [is assignable to Object]
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criteria matches criteria [is assignable to Object]
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$Criterion matches criteria [is assignable to Object]
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.CityExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.Task matches criteria [is assignable to Object]
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample matches criteria [is assignable to Object]
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criteria matches criteria [is assignable to Object]
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$Criterion matches criteria [is assignable to Object]
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.TaskExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.User matches criteria [is assignable to Object]
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample matches criteria [is assignable to Object]
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criteria matches criteria [is assignable to Object]
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$Criterion matches criteria [is assignable to Object]
08:19:34.836 [main] DEBUG org.apache.ibatis.io.ResolverUtil - Checking to see if class com.diguage.wanwan.entity.UserExample$GeneratedCriteria matches criteria [is assignable to Object]
08:19:34.837 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Scanned package: 'com.diguage.wanwan.entity' for aliases
08:19:34.854 [main] DEBUG org.mybatis.spring.SqlSessionFactoryBean - Parsed mapper file: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/CityMapper.xml]'
08:19:34.863 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Ignoring bean creation exception on FactoryBean type check: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
08:19:34.877 [main] WARN  org.springframework.web.context.support.XmlWebApplicationContext - Exception encountered during context initialization - cancelling refresh attempt
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'shiroFilter' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext-shiro.xml]: Cannot resolve reference to bean 'securityManager' while setting bean property 'securityManager'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'securityManager' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext-shiro.xml]: Cannot resolve reference to bean 'shiroDbRealm' while setting bean property 'realm'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'shiroDbRealm': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: protected com.diguage.wanwan.service.account.AccountService com.diguage.wanwan.service.account.ShiroDbRealm.accountService; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'accountService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:336) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:198) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.context.support.PostProcessorRegistrationDelegate.registerBeanPostProcessors(PostProcessorRegistrationDelegate.java:232) ~[spring-context-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.registerBeanPostProcessors(AbstractApplicationContext.java:620) ~[spring-context-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:467) ~[spring-context-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.web.context.ContextLoader.configureAndRefreshWebApplicationContext(ContextLoader.java:403) [spring-web-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.web.context.ContextLoader.initWebApplicationContext(ContextLoader.java:306) [spring-web-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.web.context.ContextLoaderListener.contextInitialized(ContextLoaderListener.java:106) [spring-web-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.eclipse.jetty.server.handler.ContextHandler.startContext(ContextHandler.java:746) [jetty-server-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.servlet.ServletContextHandler.startContext(ServletContextHandler.java:238) [jetty-servlet-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1240) [jetty-webapp-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.server.handler.ContextHandler.doStart(ContextHandler.java:689) [jetty-server-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.webapp.WebAppContext.doStart(WebAppContext.java:482) [jetty-webapp-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.mortbay.jetty.plugin.JettyWebAppContext.doStart(JettyWebAppContext.java:256) [jetty-maven-plugin-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64) [jetty-util-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229) [jetty-server-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.server.handler.ContextHandlerCollection.doStart(ContextHandlerCollection.java:172) [jetty-server-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64) [jetty-util-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229) [jetty-server-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64) [jetty-util-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.server.handler.HandlerWrapper.doStart(HandlerWrapper.java:95) [jetty-server-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.server.Server.doStart(Server.java:281) [jetty-server-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.mortbay.jetty.plugin.JettyServer.doStart(JettyServer.java:65) [jetty-maven-plugin-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64) [jetty-util-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.mortbay.jetty.plugin.AbstractJettyMojo.startJetty(AbstractJettyMojo.java:520) [jetty-maven-plugin-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.mortbay.jetty.plugin.AbstractJettyMojo.execute(AbstractJettyMojo.java:365) [jetty-maven-plugin-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.mortbay.jetty.plugin.JettyRunMojo.execute(JettyRunMojo.java:521) [jetty-maven-plugin-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:132) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:208) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:153) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:145) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:116) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:80) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:51) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:120) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:347) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:154) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:582) [maven-embedder-3.2.3.jar:3.2.3]
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:214) [maven-embedder-3.2.3.jar:3.2.3]
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:158) [maven-embedder-3.2.3.jar:3.2.3]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.7.0_72]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57) ~[na:1.7.0_72]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.7.0_72]
	at java.lang.reflect.Method.invoke(Method.java:606) ~[na:1.7.0_72]
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289) [plexus-classworlds-2.5.1.jar:na]
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229) [plexus-classworlds-2.5.1.jar:na]
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415) [plexus-classworlds-2.5.1.jar:na]
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356) [plexus-classworlds-2.5.1.jar:na]
	at org.codehaus.classworlds.Launcher.main(Launcher.java:46) [plexus-classworlds-2.5.1.jar:na]
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'securityManager' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext-shiro.xml]: Cannot resolve reference to bean 'shiroDbRealm' while setting bean property 'realm'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'shiroDbRealm': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: protected com.diguage.wanwan.service.account.AccountService com.diguage.wanwan.service.account.ShiroDbRealm.accountService; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'accountService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:336) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:328) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	... 56 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'shiroDbRealm': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: protected com.diguage.wanwan.service.account.AccountService com.diguage.wanwan.service.account.ShiroDbRealm.accountService; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'accountService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:301) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1186) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:328) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	... 66 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Could not autowire field: protected com.diguage.wanwan.service.account.AccountService com.diguage.wanwan.service.account.ShiroDbRealm.accountService; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'accountService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:522) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:298) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	... 74 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'accountService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:301) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1186) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.findAutowireCandidates(DefaultListableBeanFactory.java:1021) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:964) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:862) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:494) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	... 76 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:522) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:298) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	... 87 common frames omitted
Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.raiseNoSuchBeanDefinitionException(DefaultListableBeanFactory.java:1118) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:967) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:862) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:494) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	... 89 common frames omitted
08:19:34.878 [main] DEBUG org.springframework.beans.factory.support.DefaultListableBeanFactory - Destroying singletons in org.springframework.beans.factory.support.DefaultListableBeanFactory@6c9657d4: defining beans [accountService,cityService,taskService,org.springframework.context.annotation.internalConfigurationAnnotationProcessor,org.springframework.context.annotation.internalAutowiredAnnotationProcessor,org.springframework.context.annotation.internalRequiredAnnotationProcessor,org.springframework.context.annotation.internalCommonAnnotationProcessor,sqlSessionFactory,org.mybatis.spring.mapper.MapperScannerConfigurer#0,transactionManager,org.springframework.aop.config.internalAutoProxyCreator,org.springframework.transaction.annotation.AnnotationTransactionAttributeSource#0,org.springframework.transaction.interceptor.TransactionInterceptor#0,org.springframework.transaction.config.internalTransactionAdvisor,validator,org.springframework.context.support.PropertySourcesPlaceholderConfigurer#0,dataSource,securityManager,shiroDbRealm,shiroFilter,shiroEhcacheManager,lifecycleBeanPostProcessor,org.springframework.context.annotation.ConfigurationClassPostProcessor.importAwareProcessor,org.springframework.context.annotation.ConfigurationClassPostProcessor.enhancedConfigurationProcessor,cityMapper,taskMapper,userMapper]; root of factory hierarchy
08:19:34.878 [main] DEBUG org.springframework.beans.factory.support.DisposableBeanAdapter - Invoking destroy method 'close' on bean with name 'dataSource'
08:19:34.880 [main] ERROR org.springframework.web.context.ContextLoader - Context initialization failed
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'shiroFilter' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext-shiro.xml]: Cannot resolve reference to bean 'securityManager' while setting bean property 'securityManager'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'securityManager' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext-shiro.xml]: Cannot resolve reference to bean 'shiroDbRealm' while setting bean property 'realm'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'shiroDbRealm': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: protected com.diguage.wanwan.service.account.AccountService com.diguage.wanwan.service.account.ShiroDbRealm.accountService; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'accountService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:336) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:198) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.context.support.PostProcessorRegistrationDelegate.registerBeanPostProcessors(PostProcessorRegistrationDelegate.java:232) ~[spring-context-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.registerBeanPostProcessors(AbstractApplicationContext.java:620) ~[spring-context-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:467) ~[spring-context-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.web.context.ContextLoader.configureAndRefreshWebApplicationContext(ContextLoader.java:403) ~[spring-web-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.web.context.ContextLoader.initWebApplicationContext(ContextLoader.java:306) ~[spring-web-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.web.context.ContextLoaderListener.contextInitialized(ContextLoaderListener.java:106) [spring-web-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.eclipse.jetty.server.handler.ContextHandler.startContext(ContextHandler.java:746) [jetty-server-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.servlet.ServletContextHandler.startContext(ServletContextHandler.java:238) [jetty-servlet-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1240) [jetty-webapp-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.server.handler.ContextHandler.doStart(ContextHandler.java:689) [jetty-server-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.webapp.WebAppContext.doStart(WebAppContext.java:482) [jetty-webapp-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.mortbay.jetty.plugin.JettyWebAppContext.doStart(JettyWebAppContext.java:256) [jetty-maven-plugin-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64) [jetty-util-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229) [jetty-server-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.server.handler.ContextHandlerCollection.doStart(ContextHandlerCollection.java:172) [jetty-server-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64) [jetty-util-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229) [jetty-server-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64) [jetty-util-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.server.handler.HandlerWrapper.doStart(HandlerWrapper.java:95) [jetty-server-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.server.Server.doStart(Server.java:281) [jetty-server-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.mortbay.jetty.plugin.JettyServer.doStart(JettyServer.java:65) [jetty-maven-plugin-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64) [jetty-util-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.mortbay.jetty.plugin.AbstractJettyMojo.startJetty(AbstractJettyMojo.java:520) [jetty-maven-plugin-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.mortbay.jetty.plugin.AbstractJettyMojo.execute(AbstractJettyMojo.java:365) [jetty-maven-plugin-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.mortbay.jetty.plugin.JettyRunMojo.execute(JettyRunMojo.java:521) [jetty-maven-plugin-7.6.16.v20140903.jar:7.6.16.v20140903]
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:132) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:208) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:153) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:145) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:116) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:80) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:51) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:120) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:347) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:154) [maven-core-3.2.3.jar:3.2.3]
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:582) [maven-embedder-3.2.3.jar:3.2.3]
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:214) [maven-embedder-3.2.3.jar:3.2.3]
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:158) [maven-embedder-3.2.3.jar:3.2.3]
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method) ~[na:1.7.0_72]
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57) ~[na:1.7.0_72]
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43) ~[na:1.7.0_72]
	at java.lang.reflect.Method.invoke(Method.java:606) ~[na:1.7.0_72]
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289) [plexus-classworlds-2.5.1.jar:na]
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229) [plexus-classworlds-2.5.1.jar:na]
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415) [plexus-classworlds-2.5.1.jar:na]
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356) [plexus-classworlds-2.5.1.jar:na]
	at org.codehaus.classworlds.Launcher.main(Launcher.java:46) [plexus-classworlds-2.5.1.jar:na]
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'securityManager' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext-shiro.xml]: Cannot resolve reference to bean 'shiroDbRealm' while setting bean property 'realm'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'shiroDbRealm': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: protected com.diguage.wanwan.service.account.AccountService com.diguage.wanwan.service.account.ShiroDbRealm.accountService; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'accountService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:336) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:328) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	... 56 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'shiroDbRealm': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: protected com.diguage.wanwan.service.account.AccountService com.diguage.wanwan.service.account.ShiroDbRealm.accountService; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'accountService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:301) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1186) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:328) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	... 66 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Could not autowire field: protected com.diguage.wanwan.service.account.AccountService com.diguage.wanwan.service.account.ShiroDbRealm.accountService; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'accountService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:522) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:298) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	... 74 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'accountService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:301) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1186) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.findAutowireCandidates(DefaultListableBeanFactory.java:1021) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:964) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:862) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:494) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	... 76 common frames omitted
Caused by: org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:522) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:298) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	... 87 common frames omitted
Caused by: org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.raiseNoSuchBeanDefinitionException(DefaultListableBeanFactory.java:1118) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:967) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:862) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:494) ~[spring-beans-4.0.9.RELEASE.jar:4.0.9.RELEASE]
	... 89 common frames omitted
2015-01-14 08:19:34.881:WARN:oejw.WebAppContext:Failed startup of context o.m.j.p.JettyWebAppContext{/wanwan-site,file:/Users/diguage/develop/java/Projects/wanwan-site/src/main/webapp/},file:/Users/diguage/develop/java/Projects/wanwan-site/src/main/webapp/
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'shiroFilter' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext-shiro.xml]: Cannot resolve reference to bean 'securityManager' while setting bean property 'securityManager'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'securityManager' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext-shiro.xml]: Cannot resolve reference to bean 'shiroDbRealm' while setting bean property 'realm'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'shiroDbRealm': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: protected com.diguage.wanwan.service.account.AccountService com.diguage.wanwan.service.account.ShiroDbRealm.accountService; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'accountService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'cityMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/CityMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'taskMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/TaskMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap|Related cause: org.springframework.beans.factory.UnsatisfiedDependencyException: Error creating bean with name 'userMapper' defined in file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/com/diguage/wanwan/dao/UserMapper.class]: Unsatisfied dependency expressed through bean property 'sqlSessionFactory': : Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'sqlSessionFactory' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext.xml]: Invocation of init method failed; nested exception is org.springframework.core.NestedIOException: Failed to parse mapping resource: 'file [/Users/diguage/develop/java/Projects/wanwan-site/target/classes/mybatis/TaskMapper.xml]'; nested exception is org.apache.ibatis.builder.BuilderException: Error parsing Mapper XML. Cause: java.lang.IllegalArgumentException: Result Maps collection already contains value for com.diguage.wanwan.dao.TaskMapper.BaseResultMap
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:336)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:198)
	at org.springframework.context.support.PostProcessorRegistrationDelegate.registerBeanPostProcessors(PostProcessorRegistrationDelegate.java:232)
	at org.springframework.context.support.AbstractApplicationContext.registerBeanPostProcessors(AbstractApplicationContext.java:620)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:467)
	at org.springframework.web.context.ContextLoader.configureAndRefreshWebApplicationContext(ContextLoader.java:403)
	at org.springframework.web.context.ContextLoader.initWebApplicationContext(ContextLoader.java:306)
	at org.springframework.web.context.ContextLoaderListener.contextInitialized(ContextLoaderListener.java:106)
	at org.eclipse.jetty.server.handler.ContextHandler.startContext(ContextHandler.java:746)
	at org.eclipse.jetty.servlet.ServletContextHandler.startContext(ServletContextHandler.java:238)
	at org.eclipse.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1240)
	at org.eclipse.jetty.server.handler.ContextHandler.doStart(ContextHandler.java:689)
	at org.eclipse.jetty.webapp.WebAppContext.doStart(WebAppContext.java:482)
	at org.mortbay.jetty.plugin.JettyWebAppContext.doStart(JettyWebAppContext.java:256)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229)
	at org.eclipse.jetty.server.handler.ContextHandlerCollection.doStart(ContextHandlerCollection.java:172)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerWrapper.doStart(HandlerWrapper.java:95)
	at org.eclipse.jetty.server.Server.doStart(Server.java:281)
	at org.mortbay.jetty.plugin.JettyServer.doStart(JettyServer.java:65)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.mortbay.jetty.plugin.AbstractJettyMojo.startJetty(AbstractJettyMojo.java:520)
	at org.mortbay.jetty.plugin.AbstractJettyMojo.execute(AbstractJettyMojo.java:365)
	at org.mortbay.jetty.plugin.JettyRunMojo.execute(JettyRunMojo.java:521)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:132)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:208)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:153)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:145)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:116)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:80)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:51)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:120)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:347)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:154)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:582)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:214)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:158)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
	at org.codehaus.classworlds.Launcher.main(Launcher.java:46)
Caused by: 
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'securityManager' defined in URL [file:/Users/diguage/develop/java/Projects/wanwan-site/target/classes/applicationContext-shiro.xml]: Cannot resolve reference to bean 'shiroDbRealm' while setting bean property 'realm'; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'shiroDbRealm': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: protected com.diguage.wanwan.service.account.AccountService com.diguage.wanwan.service.account.ShiroDbRealm.accountService; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'accountService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:336)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:328)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:198)
	at org.springframework.context.support.PostProcessorRegistrationDelegate.registerBeanPostProcessors(PostProcessorRegistrationDelegate.java:232)
	at org.springframework.context.support.AbstractApplicationContext.registerBeanPostProcessors(AbstractApplicationContext.java:620)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:467)
	at org.springframework.web.context.ContextLoader.configureAndRefreshWebApplicationContext(ContextLoader.java:403)
	at org.springframework.web.context.ContextLoader.initWebApplicationContext(ContextLoader.java:306)
	at org.springframework.web.context.ContextLoaderListener.contextInitialized(ContextLoaderListener.java:106)
	at org.eclipse.jetty.server.handler.ContextHandler.startContext(ContextHandler.java:746)
	at org.eclipse.jetty.servlet.ServletContextHandler.startContext(ServletContextHandler.java:238)
	at org.eclipse.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1240)
	at org.eclipse.jetty.server.handler.ContextHandler.doStart(ContextHandler.java:689)
	at org.eclipse.jetty.webapp.WebAppContext.doStart(WebAppContext.java:482)
	at org.mortbay.jetty.plugin.JettyWebAppContext.doStart(JettyWebAppContext.java:256)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229)
	at org.eclipse.jetty.server.handler.ContextHandlerCollection.doStart(ContextHandlerCollection.java:172)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerWrapper.doStart(HandlerWrapper.java:95)
	at org.eclipse.jetty.server.Server.doStart(Server.java:281)
	at org.mortbay.jetty.plugin.JettyServer.doStart(JettyServer.java:65)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.mortbay.jetty.plugin.AbstractJettyMojo.startJetty(AbstractJettyMojo.java:520)
	at org.mortbay.jetty.plugin.AbstractJettyMojo.execute(AbstractJettyMojo.java:365)
	at org.mortbay.jetty.plugin.JettyRunMojo.execute(JettyRunMojo.java:521)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:132)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:208)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:153)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:145)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:116)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:80)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:51)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:120)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:347)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:154)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:582)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:214)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:158)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
	at org.codehaus.classworlds.Launcher.main(Launcher.java:46)
Caused by: 
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'shiroDbRealm': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: protected com.diguage.wanwan.service.account.AccountService com.diguage.wanwan.service.account.ShiroDbRealm.accountService; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'accountService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:301)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1186)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:328)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:328)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:198)
	at org.springframework.context.support.PostProcessorRegistrationDelegate.registerBeanPostProcessors(PostProcessorRegistrationDelegate.java:232)
	at org.springframework.context.support.AbstractApplicationContext.registerBeanPostProcessors(AbstractApplicationContext.java:620)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:467)
	at org.springframework.web.context.ContextLoader.configureAndRefreshWebApplicationContext(ContextLoader.java:403)
	at org.springframework.web.context.ContextLoader.initWebApplicationContext(ContextLoader.java:306)
	at org.springframework.web.context.ContextLoaderListener.contextInitialized(ContextLoaderListener.java:106)
	at org.eclipse.jetty.server.handler.ContextHandler.startContext(ContextHandler.java:746)
	at org.eclipse.jetty.servlet.ServletContextHandler.startContext(ServletContextHandler.java:238)
	at org.eclipse.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1240)
	at org.eclipse.jetty.server.handler.ContextHandler.doStart(ContextHandler.java:689)
	at org.eclipse.jetty.webapp.WebAppContext.doStart(WebAppContext.java:482)
	at org.mortbay.jetty.plugin.JettyWebAppContext.doStart(JettyWebAppContext.java:256)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229)
	at org.eclipse.jetty.server.handler.ContextHandlerCollection.doStart(ContextHandlerCollection.java:172)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerWrapper.doStart(HandlerWrapper.java:95)
	at org.eclipse.jetty.server.Server.doStart(Server.java:281)
	at org.mortbay.jetty.plugin.JettyServer.doStart(JettyServer.java:65)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.mortbay.jetty.plugin.AbstractJettyMojo.startJetty(AbstractJettyMojo.java:520)
	at org.mortbay.jetty.plugin.AbstractJettyMojo.execute(AbstractJettyMojo.java:365)
	at org.mortbay.jetty.plugin.JettyRunMojo.execute(JettyRunMojo.java:521)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:132)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:208)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:153)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:145)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:116)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:80)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:51)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:120)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:347)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:154)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:582)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:214)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:158)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
	at org.codehaus.classworlds.Launcher.main(Launcher.java:46)
Caused by: 
org.springframework.beans.factory.BeanCreationException: Could not autowire field: protected com.diguage.wanwan.service.account.AccountService com.diguage.wanwan.service.account.ShiroDbRealm.accountService; nested exception is org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'accountService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:522)
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:298)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1186)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:328)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:328)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:198)
	at org.springframework.context.support.PostProcessorRegistrationDelegate.registerBeanPostProcessors(PostProcessorRegistrationDelegate.java:232)
	at org.springframework.context.support.AbstractApplicationContext.registerBeanPostProcessors(AbstractApplicationContext.java:620)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:467)
	at org.springframework.web.context.ContextLoader.configureAndRefreshWebApplicationContext(ContextLoader.java:403)
	at org.springframework.web.context.ContextLoader.initWebApplicationContext(ContextLoader.java:306)
	at org.springframework.web.context.ContextLoaderListener.contextInitialized(ContextLoaderListener.java:106)
	at org.eclipse.jetty.server.handler.ContextHandler.startContext(ContextHandler.java:746)
	at org.eclipse.jetty.servlet.ServletContextHandler.startContext(ServletContextHandler.java:238)
	at org.eclipse.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1240)
	at org.eclipse.jetty.server.handler.ContextHandler.doStart(ContextHandler.java:689)
	at org.eclipse.jetty.webapp.WebAppContext.doStart(WebAppContext.java:482)
	at org.mortbay.jetty.plugin.JettyWebAppContext.doStart(JettyWebAppContext.java:256)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229)
	at org.eclipse.jetty.server.handler.ContextHandlerCollection.doStart(ContextHandlerCollection.java:172)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerWrapper.doStart(HandlerWrapper.java:95)
	at org.eclipse.jetty.server.Server.doStart(Server.java:281)
	at org.mortbay.jetty.plugin.JettyServer.doStart(JettyServer.java:65)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.mortbay.jetty.plugin.AbstractJettyMojo.startJetty(AbstractJettyMojo.java:520)
	at org.mortbay.jetty.plugin.AbstractJettyMojo.execute(AbstractJettyMojo.java:365)
	at org.mortbay.jetty.plugin.JettyRunMojo.execute(JettyRunMojo.java:521)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:132)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:208)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:153)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:145)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:116)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:80)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:51)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:120)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:347)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:154)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:582)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:214)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:158)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
	at org.codehaus.classworlds.Launcher.main(Launcher.java:46)
Caused by: 
org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'accountService': Injection of autowired dependencies failed; nested exception is org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:301)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1186)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.findAutowireCandidates(DefaultListableBeanFactory.java:1021)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:964)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:862)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:494)
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:298)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1186)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:328)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:328)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:198)
	at org.springframework.context.support.PostProcessorRegistrationDelegate.registerBeanPostProcessors(PostProcessorRegistrationDelegate.java:232)
	at org.springframework.context.support.AbstractApplicationContext.registerBeanPostProcessors(AbstractApplicationContext.java:620)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:467)
	at org.springframework.web.context.ContextLoader.configureAndRefreshWebApplicationContext(ContextLoader.java:403)
	at org.springframework.web.context.ContextLoader.initWebApplicationContext(ContextLoader.java:306)
	at org.springframework.web.context.ContextLoaderListener.contextInitialized(ContextLoaderListener.java:106)
	at org.eclipse.jetty.server.handler.ContextHandler.startContext(ContextHandler.java:746)
	at org.eclipse.jetty.servlet.ServletContextHandler.startContext(ServletContextHandler.java:238)
	at org.eclipse.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1240)
	at org.eclipse.jetty.server.handler.ContextHandler.doStart(ContextHandler.java:689)
	at org.eclipse.jetty.webapp.WebAppContext.doStart(WebAppContext.java:482)
	at org.mortbay.jetty.plugin.JettyWebAppContext.doStart(JettyWebAppContext.java:256)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229)
	at org.eclipse.jetty.server.handler.ContextHandlerCollection.doStart(ContextHandlerCollection.java:172)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerWrapper.doStart(HandlerWrapper.java:95)
	at org.eclipse.jetty.server.Server.doStart(Server.java:281)
	at org.mortbay.jetty.plugin.JettyServer.doStart(JettyServer.java:65)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.mortbay.jetty.plugin.AbstractJettyMojo.startJetty(AbstractJettyMojo.java:520)
	at org.mortbay.jetty.plugin.AbstractJettyMojo.execute(AbstractJettyMojo.java:365)
	at org.mortbay.jetty.plugin.JettyRunMojo.execute(JettyRunMojo.java:521)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:132)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:208)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:153)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:145)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:116)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:80)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:51)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:120)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:347)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:154)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:582)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:214)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:158)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
	at org.codehaus.classworlds.Launcher.main(Launcher.java:46)
Caused by: 
org.springframework.beans.factory.BeanCreationException: Could not autowire field: private com.diguage.wanwan.dao.UserMapper com.diguage.wanwan.service.account.AccountService.userDao; nested exception is org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:522)
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:298)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1186)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.findAutowireCandidates(DefaultListableBeanFactory.java:1021)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:964)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:862)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:494)
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:298)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1186)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:328)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:328)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:198)
	at org.springframework.context.support.PostProcessorRegistrationDelegate.registerBeanPostProcessors(PostProcessorRegistrationDelegate.java:232)
	at org.springframework.context.support.AbstractApplicationContext.registerBeanPostProcessors(AbstractApplicationContext.java:620)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:467)
	at org.springframework.web.context.ContextLoader.configureAndRefreshWebApplicationContext(ContextLoader.java:403)
	at org.springframework.web.context.ContextLoader.initWebApplicationContext(ContextLoader.java:306)
	at org.springframework.web.context.ContextLoaderListener.contextInitialized(ContextLoaderListener.java:106)
	at org.eclipse.jetty.server.handler.ContextHandler.startContext(ContextHandler.java:746)
	at org.eclipse.jetty.servlet.ServletContextHandler.startContext(ServletContextHandler.java:238)
	at org.eclipse.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1240)
	at org.eclipse.jetty.server.handler.ContextHandler.doStart(ContextHandler.java:689)
	at org.eclipse.jetty.webapp.WebAppContext.doStart(WebAppContext.java:482)
	at org.mortbay.jetty.plugin.JettyWebAppContext.doStart(JettyWebAppContext.java:256)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229)
	at org.eclipse.jetty.server.handler.ContextHandlerCollection.doStart(ContextHandlerCollection.java:172)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerWrapper.doStart(HandlerWrapper.java:95)
	at org.eclipse.jetty.server.Server.doStart(Server.java:281)
	at org.mortbay.jetty.plugin.JettyServer.doStart(JettyServer.java:65)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.mortbay.jetty.plugin.AbstractJettyMojo.startJetty(AbstractJettyMojo.java:520)
	at org.mortbay.jetty.plugin.AbstractJettyMojo.execute(AbstractJettyMojo.java:365)
	at org.mortbay.jetty.plugin.JettyRunMojo.execute(JettyRunMojo.java:521)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:132)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:208)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:153)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:145)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:116)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:80)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:51)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:120)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:347)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:154)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:582)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:214)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:158)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
	at org.codehaus.classworlds.Launcher.main(Launcher.java:46)
Caused by: 
org.springframework.beans.factory.NoSuchBeanDefinitionException: No qualifying bean of type [com.diguage.wanwan.dao.UserMapper] found for dependency: expected at least 1 bean which qualifies as autowire candidate for this dependency. Dependency annotations: {@org.springframework.beans.factory.annotation.Autowired(required=true)}
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.raiseNoSuchBeanDefinitionException(DefaultListableBeanFactory.java:1118)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:967)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:862)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:494)
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:298)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1186)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.findAutowireCandidates(DefaultListableBeanFactory.java:1021)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.doResolveDependency(DefaultListableBeanFactory.java:964)
	at org.springframework.beans.factory.support.DefaultListableBeanFactory.resolveDependency(DefaultListableBeanFactory.java:862)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor$AutowiredFieldElement.inject(AutowiredAnnotationBeanPostProcessor.java:494)
	at org.springframework.beans.factory.annotation.InjectionMetadata.inject(InjectionMetadata.java:88)
	at org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor.postProcessPropertyValues(AutowiredAnnotationBeanPostProcessor.java:298)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1186)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:328)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:193)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveReference(BeanDefinitionValueResolver.java:328)
	at org.springframework.beans.factory.support.BeanDefinitionValueResolver.resolveValueIfNecessary(BeanDefinitionValueResolver.java:108)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.applyPropertyValues(AbstractAutowireCapableBeanFactory.java:1457)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.populateBean(AbstractAutowireCapableBeanFactory.java:1198)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:537)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:475)
	at org.springframework.beans.factory.support.AbstractBeanFactory$1.getObject(AbstractBeanFactory.java:302)
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:229)
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:298)
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:198)
	at org.springframework.context.support.PostProcessorRegistrationDelegate.registerBeanPostProcessors(PostProcessorRegistrationDelegate.java:232)
	at org.springframework.context.support.AbstractApplicationContext.registerBeanPostProcessors(AbstractApplicationContext.java:620)
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:467)
	at org.springframework.web.context.ContextLoader.configureAndRefreshWebApplicationContext(ContextLoader.java:403)
	at org.springframework.web.context.ContextLoader.initWebApplicationContext(ContextLoader.java:306)
	at org.springframework.web.context.ContextLoaderListener.contextInitialized(ContextLoaderListener.java:106)
	at org.eclipse.jetty.server.handler.ContextHandler.startContext(ContextHandler.java:746)
	at org.eclipse.jetty.servlet.ServletContextHandler.startContext(ServletContextHandler.java:238)
	at org.eclipse.jetty.webapp.WebAppContext.startContext(WebAppContext.java:1240)
	at org.eclipse.jetty.server.handler.ContextHandler.doStart(ContextHandler.java:689)
	at org.eclipse.jetty.webapp.WebAppContext.doStart(WebAppContext.java:482)
	at org.mortbay.jetty.plugin.JettyWebAppContext.doStart(JettyWebAppContext.java:256)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229)
	at org.eclipse.jetty.server.handler.ContextHandlerCollection.doStart(ContextHandlerCollection.java:172)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerCollection.doStart(HandlerCollection.java:229)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.eclipse.jetty.server.handler.HandlerWrapper.doStart(HandlerWrapper.java:95)
	at org.eclipse.jetty.server.Server.doStart(Server.java:281)
	at org.mortbay.jetty.plugin.JettyServer.doStart(JettyServer.java:65)
	at org.eclipse.jetty.util.component.AbstractLifeCycle.start(AbstractLifeCycle.java:64)
	at org.mortbay.jetty.plugin.AbstractJettyMojo.startJetty(AbstractJettyMojo.java:520)
	at org.mortbay.jetty.plugin.AbstractJettyMojo.execute(AbstractJettyMojo.java:365)
	at org.mortbay.jetty.plugin.JettyRunMojo.execute(JettyRunMojo.java:521)
	at org.apache.maven.plugin.DefaultBuildPluginManager.executeMojo(DefaultBuildPluginManager.java:132)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:208)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:153)
	at org.apache.maven.lifecycle.internal.MojoExecutor.execute(MojoExecutor.java:145)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:116)
	at org.apache.maven.lifecycle.internal.LifecycleModuleBuilder.buildProject(LifecycleModuleBuilder.java:80)
	at org.apache.maven.lifecycle.internal.builder.singlethreaded.SingleThreadedBuilder.build(SingleThreadedBuilder.java:51)
	at org.apache.maven.lifecycle.internal.LifecycleStarter.execute(LifecycleStarter.java:120)
	at org.apache.maven.DefaultMaven.doExecute(DefaultMaven.java:347)
	at org.apache.maven.DefaultMaven.execute(DefaultMaven.java:154)
	at org.apache.maven.cli.MavenCli.execute(MavenCli.java:582)
	at org.apache.maven.cli.MavenCli.doMain(MavenCli.java:214)
	at org.apache.maven.cli.MavenCli.main(MavenCli.java:158)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:57)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:606)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launchEnhanced(Launcher.java:289)
	at org.codehaus.plexus.classworlds.launcher.Launcher.launch(Launcher.java:229)
	at org.codehaus.plexus.classworlds.launcher.Launcher.mainWithExitCode(Launcher.java:415)
	at org.codehaus.plexus.classworlds.launcher.Launcher.main(Launcher.java:356)
	at org.codehaus.classworlds.Launcher.main(Launcher.java:46)
2015-01-14 08:19:34.899:WARN:oejsh.RequestLogHandler:!RequestLog
[INFO] Started Jetty Server
2015-01-14 08:19:34.917:INFO:oejs.AbstractConnector:Started SelectChannelConnector@0.0.0.0:8080
```

