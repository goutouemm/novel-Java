package com.haohao.content.service.ipml;

import com.haohao.content.dao.NovelDao;
import com.haohao.content.service.NovelService;
import com.domain.novel.Novel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NovelServiceIpml implements NovelService {

    @Autowired
    private NovelDao novelDao;

    public List<Novel> findAll() {
        return novelDao.selectAll();
    }

    /**
     * 根据ID查询
     * @param id
     * @return
     */
    public Novel findById(Long id){
        return  novelDao.selectByPrimaryKey(id);
    }


    /**
     * 增加
     * @param novel
     */
    public void add(Novel novel){
        novelDao.insert(novel);
    }


    /**
     * 修改
     * @param novel
     */
    public void update(Novel novel){
        novelDao.updateByPrimaryKey(novel);
    }

    /**
     * 删除
     * @param id
     */
    public void delete(Long id){
        novelDao.deleteByPrimaryKey(id);
    }

}