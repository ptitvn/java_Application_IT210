package com.edupath.controller;

import com.edupath.model.Course;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/course")
public class CourseController {
    // Mock Data
    private static List<Course> listCourses = new ArrayList<>();

    static {
        listCourses.add(new Course("IELTS-6.5", "IELTS Breakthrough", "Lộ trình từ 5.0 lên 6.5 trong 6 tháng.", "Advanced", 8500000, 6, 20, true, LocalDate.of(2026, 5, 15)));
        listCourses.add(new Course("TOEIC-750", "TOEIC Mastery", "Tập trung giải đề và mẹo thi.", "Intermediate", 4500000, 3, 10, false, LocalDate.of(2026, 6, 1)));
        listCourses.add(new Course("COMM-01", "Giao tiếp cơ bản", "Học phát âm và phản xạ.", "Beginner", 3200000, 4, 0, false, LocalDate.of(2026, 4, 20)));
        listCourses.add(new Course("IELTS-INT", "IELTS Intermediate", "Nâng cao 4 kỹ năng.", "Intermediate", 6000000, 5, 15, false, LocalDate.of(2026, 7, 10)));
        listCourses.add(new Course("ENG-KIDS", "Tiếng Anh trẻ em", "Vừa học vừa chơi cho bé.", "Beginner", 2500000, 12, 5, false, LocalDate.of(2026, 5, 1)));
    }

    // Chức năng 2: Danh sách & Lọc khóa học
    @GetMapping("/list")
    public String list(
            @RequestParam(value = "level", required = false) String level,
            @RequestParam(value = "maxFee", required = false, defaultValue = "10000000") Double maxFee,
            Model model
    ) {
        List<Course> result = listCourses.stream()
                .filter(c -> (level == null || level.isEmpty() || c.getLevel().equalsIgnoreCase(level)))
                .filter(c -> c.getFee() <= maxFee)
                .collect(Collectors.toList());

        model.addAttribute("courses", result);
        return "course/list";
    }

    // Chức năng 3: Xem chi tiết lộ trình khóa học
    @GetMapping("/detail/{code}")
    public String detail(@PathVariable("code") String code, Model model) {
        Course course = listCourses.stream()
                .filter(c -> c.getCode().equals(code))
                .findFirst()
                .orElse(null);

        model.addAttribute("course", course);
        return "course/detail";
    }

    // CHỨC NĂNG 4: Mở form chỉnh sửa
    @GetMapping("/edit/{code}")
    public String editForm(@PathVariable("code") String code, Model model) {
        Course course = listCourses.stream()
                .filter(c -> c.getCode().equals(code))
                .findFirst()
                .orElse(null);
        if (course == null) {
            return "redirect:/course/list";
        }
        model.addAttribute("course", course);
        return "course/edit";
    }

    // CHỨC NĂNG 4: Xử lý lưu (PRG Pattern)
    @PostMapping("/update")
    public String update(@ModelAttribute("course") Course updatedCourse, RedirectAttributes ra) {
        for (int i = 0; i < listCourses.size(); i++) {
            if (listCourses.get(i).getCode().equals(updatedCourse.getCode())) {
                // Chỉ cho phép sửa Học phí và các thông tin cơ bản theo SRS
                listCourses.get(i).setFee(updatedCourse.getFee());
                listCourses.get(i).setName(updatedCourse.getName());
                break;
            }
        }
        ra.addFlashAttribute("success", "Cập nhật khóa học thành công!");
        return "redirect:/course/list";
    }

    // CHỨC NĂNG 5: Xóa có bẫy nghiệp vụ
    @PostMapping("/delete/{code}")
    public String delete(@PathVariable("code") String code, RedirectAttributes ra) {
        Course course = listCourses.stream()
                .filter(c -> c.getCode().equals(code))
                .findFirst()
                .orElse(null);

        if (course != null && course.getStudentCount() > 0) {
            // Bẫy nghiệp vụ: Có học viên thì không cho xóa
            ra.addFlashAttribute("error", "Không thể hủy khóa học đã có học viên đăng ký!");
        } else {
            listCourses.removeIf(c -> c.getCode().equals(code));
            ra.addFlashAttribute("success", "Đã xóa khóa học thành công.");
        }
        return "redirect:/course/list";
    }
}