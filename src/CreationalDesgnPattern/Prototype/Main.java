package CreationalDesgnPattern.Prototype;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        /**
         * En car1 se implementa la clase CarImp1
         */
        CarImp1 car1 = new CarImp1();
        car1.brand = "BMW";
        car1.model = "X6";
        car1.doors = 4;

        System.out.println(car1);

        CarImp1 clonCar1 = car1.setClone();
        System.out.println(clonCar1);
        clonCar1.model = "X5";
        System.out.println(clonCar1);

        /**
         * En car2 se implementa la interfas Cloneable que al igual que la primera opción permite
         * clonar los atributos, metodos y estados de otro objeto y utulizarlo como una
         * plantilla, la diferencua esta en que al implementar no hay que detallar todos los atributos
         * de la clase.
         */
        CarImp2 car2 = new CarImp2();
        car2.brand = "Toyota";
        car2.model = "Prado";
        car2.doors = 4;
        System.out.println(car2);

        try {
            CarImp2 clonCar2 = car2.setClone();
            clonCar2.doors = 2;
            System.out.println(clonCar2);

        }catch (CloneNotSupportedException e) {
            System.out.println("No se puede clonar " + e.getMessage());
        }
    }
}
