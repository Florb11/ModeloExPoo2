import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Proyecto proyecto1 = new Proyecto();

        String[] menu = {"Crear proyecto","Agregar etapa","Revisr proyecto","Ver etapas","Salir"};
        int opcion = 0;
        do {
            opcion = JOptionPane.showOptionDialog(null, "Elija una opción","Menu", JOptionPane.DEFAULT_OPTION, 0, new ImageIcon(Main.class.getResource("/img/conts.png")), menu, menu[0]);
            switch (opcion) {
                case 0:
                    if (proyecto1.getNombre().equals("No asignado")) {
                        JOptionPane.showMessageDialog(null, "Creando proyecto");
                        proyecto1.registrarProyecto();
                    } else {
                        JOptionPane.showMessageDialog(null, "El proyecto ya esta creado");
                    }

                    break;
                case 1:
                    if (proyecto1.getNombre().equals("No asignado")) {
                        JOptionPane.showMessageDialog(null, "Todavía no se creó un proyecto");
                    } else {
                        proyecto1.evaluarEtapas();
                    }


                    break;
                case 2:
                    if (proyecto1.getNombre().equals("No asignado")) {
                        JOptionPane.showMessageDialog(null, "Todavía no se creó un proyecto");
                    } else {
                        JOptionPane.showMessageDialog(null, proyecto1);
                    }



                    break;
                case 3:
                    if (proyecto1.getNombre().equals("No asignado")) {
                        JOptionPane.showMessageDialog(null, "Todavía no se creó un proyecto");
                    } else {
                        JOptionPane.showMessageDialog(null, proyecto1.getEtapas());
                    }break;

                case 4:
                    JOptionPane.showMessageDialog(null, "A bueno adios master", "fsdf", JOptionPane.DEFAULT_OPTION , null);
                    break;
            }

        } while (opcion!=4);


    }

    }
