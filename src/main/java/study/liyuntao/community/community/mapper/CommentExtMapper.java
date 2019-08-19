package study.liyuntao.community.community.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import study.liyuntao.community.community.model.Comment;
import study.liyuntao.community.community.model.CommentExample;

import java.util.List;

public interface CommentExtMapper {
    int incComment(Comment comment);
}