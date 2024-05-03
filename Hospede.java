public class Hospede {
    private String nome;
    private int hospedeID;
    private Hotel hotel;
    private Recepcionista recepcionista;

    public Hospede(String nome, int hospedeID, Hotel hotel, Recepcionista recepcionista) {
        this.nome = nome;
        this.hospedeID = hospedeID;
        this.hotel = hotel;
        this.recepcionista = recepcionista;
    }

    public void sairApasseio() {
        System.out.println(nome + " saindo a passeio.");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getHospedeID() {
        return hospedeID;
    }

    public void setHospedeID(int hospedeID) {
        this.hospedeID = hospedeID;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Recepcionista getRecepcionista() {
        return recepcionista;
    }

    public void setRecepcionista(Recepcionista recepcionista) {
        this.recepcionista = recepcionista;
    }
}
