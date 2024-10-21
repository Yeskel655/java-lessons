package lesson4;

public class main3 {
    public static void main(String[] args) throws InterruptedException {
        // Напишем таймер с максимальным временем рабрим временем - 3 года если его не выключать
        // дынный таймер доложен постоянно печатать на консоль сколько времени
        // проошло от старта
        for (int year = 0; year < 3; year++) {
            for (int month = 0; month < 12; month++) {
                for (int day = 0; day < 30; day++) {
                    for (int hour = 0; hour < 24; hour++) {
                        for (int min = 0; min < 60; min++) {
                            for (int sec = 0; sec < 60; sec++) {
                                Thread.sleep(1000);
                                System.out.printf("Прошло: %d года %d месяца %d дней %d часов %d минут %d секунд\n", year, month, day,hour, min, sec);
                            }
                        }
                    }
                }
            }
        }
    }
}
