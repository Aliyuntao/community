package study.liyuntao.community.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import study.liyuntao.community.community.dto.QuestionDTO;
import study.liyuntao.community.community.service.QuestionService;

/**
 * Created with IntelliJ IDEA.
 * User: 樱花抄
 * Date: 2019/7/2
 * Time: 13:45
 * Description: No Description
 */
@Controller
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/question/{id}")
    public String question(@PathVariable(name = "id") Integer id, Model model) {
        QuestionDTO questionDTO = questionService.getById(id);
        model.addAttribute("question", questionDTO);
        return "question";
    }
}
