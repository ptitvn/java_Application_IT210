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
//    Tiêu chí	|Constructor Injection	        | Field Injection

//    Cách tiêm	| Tiêm qua constructor,         | Tiêm trực tiếp vào biến
//              |bắt buộc truyền                |  bằng annotation (@Autowired)
//              | dependency khi khởi tạo       |
//
//    Đảm bảo   | 	Luôn có dependency ngay khi |   Có thể null nếu container
//    dependency|   tạo object, tránh null      |   chưa inject hoặc inject lỗi
//
//    Khả năng  | Dễ test – có thể mock và      | Khó test hơn – phải rely vào framework để inject
//    test (Unit|truyền dependency khi khởi tạo |
//    Test)
//
// Tính rõ ràng | Rõ ràng, dễ thấy dependency   |   Ít rõ ràng, dependency “ẩn” trong class
//   	        |  nào cần thiết
//
//Khả năng      | Tốt – dễ thêm dependency mới qua | Kém hơn – dễ gây khó khăn khi class phình to
//   mở rộng    | constructor mới qua constructor  |
//
//    Xử lý lỗi |	Có thể thay thế dependency bằng|    Khó thay thế, vì dependency gắn chặt vào field
// (ví dụ SMS   |mock hoặc fallback khi khởi tạo   |
// đứt kết nối) |                                  |
//
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
