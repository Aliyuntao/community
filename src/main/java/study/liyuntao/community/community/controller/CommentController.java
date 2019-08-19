package study.liyuntao.community.community.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import study.liyuntao.community.community.dto.CommentCreateDTO;
import study.liyuntao.community.community.dto.CommentDTO;
import study.liyuntao.community.community.dto.ResultDTO;
import study.liyuntao.community.community.enums.CommentTypeEnum;
import study.liyuntao.community.community.exception.CustomizeErrorCode;
import study.liyuntao.community.community.model.Comment;
import study.liyuntao.community.community.model.User;
import study.liyuntao.community.community.service.CommentService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 樱花抄
 * Date: 2019/7/3
 * Time: 13:50
 * Description: No Description
 */
@Controller
public class CommentController {
    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/comment", method = RequestMethod.POST)
    @ResponseBody
    public Object post(@RequestBody CommentCreateDTO commentCreateDTO,
                       HttpServletRequest request) {
        User user = (User)request.getSession().getAttribute("user");
        if(user == null){
          return ResultDTO.errorOf(CustomizeErrorCode.NO_LOGIN);
        }

        if(commentCreateDTO == null || StringUtils.isBlank(commentCreateDTO.getContent())){
            return ResultDTO.errorOf(CustomizeErrorCode.COMMENT_IS_EMPTY);
        }
        Comment comment = new Comment();
        comment.setParentId(commentCreateDTO.getParentId());
        comment.setType(commentCreateDTO.getType());
        comment.setContent(commentCreateDTO.getContent());
        comment.setGmtCreate(System.currentTimeMillis());
        comment.setGmtModified(System.currentTimeMillis());
        comment.setCommentator(user.getId());
        commentService.insert(comment,user);
        return ResultDTO.successOf();
    }

    @RequestMapping(value = "/comment/{id}", method = RequestMethod.GET)
    @ResponseBody
    public ResultDTO comments(@PathVariable(name = "id")Long id){
        List<CommentDTO> commentDTOS =  commentService.listByTargetId(id, CommentTypeEnum.COMMENT);

        return ResultDTO.successOf(commentDTOS);
    }
}
