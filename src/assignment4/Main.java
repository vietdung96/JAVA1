package assignment4;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
            PhoneBook pb = new PhoneBook();
            pb.insertPhone("Nam","09987654321");
            pb.insertPhone("Nam","09987654322");
            pb.insertPhone("Nam","09987654321");
            pb.insertPhone("Dungx","09987654321");
            pb.insertPhone("Tuan Anh","09987654321");
            System.out.println(pb.PhoneList.size());
            pb.updatePhone("Tuan Anh","09987654321","037789921");
            PhoneNumber p = pb.searchPhone("Nam");
            if(p !=null){
                System.out.println(p.getName());
            }else{
                System.out.println("Not found");
            }
        pb.sort();
        for(PhoneNumber pn: pb.PhoneList){
            System.out.println(pn.getName());
        }
    }
}
