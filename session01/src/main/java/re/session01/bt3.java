package re.session01;

public class bt3 {

//    1. Dữ liệu đầu vào (Input)
//    Tên món ăn: ví dụ "Mì xào bò".
//
//    Tên tài khoản hội viên: username.
//
//    Số dư tài khoản: lấy từ UserAccountRepository.
//
//    Số lượng món ăn trong kho: lấy từ InventoryRepository.
//
//    Giá món ăn: lưu trong kho hoặc bảng giá.
//
//    2. Kết quả mong đợi (Output)
//    Trường hợp thành công:
//
//    Hệ thống trừ tiền trong tài khoản.
//
//    Giảm số lượng món trong kho.
//
//    Trả về thông báo "Đặt món thành công".
//
//    Trường hợp lỗi:
//
//    Nếu món ăn hết hàng → "Xin lỗi, món ăn đã hết".
//
//    Nếu số dư không đủ → "Số dư không đủ".
//
//     3. Kiến trúc phần mềm (Loose Coupling + DI)
//      OrderFoodService: lớp nghiệp vụ chính, không tự tạo repository mà nhận qua Dependency Injection.
//
//      InventoryRepository: quản lý dữ liệu kho.
//
//      UserAccountRepository: quản lý dữ liệu tài khoản.
//
//      IoC Container (ApplicationContext): chịu trách nhiệm khởi tạo và inject các repository vào service.
//
//      Nhờ DI, OrderFoodService không bị gắn chặt với một repository cụ thể, dễ dàng thay đổi hoặc mở rộng.
//
//    4. Các bước xử lý logic
//    Nhận yêu cầu đặt món từ khách hàng (username + món ăn).
//
//    Kiểm tra kho qua InventoryRepository:
//
//    Nếu số lượng = 0 → trả về "Món ăn đã hết".
//
//    Kiểm tra số dư tài khoản qua UserAccountRepository:
//
//    Nếu số dư < giá món → trả về "Số dư không đủ".
//
//    Nếu cả hai điều kiện đều hợp lệ:
//
//    Trừ số dư tài khoản.
//
//    Giảm số lượng món trong kho.
//
//    Trả về "Đặt món thành công".

}
