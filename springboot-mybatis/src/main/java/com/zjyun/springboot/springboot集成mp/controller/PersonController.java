package com.zjyun.springboot.springboot集成mp.controller;

import com.zjyun.springboot.springboot集成mp.service.IPersonService;
import com.zjyun.springboot.springboot集成mp.service.impl.Person2ServiceImpl;
import com.zjyun.springboot.springboot集成mp.service.impl.PersonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author 王子健
 * @since 2024-07-26
 */
@RestController
@RequestMapping("/person")
public class PersonController {

    /**
     * 使用Map指定
     */
    @Autowired
    private Map<String, IPersonService> personServiceMap;

    /**
     * 使用Resource 指定
     */
    @Resource(type = PersonServiceImpl.class)
    private IPersonService person1;

    @Resource(type = Person2ServiceImpl.class)
    private IPersonService person2;

    /**
     * 使用Qualifier
     */
    @Autowired
    @Qualifier("person2ServiceImpl")
    private IPersonService person3;
}
