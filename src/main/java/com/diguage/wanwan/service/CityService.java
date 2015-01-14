package com.diguage.wanwan.service;

import com.diguage.wanwan.dao.CityMapper;
import com.diguage.wanwan.entity.CityExample;
import com.diguage.wanwan.utils.data.Page;
import com.diguage.wanwan.utils.data.PageRequest;
import com.diguage.wanwan.entity.City;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p/>
 * Coder：D瓜哥，http://www.diguage.com/
 * <p/>
 * Date: 2014-12-17 22:52
 */
@Service
@Transactional
public class CityService {
    @Autowired
    private CityMapper cityDao;

    public Page<City> getCities(PageRequest pageRequest) {
        CityExample example = new CityExample();
        example.setOrderByClause(pageRequest.getSort().toString());

        return new Page<City>(cityDao.selectByExample(example),
                pageRequest,
                cityDao.countByExample(example));
    }
}
