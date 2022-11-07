package com.haohao.user.service.ipml;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.haohao.user.dao.UserDao;
import com.haohao.user.service.UserService;
import com.domain.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceIpml implements UserService {

    @Autowired
    private UserDao userDao;

    public List<User> findAll() {
        return userDao.selectAll();
    }

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    @Override
    public User findById(Long id){
        return  userDao.selectByPrimaryKey(id);
    }


    /**
     * 增加
     * @param user
     */
    @Override
    public void add(User user){
        userDao.insert(user);
    }


    /**
     * 修改
     * @param user
     */
    @Override
    public void update(User user){
        userDao.updateByPrimaryKey(user);
    }

    /**
     * 删除
     * @param id
     */
    @Override
    public void delete(Long id){
        userDao.deleteByPrimaryKey(id);
    }

    /**
     * 条件查询
     * @param searchMap
     * @return
     */
    @Override
    public List<User> findList(Map<String, Object> searchMap){
        Example example = createExample(searchMap);
        return userDao.selectByExample(example);
    }

    /**
     * 分页查询
     * @param page
     * @param size
     * @return
     */
    @Override
    public Page<User> findPage(int page, int size){
        PageHelper.startPage(page,size);
        return (Page<User>)userDao.selectAll();
    }

    /**
     * 条件+分页查询
     * @param searchMap 查询条件
     * @param page 页码
     * @param size 页大小
     * @return 分页结果
     */
    @Override
    public Page<User> findPage(Map<String,Object> searchMap, int page, int size){
        PageHelper.startPage(page,size);
        Example example = createExample(searchMap);
        return (Page<User>)userDao.selectByExample(example);
    }

    /**
     * 构建查询对象
     * @param searchMap
     * @return
     */
    private Example createExample(Map<String, Object> searchMap){
        Example example=new Example(User.class);
        Example.Criteria criteria = example.createCriteria();
        if(searchMap!=null){
            // 相册名称
            if(searchMap.get("title")!=null && !"".equals(searchMap.get("title"))){
                criteria.andLike("title","%"+searchMap.get("title")+"%");
            }
            // 相册封面
            if(searchMap.get("image")!=null && !"".equals(searchMap.get("image"))){
                criteria.andLike("image","%"+searchMap.get("image")+"%");
            }
            // 图片列表
            if(searchMap.get("image_items")!=null && !"".equals(searchMap.get("image_items"))){
                criteria.andLike("image_items","%"+searchMap.get("image_items")+"%");
            }


        }
        return example;
    }

}
