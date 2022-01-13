package org.sibadi;

import org.sibadi.staff.Staff;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public record Schedule(LocalDate date, Staff staff, int hours) {
    private static final List<Schedule> scheduleLine = new ArrayList<>();

    public Schedule {
        scheduleLine.add(this);
    }

    protected void finalize() throws Throwable {
        scheduleLine.remove(this);
    }

    public static List<Schedule> getScheduleLine() {
        return scheduleLine;
    }

    public LocalDate getDate() {
        return date;
    }

    public Staff getStaff() {
        return staff;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public String toString(){
        return staff + " " + date + " " + hours;
    }
}