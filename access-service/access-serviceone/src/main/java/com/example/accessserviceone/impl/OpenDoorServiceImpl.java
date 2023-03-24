package com.example.accessserviceone.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.accessapi.api.OpenDoorService;
import com.example.accessserviceone.mapper.OpenDoorMapper;
import com.example.commonutils.po.OpenDoor;
import org.springframework.stereotype.Service;

/**
* @author Administrator
* @description 针对表【open_door】的数据库操作Service实现
* @createDate 2023-03-23 16:47:32
*/
@Service
public class OpenDoorServiceImpl extends ServiceImpl<OpenDoorMapper, OpenDoor>
    implements OpenDoorService {

}




