package com.gyj.rpc;

import com.gyj.common.IProductService;
import com.gyj.common.Product;
import com.gyj.common.User;

/**
 * 放在服务端的一个方法
 *
 * @author: noodle
 */
public class ProductServiceImpl implements IProductService {
    @Override
    public Product findProductById(Integer id) {
        return new Product(id, "Apple");
    }
}
