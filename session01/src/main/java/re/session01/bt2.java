package re.session01;

public class bt2 {
    //    @Component
//    public class PlaySession {
//        private double playTime = 0;
//
//        public void addTime(double time) {
//            this.playTime += time;
//        }
//    }
    /*
* Trong Spring, nếu chỉ đánh dấu @Component mà không chỉ
* định gì thêm, Bean này sẽ có scope mặc định là Singleton.

Singleton nghĩa là: chỉ có một đối tượng duy nhất của PlaySession
* được tạo ra và toàn bộ hệ thống đều dùng chung đối tượng đó.

Vì vậy, khi máy số 01 nạp giờ, nó tăng playTime của Bean Singleton.
* Máy số 02 cũng đang dùng chung Bean này, nên giá trị
* playTime bị cộng dồn → dẫn đến hiện tượng tất cả máy trạm cùng bị trừ tiền.
    * */
}
