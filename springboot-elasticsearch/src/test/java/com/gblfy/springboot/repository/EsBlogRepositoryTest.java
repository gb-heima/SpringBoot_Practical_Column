package com.gblfy.springboot.repository;

import com.gblfy.springboot.SpringbootElasticsearchApplicationTests;
import com.gblfy.springboot.domain.EsBlog;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public class EsBlogRepositoryTest extends SpringbootElasticsearchApplicationTests {

    @Autowired
    private EsBlogRepository esBlogRepository;

    @Before
    public void initRepositoryData() {
        //清除的所有数据
        esBlogRepository.deleteAll();

        esBlogRepository.save(new EsBlog("1", " 登鹳雀楼",
                "王之涣之登鹳雀楼", "白日依山尽，黄河入海流。欲穷千里目，更上一层楼"));
        esBlogRepository.save(new EsBlog("2", "相思",
                "王维的相思", "红豆生南国，春来发几枝。愿君多采撷，此物最相思"));
        esBlogRepository.save(new EsBlog("3", "静夜思",
                "李白的静夜思", "床前明月光，疑是地上霜。举头望明月，低头思故乡"));
    }

    @Test
    public void testFindDistinctByTitleContainingOrSummeryContainingOrContentContaining() {
        System.out.println("==============案例一=================");
        Pageable pageable = new PageRequest(0, 20);
        String title = "思";
        String summary = "相思";
        String content = "相思";
        Page<EsBlog> page = esBlogRepository.findDistinctByTitleContainingOrSummeryContainingOrContentContaining(title, summary, content, pageable);

        System.out.println("-------------start");
        for (EsBlog esBlog : page.getContent()) {
            System.out.println(esBlog.toString());
        }
        System.out.println("-------------end");
    }
}