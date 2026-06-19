public class Main {

    public static void main(String[] args) {

        TelefoneCelular celular = new TelefoneCelular();

        celular.setMarca("Iphone");
        celular.setModelo("Iphone 17");
        celular.setCor("Branco");
        celular.setArmazenamento(200);
        celular.setPreco(5000);

        System.out.println("Marca: " + celular.getMarca());
        System.out.println("Modelo: " + celular.getModelo());
        System.out.println("Cor: " + celular.getCor());
        System.out.println("Armazenamento: " + celular.getArmazenamento() + " GB");
        System.out.println("Preço: R$ " + celular.getPreco());
    }
}