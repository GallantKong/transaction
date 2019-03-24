package org.gallant.spring.transaction.manager;

import javax.annotation.Resource;
import org.gallant.spring.transaction.entity.GallantOrder;
import org.gallant.spring.transaction.mapper.GallantOrderMapper;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author kongyong
 * @date 2019/3/16
 */
@Component
public class GallantOrderManager {

    @Resource
    private GallantOrderMapper gallantOrderMapper;

    @Transactional(rollbackFor = Exception.class)
    public boolean insert(GallantOrder gallantOrder) {
        return gallantOrderMapper.insertSelective(gallantOrder) > 0;
    }

    @Transactional(rollbackFor = Exception.class)
    public boolean save(GallantOrder gallantOrder) {
        return gallantOrderMapper.insertSelective(gallantOrder) > 0;
    }

}
