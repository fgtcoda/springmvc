package com.itzhang.dao;

import com.itzhang.domian.Items;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemsDao {

    Items findById(Integer id);
}
