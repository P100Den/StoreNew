package accesssystem;

import java.util.ArrayList;
import java.util.List;

public class ServiceShop {

    private final StaffShop STAFFSHOPS_1 = new StaffShop("Никита Абрамов", "14524", "продавец-консультант");
    private final StaffShop STAFFSHOPS_2 = new StaffShop("Дима Маслиников", "16814", "мерчендайзер");
    private final StaffShop STAFFSHOPS_3 = new StaffShop("Александр Александрович", "19344", "хостесс");
    private final StaffShop STAFFSHOPS_4 = new StaffShop("Иван Попов", "17314", "доставщик");
    private final StaffShop STAFFSHOPS_5 = new StaffShop("Евгений Сидоров", "12974", "кассир ");


    private List<StaffShop> staffShops = List.of(STAFFSHOPS_1, STAFFSHOPS_2,STAFFSHOPS_3,STAFFSHOPS_4,STAFFSHOPS_5);

    private List<Integer>apass = new ArrayList<>();
    private List<StaffShop> apassToStaffShop = new ArrayList<StaffShop>();




    public int giveMeNumberId(String openTheTurnstile, String idnumber){
        int newApassNumber = apass.size();
        apass.add(newApassNumber);
        apassToStaffShop.add(newApassNumber, getStaffShopsById(idnumber));



    return newApassNumber;
    }

    private StaffShop getStaffShopsById(String idnumber) {
        for (StaffShop currentStaffShop:staffShops) {
            if (currentStaffShop!= null && currentStaffShop.getId().equals(idnumber))
                return currentStaffShop;

        }
        return null;
    }

    public List<StaffShop> getStaffShops() {
        return staffShops;
    }

    public List<Integer> getApass() {
        return apass;
    }

    public List<StaffShop> getApassToStaffShop() {
        return apassToStaffShop;
    }
}

