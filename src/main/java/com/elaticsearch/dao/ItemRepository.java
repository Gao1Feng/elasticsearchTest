package com.elaticsearch.dao;

import com.elaticsearch.pojo.Item;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by Administrator on 2019/3/19.
 * @Param:
 * 	Item:为实体类
 * 	Long:为Item实体类中主键的数据类型
 */
public interface ItemRepository extends ElasticsearchRepository<Item,Long> {

    /**
     * @Description:根据价格区间查询
     * @Param price1
     * @Param price2
     */
    List<Item> findByPriceBetween(double price1, double price2);

}
