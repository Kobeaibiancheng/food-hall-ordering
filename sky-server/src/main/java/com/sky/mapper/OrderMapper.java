package com.sky.mapper;

import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface OrderMapper {

    /**
     * 向订单表插入一条数据
     * @param orders
     */
    void insert(Orders orders);

    /**
     *修改订单信息
     * @param orders
     */
    void update(Orders orders);

    /**
     * 根据订单号来查询订单
     * @param orderNumber
     * @return
     */
    @Select("select * from orders where number = #{orderNumber};")
    Orders getByNumber(String orderNumber);
}
