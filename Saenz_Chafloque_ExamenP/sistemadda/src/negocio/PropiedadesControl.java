package negocio;

import datos.impl.PropiedadesDaoImpl;
import dominio.Propiedades;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import datos.PropiedadesDao;

public class PropiedadesControl {

    private final PropiedadesDao DATOS;
    private Propiedades obj;

    public PropiedadesControl() {
        this.DATOS = new PropiedadesDaoImpl();
        this.obj = new Propiedades();
    }

    private DefaultTableModel modeloTabla;

    public DefaultTableModel listar(String texto) {
        List<Propiedades> lista = new ArrayList();
        lista.addAll(DATOS.listar(texto));
        //Establecemos la columna del tableModel
        String[] titulos = {"ID", "NOMBRE", "DIRECCION","ESTADO","PREIOALQUILER"};
        //Declaramos un vector que será el que agreguemos como registro al DefaultTableModel
        String[] registro = new String[5];
        //agrego los títulos al DefaultTableModel
        this.modeloTabla = new DefaultTableModel(null, titulos);
        //Recorrer toda mi lista y la pasare al DefaultTableModel
        for (Propiedades item : lista) {
            registro[0] = Integer.toString(item.getId());
            registro[1] = item.getNombre();
            registro[2] = item.getDireccion();
            registro[3] = item.getEstado();
            registro[4] = item.getPrecioalquiler();
            this.modeloTabla.addRow(registro);
        }
        return this.modeloTabla;
    }

    public String insertar(Propiedades obj) {
        if (DATOS.insertar(obj)) {
            return "OK";
        } else {
            return "Error en el ingreso de datos.";
        }
    }

    public String actualizar(Propiedades obj) {
        if (DATOS.actualizar(obj)) {
            return "OK";
        } else {
            return "Error en la actualización de datos.";
        }
    }

    public String eliminar(int id) {
        if (DATOS.eliminar(id)) {
            return "OK";
        } else {
            return "Error en la eliminación de datos.";
        }
    }
}
