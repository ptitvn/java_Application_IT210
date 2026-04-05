package re.session01;

public class bt4 {
    //    1. Bối cảnh
//    Hệ thống cần gửi thông báo nạp tiền thành công cho khách hàng qua EmailSender và SmsSender.
//    Vấn đề là chọn cách Dependency Injection (DI) phù hợp nhất để đảm bảo hệ thống vừa ổn định vừa linh hoạt.
//
//   2. Hai giải pháp DI được phân tích
//    Constructor Injection
//
//    Field Injection
//
//3. Bảng so sánh
//    Tiêu chí	Constructor Injection	Field Injection
//    Cách tiêm	Tiêm qua constructor, bắt buộc truyền dependency khi khởi tạo
//    Tiêm trực tiếp vào biến bằng annotation (@Autowired)
//    Đảm bảo dependency	Luôn có dependency ngay khi tạo object, tránh null
//    Có thể null nếu container chưa inject hoặc inject lỗi
//    Khả năng test (Unit Test)	Dễ test – có thể mock và truyền dependency
//    khi khởi tạo	Khó test hơn – phải rely vào framework để inject
//    Tính rõ ràng	Rõ ràng, dễ thấy dependency nào cần thiết
//    Ít rõ ràng, dependency “ẩn” trong class
//    Khả năng mở rộng	Tốt – dễ thêm dependency mới qua constructor
//    Kém hơn – dễ gây khó khăn khi class phình to
//    Xử lý lỗi (ví dụ SMS đứt kết nối)	Có thể thay thế dependency bằng
//    mock hoặc fallback khi khởi tạo	Khó thay thế, vì dependency gắn chặt vào field
//
//4. Phân tích bẫy dữ liệu
//    Khi hệ thống SMS bị đứt kết nối:
//
//    Constructor Injection: dễ dàng thay thế SmsSender bằng mock hoặc fallback sender khi khởi tạo.
//
//    Field Injection: khó thay thế vì dependency đã được framework gắn trực tiếp vào field, ít linh hoạt.
//
//5. Kết luận
//    Constructor Injection là lựa chọn tối ưu trong bối cảnh này:
//
//    Đảm bảo dependency luôn có sẵn.
//
//    Dễ dàng test và mock khi SMS gặp sự cố.
//
//    Rõ ràng, minh bạch về các dependency mà service cần.

}
