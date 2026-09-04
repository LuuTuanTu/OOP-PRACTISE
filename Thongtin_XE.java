package DK_XE;

import java.util.Scanner;

public class Thongtin_XE {
    private String owner;
    private String type;
    private double value;
    private int cc;

    public Thongtin_XE() {
        this.owner = "unknown";
        this.type = "unknown";
        this.value = 0;
        this.cc = 0;
    }

    public Thongtin_XE(String owner, String type, double value, int cc) {
        setOwner(owner);
        setType(type);
        setValue(value);
        setCc(cc);
    }

    public String getOwner() { return owner; }
    public void setOwner(String owner) { this.owner = owner; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getValue() { return value; }
    public void setValue(double value) { this.value = value; }

    public int getCc() { return cc; }
    public void setCc(int cc) { this.cc = cc; }

l 
    public double Tax(int cc, double value) {
        if (cc < 100) {
            return value * 1 / 100;
        } else if (cc >= 100 && cc <= 200) {
            return value * 3 / 100;
        } else {
            return value * 5 / 100;
        }
    }

    public static void main(String[] args) {
        Thongtin_XE xe1 = new Thongtin_XE("Ronaldo", "Ba gac", 1000000, 300);
        
        System.out.println("Owner\t\tType\t\tValue\t\tCC");
        
        System.out.printf("%s\t\t%s\t\t%.1f\t%d\n", xe1.getOwner(), xe1.getType(), xe1.getValue(), xe1.getCc());
        
    
        double x = xe1.Tax(xe1.getCc(), xe1.getValue());
        System.out.println("Thue: " + x);
    }
}
