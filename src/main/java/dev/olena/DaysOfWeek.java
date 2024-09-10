package dev.olena;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DaysOfWeek {

    private List<String> daysOfWeek;

    public DaysOfWeek() {
        this.daysOfWeek = new ArrayList<>();
        createDaysOfWeek();
    }

    public void createDaysOfWeek() {
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");
    }

    public List<String> getDaysOfWeek() {
        return new ArrayList<>(daysOfWeek);
    }

    public int getNumberOfDays() {
        return daysOfWeek.size();
    }

    public void removeDay(String day) {
        daysOfWeek.remove(day);
    }

    public String getRequestedDay(int index) {
        if (index >= 0 && index < daysOfWeek.size()) {
            return daysOfWeek.get(index);
        } 
        return null;
    }

    public boolean dayExists(String day) {
        return daysOfWeek.contains(day);
    }

    public void sortDaysAlphabetically() {
        Collections.sort(daysOfWeek);
    }

    public void clearDaysOfWeek() {
        daysOfWeek.clear();
    }
}
