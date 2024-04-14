package gossip_personal;

public class Nodo {
	private int num_id;//cada nodo tendrá un identificador en especifico.
    private int estado; //los que van a infectarse y los que van a estar sanos.
    //SE CREA CONSTRUCTOR PARA INICIALIZAR EL NODO.
    public Nodo(int num_id,int estado) {
        this.num_id = num_id;
        this.estado = estado;
    }
    public int getnum_id() {
        return num_id;
    }
    public int getEstado() {
        return estado;
    }
    public void setEstado(int estado) {
        this.estado = estado;
    }

}
