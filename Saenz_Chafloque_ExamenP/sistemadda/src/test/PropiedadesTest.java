package test;

import datos.PropiedadesDao;
import datos.impl.PropiedadesDaoImpl;
import dominio.Propiedades;

public class PropiedadesTest {

    public static void main(String[] args) {
        insertar();
    }
    private static void insertar(){
        PropiedadesDao datos = new PropiedadesDaoImpl();
        Propiedades obj = new Propiedades();
        obj.setNombre("Hola");
        obj.setDireccion("Hola");
        obj.setEstado("Hola");
        obj.setPrecioalquiler("Hola");
        System.out.println(datos.insertar(obj));
    }
} 
