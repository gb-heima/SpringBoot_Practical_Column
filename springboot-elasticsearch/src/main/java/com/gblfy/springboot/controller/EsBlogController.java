package com.gblfy.springboot.controller;

import com.gblfy.springboot.domain.EsBlog;
import com.gblfy.springboot.repository.EsBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author gblfy
 * @ClassNme EsBlogController
 * @Description TODO
 * @Date 2019/3/5 14:17
 * @version1.0
 */
@RestController
@RequestMapping("/blogs")
public class EsBlogController {

    @Autowired
    private EsBlogRepository esBlogRepository;

    @GetMapping
    public List<EsBlog> list(
            @RequestParam(value = "title") String title,
            @RequestParam(value = "summary") String summary,
            @RequestParam(value = "content") String content,
            @RequestParam(value = "pageIndex", defaultValue = "0") int pageIndex,
            @RequestParam(value = "pageSize", defaultValue = "10") int pageSize) {
        Pageable pageable = new PageRequest(pageIndex, pageSize);
        Page<EsBlog> page = esBlogRepository.findDistinctByTitleContainingOrSummeryContainingOrContentContaining(title, summary, content, pageable);
        return page.getContent();
    }
    //访问链接：localhost:8080/blogs?title=思&summary=相思&content=相思&pageIndex=0&pageSize=10
}
