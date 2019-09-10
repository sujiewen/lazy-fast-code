spring:
  application:
    name: ${projectName}
  datasource:
    url: ${jdbcUrl}
    username: ${jdbcUser}
    password: ${jdbcPassword}
    driver-class-name: ${jdbcClassName}
    hikari:
      minimum-idle: 5
      maximum-pool-size: 15
      idle-timeout: 30000
      max-lifetime: 1800000
      connection-timeout: 30000
      connection-test-query: SELECT 1
swagger:
  exclude-path: /error