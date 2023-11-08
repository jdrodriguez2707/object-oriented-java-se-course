package model;

import java.time.LocalDate;

public interface ISchedulable {
    void schedule(LocalDate date, String time);
}
