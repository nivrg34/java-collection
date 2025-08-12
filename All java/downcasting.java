class raj {
    void country() {
        System.out.println("Raj lives in Belbari-11, Morang");
    }
}

class staff extends raj {
    void country() {
        System.out.println("Raj lives in Nepal");
    }

    void id() {
        System.out.println("ID : 13322A2");
    }
}

public class downcasting {
    public static void main(String[] args) {
        raj r = new staff();   // upcasting
        r.country();           // calls overridden method in staff

        staff s = (staff) r;   // downcasting
        s.id();                // subclass method
    }
}
