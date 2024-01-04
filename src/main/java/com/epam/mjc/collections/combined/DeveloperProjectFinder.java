package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {

        List<String> list = new LinkedList<>();

        int check = 0;

        for(Map.Entry<String, Set<String>> entry : projects.entrySet()) {

            check = 0;

            String key = entry.getKey();

            Set<String> set = entry.getValue();

            for(String str : set) {

                if(developer.equals(str)) {

                    check = 1;

                }

            }


            if( check == 1 ) { list.add(key); }

        }

        ListComparator comparator = new ListComparator();

        list.sort(comparator.thenComparing(Comparator.reverseOrder()));

        return list;

    }


    class ListComparator implements Comparator<String> {
        @Override
        public int compare(String a, String b) {

            if ( a.length() > b.length() ) {

                return -1;

            } else if( a.length() < b.length()) {

                return 1;

            } else   {

                return 0;

            }

        }
    }
}
