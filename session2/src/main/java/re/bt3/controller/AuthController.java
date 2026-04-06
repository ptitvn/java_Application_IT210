package re.bt3.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AuthController {

    @GetMapping("/login")
    public String showLogin() {
        return "login";
    }

    @PostMapping("/login")
    public String doLogin(String username, String password,
                          HttpSession session, Model model) {
        if(("admin".equals(username) && "admin123".equals(password)) ||
                ("staff".equals(username) && "staff123".equals(password))) {
            session.setAttribute("loggedUser", username);
            session.setAttribute("role", username.equals("admin") ? "Quản trị" : "Nhân viên");
            return "redirect:/orders";
        } else {
            model.addAttribute("errorMessage", "Sai tài khoản hoặc mật khẩu!");
            return "login";
        }
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/login";
    }
}
