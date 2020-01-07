package com.cto.edu.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// 测试ArrayList删除元素
public class ArrayListRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("beijing");
        list.add("shanghai");
        list.add("shanghai");
        list.add("guangzhou");
        list.add("shenzhen");
        list.add("hangzhou");
//        remove11(list, "shanghai");
//        remove12(list, "shanghai");
//        remove13(list, "shanghai");
        remove14(list, "shanghai");

    }

    private static void print(List<String> list){
        for (String item : list) {
            System.out.println("元素值：" + item);
        }
    }

    /*
     * 错误
     */
    public static void remove11(List<String> list, String target){
        int size = list.size();
        for(int i = 0; i < size; i++){
            String item = list.get(i);
            if(target.equals(item)){
                list.remove(item);
            }
        }
        print(list);
    }
    
    /*
     * 错误
     */
    public static void remove12(List<String> list, String target){
        for(String item : list){
            if(target.equals(item)){
                list.remove(item);
            }
        }
        print(list);
    }
    
    /*
     * 强烈推荐使用Iterator，保证正确
     */
    public static void remove13(List<String> list, String target){
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String item = iter.next();
            if (item.equals(target)) {
                iter.remove();
            }
        }
        print(list);
    }
    
    /*
     * 正确
     */
    public static void remove14(List<String> list, String target){
        for(int i = list.size() - 1; i >= 0; i--){
            String item = list.get(i);
            if(target.equals(item)){
            	// List 删除元素的逻辑是将目标元素之后的元素往前移一个索引位置，最后一个元素置为 null，同时 size - 1
                list.remove(item);
            }
        }
        print(list);
    }
    
}