public class Main {
    public static void main(String[] args) {

    }

    public static void ej1() {
        //Modelos vehículos (A)
        String modeloCoche = "Skoda Fabia";
        String modeloMoto = "Vespa GTS 310";
        String modeloPatinete = "Xiaomi 5 Pro";
        String modeloFurgoneta = "Mercedes-Benz Citan";

        //Número de plazas (B)
        int plazasCoche = 5;
        int plazasMoto = 2;
        int plazasPatinete = 1;
        int plazasFurgoneta = 3;

        //Precio por días (C)
        double precioCoche = 30.50;
        double precioMoto = 15.50;
        double precioPatinete = 10.0;
        double precioFurgoneta = 40.50;

        //Solución ejercicio
        System.out.println("Coche: " + modeloCoche + " (" + plazasCoche + " plazas)"
                            + " - " + precioCoche + " €/día");
        System.out.println("Moto: " + modeloMoto + " (" + plazasMoto + " plazas)"
                            + " - " + precioMoto + " €/día");
        System.out.println("Patinete: " + modeloPatinete + " (" + plazasPatinete + " plaza)"
                            + " - " + precioPatinete + " €/día");
        System.out.println("Furgoneta: " + modeloFurgoneta + " (" + plazasFurgoneta + " plazas)"
                            + " - " + precioFurgoneta + " €/día");

    }

    public static void ej2() {
        //Recordatorio precios por día de los vehículos
        double precioCoche = 30.50;
        double precioMoto = 15.50;
        double precioPatinete = 10.0;
        double precioFurgoneta = 40.50;

        //Vehículos alquilados en el día
        int cochesAlquilados = 20;
        int motosAlquiladas = 50;
        int patinetesAlquilados = 15;
        int furgonetasAlquiladas = 10;

        //Ingresos del día
        double ingresosCoche = cochesAlquilados * precioCoche;
        double ingresosMoto = motosAlquiladas * precioMoto;
        double ingresosPatinete = patinetesAlquilados * precioPatinete;
        double ingresosFurgoneta = furgonetasAlquiladas * precioFurgoneta;

        double ingresoTotal = ingresosCoche + ingresosMoto + ingresosPatinete + ingresosFurgoneta;

        //Solución ejercicio
        System.out.println("Ingresos totales: " + ingresoTotal + " €");

    }

    public static void ej3() {
        //Aplicar descuento del 15% por el alquiler de 10 furgonetas
        String modeloFurgoneta = "Mercedes-Benz Citan";
        int cantidad = 10;
        double precioFurgoneta = 40.50;
        double subtotal = cantidad * precioFurgoneta;
        int porcentajeDescuento = 15;
        double descuento = (porcentajeDescuento * subtotal) / 100;
        double total = subtotal - descuento;

        //Solución ejercicio
        System.out.println("Vehículo: " + modeloFurgoneta);
        System.out.println("Unidades: " + cantidad);
        System.out.println("Subtotal: " + subtotal + " €");
        System.out.println("Descuento: " + porcentajeDescuento + " %");
        System.out.println("Total: " + total + " €");
    }

    public static void ej4() {
        //Recordatorio precios por día de los vehículos
        double precioCoche = 30.50;
        double precioMoto = 15.50;
        double precioPatinete = 10.0;
        double precioFurgoneta = 40.50;

        //Cálculo del precio medio de los vehículos
        final int TIPOS = 4;
        double precioMedio = (precioCoche + precioMoto + precioPatinete + precioFurgoneta) / TIPOS;

        //Solución ejercicio
        System.out.println("Precio medio: " + precioMedio + " €");
    }

    public static void ej5() {
        //Vehículos alquilados en el día
        int coches = 20;
        int motos = 50;
        int patinetes = 15;
        int furgonetas = 10;
        int total = coches + motos + patinetes + furgonetas;

        //Porcentajes vehículos alquilados
        double porcentajeCoches = ((double) coches / total) * 100;
        double porcentajeMotos = ((double) motos / total) * 100;
        double porcentajePatinetes = ((double) patinetes / total) * 100;
        double porcentajeFurgonetas = ((double) furgonetas / total) * 100;

        //Solución ejercicio
        System.out.println("Total vehículos: " + total);
        System.out.println("Coches: " + porcentajeCoches + " %");
        System.out.println("Motos: " + porcentajeMotos + " %");
        System.out.println("Patinetes: " + porcentajePatinetes + " %");
        System.out.println("Furgonetas " + porcentajeFurgonetas + " %");

    }

}

