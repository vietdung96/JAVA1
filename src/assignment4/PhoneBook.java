package assignment4;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone{
    public ArrayList<PhoneNumber> PhoneList;

    public PhoneBook(){
        PhoneList = new ArrayList<>();
    }
    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber p : PhoneList){
            // if(p.getName() == name) tuong duong voi cau duoi
            if(p.getName().equals(name)){
                if(p.getPhone().contains(phone)){
                    System.out.println("Liên lạc này đã tồn tại ");
                    return;
                }
                // co ten ma chua co so
                p.getPhone().add(phone);
                System.out.println("Đã thêm số  " +phone+ " vào liên lạc có sẵn");
                return;
            }
        }
//        // neu ma khong co
//        ArrayList<String> newPhone = new ArrayList<>();
//        newPhone.add(phone);
        PhoneNumber pn = new PhoneNumber(name,phone);
        PhoneList.add(pn);
        System.out.println("Đã thêm  " +name+ " vào liên lạc ");

    }

    @Override
    public void removePhone(String name) {
        for (PhoneNumber p : PhoneList){
            if(p.getName().equals(name)){
                PhoneList.remove(p);
            }
        }
        // giong cach tren
//        for (int i = 0;i < PhoneList.size();i++){
//            if (PhoneList.get(i).getName().equals(name)){
//                PhoneList.remove(i);
//            }
//            }


    }

    @Override
    public void updatePhone(String name, String oldPhone, String newPhone) {
        for (PhoneNumber p : PhoneList){
            if(p.getName().equals(name)){
                p.getPhone().remove(oldPhone);
                p.getPhone().add(newPhone);
            }
        }

    }

    @Override
    public PhoneNumber searchPhone(String name) {
        for (PhoneNumber p : PhoneList){
            if (p.getPhone().equals(name)){
                return p;
            }
        }
        return null;

    }

    @Override
    public void sort() {
        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
            @Override
            public int compare(PhoneNumber o1, PhoneNumber o2) {
                return o1.getName().compareTo(o2.getName());
             //   return 0;
            }
        });
    }
}
