package com.clownfish7.service;

import org.apache.servicecomb.provider.pojo.RpcSchema;

/**
 * @author yzy
 * @classname RpcServiceImpl
 * @description Rpc服务提供者
 * @create 2019-09-19 19:24
 */
@RpcSchema(schemaId = "helloRpc")
public class RpcServiceImpl implements RpcService {
    @Override
    public String sayRpc(String name) {
        return "hello "+name;
    }
}
