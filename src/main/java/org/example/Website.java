package org.example;

import java.util.*;

public class Website {
    Hashtable<String, Integer> hashTable;

    public Website() {
        hashTable = new Hashtable<>();
    }
    public void visit(String ip) {
        int ref = 0;
        try {
            ref = hashTable.get(ip);
        } catch (Exception ex) {
            hashTable.put(ip, 1);
        }
        hashTable.put(ip, ref+1);
    }

    public void traverse() {

        Enumeration<String> e = hashTable.keys();

        while (e.hasMoreElements()) {

            // Getting the key of a particular entry
            String key = e.nextElement();

            // Print and display the Rank and Name
            System.out.println("Rank : " + key
                    + "\t\t Name : "
                    + hashTable.get(key));
        }
    }

    public void traverseSort() {

        TreeMap<String, Integer> tm
                = new TreeMap<String, Integer>(this.hashTable);

        // create a keyset
        Set<String> keys = tm.keySet();
        Iterator<String> itr = keys.iterator();

        // traverse the TreeMap using iterator
        while (itr.hasNext()) {
            String s = itr.next();
            System.out.println(s + " " + tm.get(s));
        }
    }

    public void top(int limit) {
        List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(hashTable.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){

            public int compare(Map.Entry<String, Integer> entry1, Map.Entry<String, Integer> entry2) {
                return entry2.getValue().compareTo( entry1.getValue() );
            }

        });

        Map<String, Integer> mapSortedByValues = new LinkedHashMap<String, Integer>();

        if (list.size()<=limit)
            for( Map.Entry<String, Integer> entry : list ){
                mapSortedByValues.put(entry.getKey(), entry.getValue());
            }
        else
            for( Map.Entry<String, Integer> entry : list.subList(0,limit)  ) {
                mapSortedByValues.put(entry.getKey(), entry.getValue());
            }

        System.out.println("size: " + String.valueOf(mapSortedByValues.size()));
        System.out.println("Map sorted by values: " + mapSortedByValues);

    }
}
