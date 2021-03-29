package cn.skill6.website.dao.mappers.article;

import cn.skill6.common.entity.po.article.ArticleCommentReply;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 评论回复mapper
 *
 * @author 何明胜 husen@hemingsheng.cn
 * @since 2019-09-01 02:20
 */
@Repository
public interface ArticleCommentReplyMapper {
    long insert(ArticleCommentReply articleCommentReply);

    List<ArticleCommentReply> selectAll();

    List<ArticleCommentReply> selectByParam(ArticleCommentReply articleCommentReply);
}
