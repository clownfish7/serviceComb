package com.clownfish7.service;

import org.apache.servicecomb.provider.pojo.RpcReference;
import org.springframework.stereotype.Service;

/**
 * @author yzy
 * @classname RpcServiceImpl
 * @description Rpc服务消费方
 * @create 2019-09-19 19:31
 */
@Service
public class RpcServiceImpl implements RpcService {

    // 从注册中心找，找哪个应用程序下面的哪个微服务
    @RpcReference(microserviceName = "start.servicecomb.io:provider-rpc", schemaId = "helloRpc")
    private RpcService rpcService;

    @Override
    public String sayRpc(String name) {
        return rpcService.sayRpc(name);
    }
}
