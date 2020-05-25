package com.gyj.common;

/**
 * @author: noodle
 */
public interface IProductService {
    /**
     * query product info
     * @param id
     * @return
     */
    Product findProductById(Integer id);
}
