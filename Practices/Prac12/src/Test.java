public class Test {
    public static void main(String[] args) {
        //Task1
        Person p = new Person();
        System.out.println(p.getName());
        //Task2
        Address address = new Address();
        address.AddressSepByC("Россия,Москва,Москва,Манежная,2,10,1");
        System.out.println(address.toString());
        address.AddressSepByG("Россия.Москва.Москва.Манежная.2.10.1");
        System.out.println(address.toString());
        address.AddressSepByG("Россия/Москва/Москва/Манежная/2/10/1");
        System.out.println(address.toString());
        address.AddressSepByG("Россия-Москва-Москва-Манежная-2-10-1");
        System.out.println(address.toString());
        address.AddressSepByG("Россия;Москва;Москва;Манежная;2;10;1");
        System.out.println(address.toString());
        //Task3
        String[] shirts = new String[11];
        shirts[0] = "S001,Black Polo Shirt,Black,XL";
        shirts[1] = "S002,Black Polo Shirt,Black,L";
        shirts[2] = "S003,Blue Polo Shirt,Blue,XL";
        shirts[3] = "S004,Blue Polo Shirt,Blue,M";
        shirts[4] = "S005,Tan Polo Shirt,Tan,XL";
        shirts[5] = "S006,Black T-Shirt,Black,XL";
        shirts[6] = "S007,White T-Shirt,White,XL";
        shirts[7] = "S008,White T-Shirt,White,L";
        shirts[8] = "S009,Green T-Shirt,Green,S";
        shirts[9] = "S010,Orange T-Shirt,Orange,S";
        shirts[10] = "S011,Maroon Polo Shirt,Maroon,S";

        Shirt[] newShirts = new Shirt[11];
        for (int i = 0; i<shirts.length;i++) {
            newShirts[i] = new Shirt(shirts[0]);
            System.out.println(newShirts[i].toString());
        }
        //Task4
        Telephone telephone = new Telephone("89175655655");
        System.out.println(telephone.getFormattedNumber());
    }
}
