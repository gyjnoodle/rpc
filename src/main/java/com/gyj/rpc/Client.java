package com.gyj.rpc;

import com.gyj.common.IProductService;

/**
 * @author: noodle
 */
public class Client {
    public static void main(String[] args)throws Exception {
        //其他不改变，这个地方可以直接换成Product
        IProductService productService = (IProductService) Stub.getStub(IProductService.class);
        System.out.println(productService.findProductById(321));
    }
}
