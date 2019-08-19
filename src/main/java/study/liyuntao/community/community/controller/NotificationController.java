package study.liyuntao.community.community.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import study.liyuntao.community.community.dto.NotificationDTO;
import study.liyuntao.community.community.enums.NotificationTypeEnum;
import study.liyuntao.community.community.model.User;
import study.liyuntao.community.community.service.NotificationService;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: 樱花抄
 * Date: 2019/8/16
 * Time: 8:28
 * Description: No Description
 */
@Controller
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/notification/{id}")
    public String profile(HttpServletRequest request,
                          @PathVariable(name = "id") Long id, Model model

    ) {
        User user = (User) request.getSession().getAttribute("user");
        if (user == null) {
            return "redirect:/";
        }


        NotificationDTO notificationDTO = notificationService.read(id, user);

        if (NotificationTypeEnum.REPLY_COMMENT.getType() == notificationDTO.getType()
                || NotificationTypeEnum.REPLY_QUESTION.getType() == notificationDTO.getType()) {

            return "redirect:/question/" + notificationDTO.getOuterid();
        } else {
            return "redirect:/";
        }

    }
}
