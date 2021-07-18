package bai_4.bài_tap.stopwatch;
import java.time.LocalTime;

/*Trường startTime và endTime là private với phương thức getter để trả về giá trị của startTime và endTime.

        Phương thức khởi tạo không tham số khởi tạo startTime với thời gian hiện tại của hệ thống.

        Phương thức start() để reset startTime về thời gian hiện tại của hệ thống.

        Phương thức stop() để thiết đặt endTime về thời gian hiện tại của hệ thống.

        Phương thức getElapsedTime() trả về thời gian đã trôi qua theo số milisecond giây

        Vẽ sơ đồ UML cho lớp StopWatch và cài đặt lớp.

        Viết chương trình đo thời gian thực thi của thuật toán sắp xếp chọn (selection sort) cho 100,000 số.*/

public class StopWatch {
    private LocalTime startTime;
    private LocalTime endTime;

    public StopWatch() {
        startTime = LocalTime.now();
    }
    public StopWatch(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }
    public LocalTime getStartTime() {
        return startTime;
    }
    public LocalTime getEndTime() {
        return endTime;
    }
    public void start() {
        startTime = LocalTime.now();
    }
    public void end() {
        endTime = LocalTime.now();
    }
    public int getElapsedTime() {
        int milliSecond = ((endTime.getHour()- startTime.getHour())*3600 +
                (endTime.getMinute()-startTime.getMinute()*60 +
                        (endTime.getSecond()-startTime.getSecond()*1000)));
        return milliSecond;
    }
}

