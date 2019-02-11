package com.epam.practise.unit1exercisesolutionjava7;

public enum EnumValues {
    SR(100),AI(90),ML(80);
    int value;
    EnumValues(int value){
        this.value = value;
    }

    public  int getValue() {
        return value;
    }
    public static void main(String[] args) {
        EnumValues[]  e = EnumValues.values();
        for (EnumValues s : e)
            System.out.println(s.getValue()

            );
        System.out.println(EnumValues.valueOf("100").equals(EnumValues.SR));
    }
}
