package com.wen.smark.test;

import com.wen.smark.service.PackageInformationService;
import com.wen.smark.serviceimpl.PackageInformationImpService;

import java.util.*;

/**
 * Created by wen_toto on 2017/8/18.
 */

public class testMain {
    public static void main(String[] args){

        PackageInformationService packageInformationService = new PackageInformationImpService();

        Map<String, Object> map = new HashMap<String, Object>();

        map.put("minuteNumber", 200);
        map.put("messageNumber", 400);
        map.put("monthlyRent", 50.6);

        packageInformationService.sale(map);

        SortedMap<String, Object> sorteMap = new TreeMap<String, Object>();
        Map<String, Object> map2 = new LinkedHashMap<String, Object>();


        if(map2 ==  null){

        }
        map2.put("b", 244);
        map2.put("a", 400);
        map2.put("A", 500);

        System.out.println(map2);
        Map<String, Object> map1 = new TreeMap<String, Object>();

/*
        List<String> list = new ArrayList<String>();

        list.add("eds");
        list.add("ljk");
        list.add("aaj");

        Collections.sort(list);
        System.out.println(list);
        List<String> list1 = new ArrayList<String>(list.size());
        Collections.copy(list, list1);
        System.out.println(list1);
        int i = Collections.binarySearch(list1,"eds");
        System.out.println(i);
        */

        /*Map<String, Object> objectMap = new HashMap<String, Object>();

        objectMap.put("xiao", "肖世杰");
        objectMap.put("wen", "文盘东");
        int i = objectMap.hashCode();
        System.out.println(i);
        objectMap.clear();

        if (objectMap.isEmpty()){
            System.out.println(objectMap.size());
        }

        System.out.println(objectMap);
        */

/*
        Set<Map.Entry<String, Object>> setL = objectMap.entrySet();

        Iterator<Map.Entry<String, Object>> iterator = setL.iterator();

        int i = 0;
        while (iterator.hasNext()){
            System.out.println(i);
            i++;

            Map.Entry<String, Object> maa =  iterator.next();
            System.out.println(maa.getKey()+" "+maa.getValue());
        }

        Set<String> setKey = objectMap.keySet();
        Iterator<String> iteratorKey = setKey.iterator();

        if(setKey != null){
            System.out.println(setKey.size());
            System.out.println("setKey is null");
        }

        while (iteratorKey.hasNext()){
            System.out.println("key: "+iteratorKey.next());
        }
        */

    }


}
