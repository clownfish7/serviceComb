package com.clownfish7.controller;

import com.clownfish7.service.RpcService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yzy
 * @classname RpcController
 * @description TODO
 * @create 2019-09-19 19:42
 */
@RestController
public class RpcController {

    @Autowired
    private RpcService rpcService;

    @GetMapping("/rpc")
    public String sayRpc(String name) {
        return rpcService.sayRpc(name);
    }
}
