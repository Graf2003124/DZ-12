public class App {
    public static void main(String[] args) {
        Author Esenin = new Author("Sergey", "Esenin");
        Author Tolstoy = new Author("Lev", "Tolstoy");
        Book VoinaIMir = new Book("VoinaIMir", Tolstoy, 1860);
        Book PismoKJenjene = new Book("PismoKJenjene", Esenin, 2012);
        VoinaIMir.setYearOfPublishing(1867);
        System.out.println(VoinaIMir);
        System.out.println(PismoKJenjene);
    }
}