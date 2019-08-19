package study.liyuntao.community.community.mapper;



import study.liyuntao.community.community.dto.QuestionQueryDTO;
import study.liyuntao.community.community.model.Question;

import java.util.List;


public interface QuestionExtMapper {
    int incView(Question record);
    int incComment(Question record);
    List<Question> selectRelated(Question question);

    Integer countBySearch(QuestionQueryDTO query);

    List<Question> selectBySearch(QuestionQueryDTO query);
}