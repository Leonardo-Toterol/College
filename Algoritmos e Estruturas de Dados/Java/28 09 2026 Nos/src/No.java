public class No<T> {

    private T elemento;
    private No<T> proximo;

    public No(T elemento){
        this.elemento = elemento;
        this.proximo = null;
    }

    public No<T> getProximo() {
        return proximo;
    }

    public void setProximo(No<T> proximo) {
        this.proximo = proximo;
    }

    public T getElemento() {
        return elemento;
    }

}
