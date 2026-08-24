
void main() {

    Bateria bateria = new Bateria(60, 4000);
    Celular celular = new Celular("Samsung", "S22", bateria);

    celular.carregarCelular();
    celular.usarCelular(100);

    celular.carregarCelular();
    celular.carregarCelular(20);

    celular.usarCelular(-10);

    celular.usarCelular(90);

    System.out.println(celular);


}