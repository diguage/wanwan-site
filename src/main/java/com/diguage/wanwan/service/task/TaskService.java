/*******************************************************************************
 * Copyright (c) 2005, 2014 springside.github.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *******************************************************************************/
package com.diguage.wanwan.service.task;

import com.diguage.wanwan.entity.Task;
import com.diguage.wanwan.utils.data.Page;
import com.diguage.wanwan.utils.data.Sort;
import com.diguage.wanwan.dao.TaskMapper;
import com.diguage.wanwan.utils.data.PageRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

// Spring Bean的标识.
@Service
// 类中所有public函数都纳入事务管理的标识.
@Transactional
public class TaskService {

    @Autowired
    private TaskMapper taskDao;

    public Task getTask(Integer id) {
        return taskDao.selectByPrimaryKey(id);
    }

    public void saveTask(Task entity) {
        taskDao.insertSelective(entity);
    }

    public void deleteTask(Integer id) {
        taskDao.deleteByPrimaryKey(id);
    }

    public List<Task> getAllTask() {
        return (List<Task>) taskDao.selectByExample(null);
    }

    public Page<Task> getUserTask(Integer userId, Map<String, Object> searchParams, int pageNumber, int pageSize,
                                  String sortType) {
        PageRequest pageRequest = buildPageRequest(pageNumber, pageSize, sortType);

//        return taskDao.findAll(spec, pageRequest);
        return new Page<Task>(taskDao.selectByExample(null),
                pageRequest,
                taskDao.countByExample(null));
    }

    /**
     * 创建分页请求.
     */
    private PageRequest buildPageRequest(int pageNumber, int pagzSize, String sortType) {
        Sort sort = null;
        if ("auto".equals(sortType)) {
            sort = new Sort(Sort.Direction.DESC, "id");
        } else if ("title".equals(sortType)) {
            sort = new Sort(Sort.Direction.ASC, "title");
        }

        return new PageRequest(pageNumber - 1, pagzSize, sort);
    }
}
