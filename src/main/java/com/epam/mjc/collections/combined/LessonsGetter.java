package com.epam.mjc.collections.combined;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {

        Set<String> lessons = new HashSet<>();

        for(Map.Entry<String, List<String>> entry : timetable.entrySet()) {

            List<String> list = entry.getValue();

            for(String lessons1 : list) {

                lessons.add(lessons1);

            }

        }

        return lessons;

    }
}
