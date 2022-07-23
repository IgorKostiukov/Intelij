package com.syntax.class29;

import java.util.*;

class repl {
    public static void main(String[] args){
        List<Map<String,Object>> datalist = new ArrayList<>();

        Map<String,Object> apple = new LinkedHashMap<>();
        datalist.add(apple);
        apple.put("Items","Apple");
        apple.put("Price",20.00);
        apple.put("Quantity",10);
        Map<String,Object> orange = new LinkedHashMap<>();
        datalist.add(orange);
        orange.put("Items", "Orange");
        orange.put("Price", 21.99);
        orange.put("Quantity", 10);

        String key="";
        Object value;
        double subTotal=0;
        double price=0;
        Integer quantity=0;
        double total=0;
        for (Map<String,Object> i :datalist ){
            Set<String> keys=i.keySet();
            Collection<Object> values=i.values();
            Iterator <String> it1=keys.iterator();
            Iterator <Object> it2=values.iterator();
            while (it1.hasNext()){
                key=it1.next();
                value=it2.next();
                if(key.equals("Price")){
                    price= (double) value;
                }
                if(key.equals("Quantity")){
                    quantity= (Integer) value;
                    subTotal= price*quantity;
                }

            System.out.print(key+":"+value+" ");

            }
            System.out.println("Subtotal: "+subTotal);
            total+=subTotal;

        }
        System.out.println("Your purchase total: "+total);

    }

}

