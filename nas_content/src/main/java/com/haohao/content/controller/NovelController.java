package com.haohao.content.controller;


import com.haohao.content.service.NovelService;
import com.haohao.content.service.UserService;
import com.domain.novel.Novel;
import entity.Result;
import entity.StatusCode;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@Slf4j
@RequestMapping("/novel")
public class NovelController {

    @Autowired
    private NovelService novelService;

    @Autowired
    private UserService userService;

    /**
     * 查询全部数据
     * 接口：
     *  地址：http://localhost:10087/novel
     *  请求方式：get
     *  请求类型：List集合
     * 响应：
     *  code：200 message: 成功 data: NovelList
     */
    @GetMapping
    public Result findAll() {
        List<Novel> NovelList = novelService.findAll();
        return new Result(true, StatusCode.OK, "查询成功", NovelList);
    }

    /***
     * 根据ID查询数据
     * @param id
     * @return
     */
    @GetMapping("/{id}")
    public Result findById(@PathVariable Long id){
        Novel novel = novelService.findById(id);
//        User user = userService.findByUid(id);
        return new Result(true,StatusCode.OK,"查询成功",novel);
    }

    /***
     * 新增数据
     * @param novel
     * @return
     */
    @PostMapping
    public Result add(@RequestBody Novel novel){
        novelService.add(novel);
        return new Result(true,StatusCode.OK,"添加成功");
    }

    /***
     * 修改数据
     * @param novel
     * @param id
     * @return
     */
    @PutMapping(value="/{id}")
    public Result update(@RequestBody Novel novel,@PathVariable Long id){
        novel.setId(id);
        novelService.update(novel);
        return new Result(true,StatusCode.OK,"修改成功");
    }

    /***
     * 根据ID删除用户
     * @param id
     * @return
     */
    @DeleteMapping(value = "/{id}" )
    public Result delete(@PathVariable Long id){
        novelService.delete(id);
        return new Result(true,StatusCode.OK,"删除成功");
    }

}
