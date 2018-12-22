package com.itzhang.service.impl;

import com.itzhang.dao.ItemsDao;
import com.itzhang.domian.Items;
import com.itzhang.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ItemsServiceImpl")
public class ItemsServiceImpl implements ItemsService {

    @Autowired
    private ItemsDao dao;

    public Items findById(Integer id) {
        return dao.findById(id);
    }
}
