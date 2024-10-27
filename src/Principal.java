public class Principal {
        public static void main(String[] args){
            Automovil bmw = new Automovil("BMW");

            //bmw.setMarca("BMW");
            bmw.setModelo("320 i");
            bmw.setColor("Negro");
            bmw.setCilindraje(2000);

            System.out.println("Detalle = " + bmw.verDetalle());

            System.out.println("");

            Automovil bmw2 = new Automovil("Mercedes", "ML200");
            //bmw2.setMarca("BMW");
            //bmw2.setModelo("iX");
            bmw2.setColor("Blanco");
            bmw2.setCilindraje(2500);

            System.out.println("Detalle = " + bmw2.verDetalle());

            System.out.println("");
            System.out.println(bmw == bmw2);
            System.out.println(bmw.equals(bmw2));//Comparar 2 objetos

        }
    }

