package com.haohao.user.service;


import com.github.pagehelper.Page;
import com.domain.user.User;

import java.util.List;
import java.util.Map;

public interface UserService {

    /***
     * 查询所有
     * @return
     */
    List<User> findAll();

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    User findById(Long id);

    /***
     * 新增
     * @param user
     */
    void add(User user);

    /***
     * 修改
     * @param User
     */
    void update(User User);

    /***
     * 删除
     * @param id
     */
    void delete(Long id);

    /***
     * 多条件搜索
     * @param searchMap
     * @return
     */
    List<User> findList(Map<String, Object> searchMap);

    /***
     * 分页查询
     * @param page
     * @param size
     * @return
     */
    Page<User> findPage(int page, int size);

    /***
     * 多条件分页查询
     * @param searchMap
     * @param page
     * @param size
     * @return
     */
    Page<User> findPage(Map<String, Object> searchMap, int page, int size);


}
