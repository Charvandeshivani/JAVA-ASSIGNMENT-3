class RBI {
    void sbi() {
        System.out.println("The SBI Interest is 7%");
    }
}

class ROI extends RBI {
    @Override
    void sbi() {
        System.out.println("The SBI Interest is 15%");
    }
}

class Overriding {
    public static void main(String[] args) {
        RBI r = new RBI();   // Parent class object
        r.sbi();             // Calls RBI's method

        RBI r2 = new ROI();  // Parent reference but child object
        r2.sbi();            // Calls ROI's overridden method
    }
}
