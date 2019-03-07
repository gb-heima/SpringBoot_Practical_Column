package com.gblfy.springboot.repository;

import com.gblfy.springboot.domain.EsBlog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * @author gblfy
 * @ClassNme EsBlogRepository 接口
 * @Description TODO
 * @Date 2019/2/28 9:59
 * @version1.0
 */
public interface EsBlogRepository extends ElasticsearchRepository<EsBlog, String> {

    /**
     * 分页查询博客(去重)
     *
     * @param title
     * @param summary
     * @param content
     * @param pageable
     * @return
     */
    Page<EsBlog> findDistinctByTitleContainingOrSummeryContainingOrContentContaining(String title, String summary, String content, Pageable pageable);
}
