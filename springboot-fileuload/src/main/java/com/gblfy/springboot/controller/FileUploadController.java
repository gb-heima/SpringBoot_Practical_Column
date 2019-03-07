package com.gblfy.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author gblfy
 * @ClassNme springboot 处理文件上传
 * @Description TODO
 * @Date 2019/2/21 8:31
 * @version1.0
 */
@RestController//表示该类下的返回值会自动做json格式的转换
public class FileUploadController {

    /**
     * 处理文件上传
     */
    @RequestMapping("/fileUploadController")
    public Map<String,Object> fileUpload(MultipartFile fileName)throws Exception{
        //打印文件名
        System.out.println(fileName.getOriginalFilename());
        //将文件保存到本地的路径 及文件名
        fileName.transferTo(new File("e:/"+fileName.getOriginalFilename()));
        //如果上传成功 会提示ok  json格式 @RestController注解会处理
        Map<String,Object> map = new HashMap<>();
        map.put("msg","ok");
        return map;
    }
}
