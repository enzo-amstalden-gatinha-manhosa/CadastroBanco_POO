package Objetos;

public class cliente extends pessoa {
    @Override
    public void gravar() {
        System.out.println("Gravando cliente");
    }

    @Override
    public void editar() {
        System.out.println("Editando cliente");
    }
}
