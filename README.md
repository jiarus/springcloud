## springcloud

> eureka1和eureka2提供eureaka server集群服务
>
> springcloud-1和springcloud-2是eureka客户端，注册到eureka中
> 
> springcloud-consumer消费springcloud-1、springcloud-2提供的服务，使用ribbon负载均衡,feign请求，hystrix熔断降级